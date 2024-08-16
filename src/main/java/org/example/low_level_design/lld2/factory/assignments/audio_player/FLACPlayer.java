package org.example.low_level_design.lld2.factory.assignments.audio_player;

public class FLACPlayer extends AudioPlayer{
//    private int volume;
//    private double playBackRate;

    public FLACPlayer(int volume, double playBackRate) {
//        this.volume = volume;
	   super (volume, playBackRate);
//        this.playBackRate = playBackRate;
    }

    public void play() {
        // Simulate playing audio in FLAC format
        // Each media format will have its own implementation
        System.out.println("Playing FLAC audio");
    }

    public void pause() {
        // Simulate pausing audio in FLAC format
        // Each media format will have its own implementation
        System.out.println("Pausing FLAC audio");
    }

    public void stop() {
        // Simulate stopping audio in FLAC format
        // Each media format will have its own implementation
        System.out.println("Stopping FLAC audio");
    }



    public MediaFormat supportsType() {
        return MediaFormat.FLAC;
    }
}