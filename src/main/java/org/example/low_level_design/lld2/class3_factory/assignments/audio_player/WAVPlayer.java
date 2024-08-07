package org.example.low_level_design.lld2.class3_factory.assignments.audio_player;

public class WAVPlayer extends AudioPlayer {
//   private int volume;
//   private final double playBackRate;

   public WAVPlayer (int volume, double playBackRate) {
//	  this.volume = volume;
//	  this.playBackRate = playBackRate;
	  super (volume, playBackRate);
   }

   public void play () {
	  // Simulate playing audio in WAV format
	  // Each media format will have its own implementation
	  System.out.println ("Playing WAV audio");
   }

   public void pause () {
	  // Simulate pausing audio in WAV format
	  // Each media format will have its own implementation
	  System.out.println ("Pausing WAV audio");
   }

   public void stop () {
	  // Simulate stopping audio in WAV format
	  // Each media format will have its own implementation
	  System.out.println ("Stopping WAV audio");
   }


   public MediaFormat supportsType () {
	  return MediaFormat.WAV;
   }
}