package org.example.low_level_design.lld2.factory.assignments.audio_player;

public class MP3Player extends AudioPlayer {
//   private final double playBackRate;
//   private int volume;

   public MP3Player (int volume, double playBackRate) {
	  super(volume,playBackRate);
   }

   @Override
   public void play () {
	  // Simulate playing audio in FLAC format
	  // Each media format will have its own implementation
	  System.out.println ("Playing MP3 audio");
   }

   public void pause () {
	  // Simulate pausing audio in FLAC format
	  // Each media format will have its own implementation
	  System.out.println ("Pausing MP3 audio");
   }

   public void stop () {
	  // Simulate stopping audio in FLAC format
	  // Each media format will have its own implementation
	  System.out.println ("Stopping MP3 audio");
   }


   @Override
   public MediaFormat supportsType () {
	  return MediaFormat.MP3;
   }
}