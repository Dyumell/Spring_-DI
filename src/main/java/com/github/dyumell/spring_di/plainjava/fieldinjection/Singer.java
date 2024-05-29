package com.github.dyumell.spring_di.plainjava.fieldinjection;

public class Singer { // Singer 는 의존성이 불필요
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