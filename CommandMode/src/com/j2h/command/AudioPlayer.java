package com.j2h.command;

//接收者角色：音频播放器
public class AudioPlayer {
    
    public void play(){
        System.out.println("播放...");
    }
    
    public void rewind(){
        System.out.println("倒带...");
    }
    
    public void stop(){
        System.out.println("停止...");
    }
}