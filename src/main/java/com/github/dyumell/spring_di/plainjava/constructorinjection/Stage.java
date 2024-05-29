package com.github.dyumell.spring_di.plainjava.constructorinjection;

public class Stage {
    private Singer singer;

    public Stage(Singer singer) {
        System.out.println("Singer "+ singer.getName() +" has been arrived");
        this.singer = singer;
    }

    public void perform() {
        singer.sing();
    }
}