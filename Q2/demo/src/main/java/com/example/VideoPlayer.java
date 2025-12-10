package com.example;

public class VideoPlayer implements Playable {

    @Override
    public void play() {
        System.out.println("Rendering video pixels...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping video...");
    }
}
