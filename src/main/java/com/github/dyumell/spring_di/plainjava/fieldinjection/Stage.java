package com.github.dyumell.spring_di.plainjava.fieldinjection;

public class Stage {
    // 필드 로드시 의존성 해결
    // 필드로 의존성을 주입하기 위해서, 생성자에서 의존성 있는 Singer 객체를 생성하지않는다.
    // 필드를 불러오기 위해 public 으로 선언
    public Singer singer;

    public Stage() {
        System.out.println("Stage is ready");
    }

    public void performance() {
        singer.sing();
    }
}