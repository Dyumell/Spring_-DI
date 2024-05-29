package com.github.dyumell.spring_di.plainjava.setterinjection;

public class Singer { // Singer 는 의존성이 불필요
    private String name;
    private String song;

    public String getName(){
        return name;
    }
    public Singer(String name, String song) {
        this.name = name;
        this.song = song;
    }

    public void sing() {
        System.out.println(name + " is singing " + song);
    }
}