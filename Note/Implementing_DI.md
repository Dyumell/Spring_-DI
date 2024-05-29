# Dependency Inversion

## 클래스들 간의 의존성 제어 구현

### 의존성
Ex) 자동차 게임의 `drive` 동작 구현 개발에서,
1. `drive` 동작은 플레이어 `Driver`가 자동차 `Car`을 조종하는 것
    -> `drive` 동작을 위해 `Driver`가 필요하다
    -> `Driver`은 `Car`에 의존한다.
<br><br>
2.  자동차 `Car`에는 타이어 `Tire`가 달려 있어야 함
    <br> -> `Car`는 `Tire`에 의존한다.
    
즉  `drive`->`Driver`->`Car`->`Tire` 순서로 의존한다.<br>
-> 이것을 의존 순서 그대로 구현하면,
    큰 요소가 작은 요소에, <u>즉 추상적인 것이 구체적인 것에 의존하게 된다.</u>
<br>
=> 하지만 Spring 에서는 의존 방식을 반대로 바꾸어서
작은 요소가 큰 요소에, 추상적인 방식으로 의존하고 싶다.
<br>

###  `의존성 제어`구현
`Driver`에게는 `Car`이 필요하다.-> 언제 어디서 생성해서 어떻게 `Driver`에게 인도할 것인가?
<br> `Car`을 위해서 `Tire`가 필요하다. -> 언제 어디서 생성해서 어떻게 `Car`에 장착할 것인가?
<br>  
**Spring framework** 없이  Plain Java 코드로 의존성 제어를 구현해보자.    
* 음악 방송 App 개발하기 : `Singer`, `Stage`, `Broadcast`  

  `Broadcasting` 을 위해서 `Stage` 위에 `Singer` 가 공연을 해야 한다.  
  즉, `Broadcast` → `Stage` → `Singer` 순서로 의존한다.

1. 각 객체가 `직접` 의존성 제어  
   직접 의존 구조에서는 각각의 객체가 직접 의존 대상 객체를 생성한다
    ![no_injection_chart.png](/img%2Fno_injection_chart.png)  <br><br>
2. `필드(속성) 주입`을 통한 의존 제어  
`필드(속성) 주입` 의존 구조에서는 객체에 선언된 필드에 의존 대상 객체를 직접 할당해 주입  
 의존성을 주입할 필드를 public 으로 선언한 것은 캡슐화에 위배됨 
<br>
<br>
3. `수정자 주입`을 통한 의존 제어 (**Setter Injection**)  
`수정자 주입` 의존 구조에서는 객체에 선언된 setter 메서드를 호출해 의존 객체를 주입
![FieldDI.png](/img%2FFieldDI.png)<br><br>
4. `생성자 주입`을 통한 의존  
`생성자 주입` 의존 구조에서는 객체 생성 시 생성자에 의존 대상 객체를 주입
 ![ConstructorDI.png](/img%2FConstructorDI.png)

보통은 생성자 주입이 많은 장점을 제공하기 때문에 권장되어, 객체의 상태를 안정적으로 유지하고 테스트하기 쉽게 만든다.