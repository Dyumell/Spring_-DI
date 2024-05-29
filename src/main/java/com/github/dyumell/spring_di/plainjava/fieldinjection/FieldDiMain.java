package com.github.dyumell.spring_di.plainjava.fieldinjection;

public class FieldDiMain {
    public static void main(String[] args) {
        Broadcast broadcast = new Broadcast(); // 제일 추상적인 객체
        broadcast.stage = new Stage(); // 필드로 의존성 주입
        broadcast.stage.singer = new Singer("IU", "Love wins all"); // 필드로 의존성 주입
        broadcast.startBroadcasting();
        // 메인 클래스에서 의존성을 전부 해결함
        // 하지만 필드를 public 으로 선언한 것은 캡슐화에 위배됨.
    }
}