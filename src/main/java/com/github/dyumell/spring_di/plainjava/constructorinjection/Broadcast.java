package com.github.dyumell.spring_di.plainjava.constructorinjection;

public class Broadcast {
    // Broadcast needs a stage to make a video of singer's performance
    private Stage stage;

    public Broadcast(Stage stage) {
        this.stage = stage;
    }

    public void startBroadcasting() {
        System.out.println("Start Broadcasting the performance...");
        stage.perform();
    }

    public void continueBroadcasting() {
        System.out.println("Broadcasting...");
    }
}