package com.github.dyumell.spring_di.plainjava.noinjection;

public class Stage {
    private Singer singer;

    public Stage() {
        System.out.println("Stage is ready");
        this.singer = new Singer("Beyonce", "Texas Hold'Em");
    }

    public void perform() {
        singer.sing();
    }
}