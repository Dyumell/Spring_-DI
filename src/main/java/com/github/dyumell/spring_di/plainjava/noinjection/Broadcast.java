package com.github.dyumell.spring_di.plainjava.noinjection;

public class Broadcast {
    // Broadcast needs a stage to make a video of singer's performance
    private Stage stage;

    public Broadcast() {
        this.stage = new Stage();
    }

    public void startBroadcasting() {
        System.out.println("Start Broadcasting the performance...");
        stage.perform();
    }

    public void continueBroadcasting() {
        System.out.println("Broadcasting...");
    }

    public static void broadcastBySelfDependency() {
        Broadcast broadcast = new Broadcast();
        broadcast.startBroadcasting();
        broadcast.continueBroadcasting();
    }
}