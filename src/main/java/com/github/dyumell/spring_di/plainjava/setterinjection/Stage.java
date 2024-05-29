package com.github.dyumell.spring_di.plainjava.setterinjection;

public class Stage {
    // 필드 로드시 의존성 해결
    // 필드로 의존성을 주입하기 위해서, 생성자에서 의존성 있는 Singer 객체를 생성하지않는다.
    private Singer singer;
    public void setSinger(Singer singer) {
        System.out.println("Singer "+ singer.getName() +" has been arrived");
        this.singer = singer;
    }
    // setter 로 필드에 접근

    public Stage() {
        System.out.println("Stage is ready");
    }

    public void performance() {
        singer.sing();
    }
}