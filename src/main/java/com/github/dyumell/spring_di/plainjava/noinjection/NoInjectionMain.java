package com.github.dyumell.spring_di.plainjava.noinjection;

public class NoInjectionMain {
    public static void main(String[] args) {
        // 어떠한 주입도 없이 각 객체 내부에서 의존 대상 생성 수행
        Broadcast.broadcastBySelfDependency();
    }
}