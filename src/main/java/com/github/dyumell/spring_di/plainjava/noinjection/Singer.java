package com.github.dyumell.spring_di.plainjava.noinjection;

public class Singer {
    private String name;
    private String song;

    public Singer(String name, String song) {
        System.out.println("Singer "+ name +" has been arrived");
        this.name = name;
        this.song = song;
    }

    public void sing() {
        System.out.println(name + " is singing " + song);
    }
}