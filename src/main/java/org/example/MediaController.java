package org.example;

public class MediaController implements Playable{
    public void playMedia(Playable media){
        media.play();
    };

    @Override
    public void play() {
        System.out.println("Play a song");
    }
}
