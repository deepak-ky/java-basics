package com.advanced_1;

public class Song implements Playable{

    public void play(String songName){
        System.out.println("playing the song : " + songName);
    }
}
