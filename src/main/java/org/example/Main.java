package org.example;

public class Main {
    public static void main(String[] args) {
        VideoPlayer videoPlayer = new VideoPlayer();
        MusicPlayer musicPlayer = new MusicPlayer();
        MediaController mediaController = new MediaController();
        mediaController.playMedia(musicPlayer);
        mediaController.playMedia(videoPlayer);
         }
    }