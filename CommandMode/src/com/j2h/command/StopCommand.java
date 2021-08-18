package com.j2h.command;

//¾ßÌåÃüÁî½ÇÉ«£ºÍ£Ö¹ÃüÁî
public class StopCommand implements Command {
    private AudioPlayer myAudio;
    
    public StopCommand(AudioPlayer audioPlayer){
        myAudio = audioPlayer;
    }
    @Override
    public void execute() {
        myAudio.stop();
    }

}