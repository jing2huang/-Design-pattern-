package com.j2h.command;

//���������ɫ����������
public class PlayCommand implements Command {

    private AudioPlayer myAudio;
    
    public PlayCommand(AudioPlayer audioPlayer){
        myAudio = audioPlayer;
    }

    @Override
    public void execute() {
        myAudio.play();
    }

}