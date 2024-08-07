package org.example.low_level_design.lld2.class3_factory.assignments.audio_player;

public class Client {
   public static void main (String[] args) {
	  demoAudioPlayer ();
   }

   private static void demoAudioPlayer () {
		MediaFormat mediaFormat=MediaFormat.MP3;
		int volume=50;
		double playbackRate=100;

	  AudioPlayer audioPlayer = AudioPlayerFactory.getPlayer (mediaFormat, volume,playbackRate);

		audioPlayer.play();
	  System.out.println (audioPlayer.supportsType ());


	  System.out.println ("debug");

   }
}
