package com.github.dyumell.spring_di.plainjava.setterinjection;

public class Broadcast {
    // 필드 로드시 생성자 호출 및 의존성 제어 수행
    // 필드로 의존성을 주입하기 위해서, 생성자에서 의존성 있는 Stage 객체를 생성하지 않는다.
    private Stage stage;
    public void setStage(Stage stage) {
        System.out.println("Stage is ready");
        this.stage = stage;
    }
    // setter 로 필드에 접근

    public Broadcast() {
        System.out.println("Broadcast is ready");
    }

    public void continueBroadcasting() {
        System.out.println("Broadcasting...");
    }
    public void startBroadcasting() {
        stage.performance();
    }
}