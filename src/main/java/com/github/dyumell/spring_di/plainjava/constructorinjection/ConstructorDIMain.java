package com.github.dyumell.spring_di.plainjava.constructorinjection;

public class ConstructorDIMain {
    public static void main(String[] args) {
        Singer singer = new Singer("Beyonce", "Texas Hold'Em");
        Stage stage = new Stage(singer);
        Broadcast broadcast = new Broadcast(stage);
        broadcast.startBroadcasting();
        broadcast.continueBroadcasting();
    }
}