package org.example.low_level_design.lld2.class3_factory.assignments.audio_player;

public class AudioPlayerFactory {

   public static AudioPlayer getPlayer (MediaFormat mediaFormat, int volume, double playbackRate) {
	  if (mediaFormat.equals (MediaFormat.FLAC)) {
		 return new FLACPlayer (volume, playbackRate);
	  }
	  if (mediaFormat.equals (MediaFormat.MP3)) {
		 return new MP3Player (volume, playbackRate);
	  }
	  if (mediaFormat.equals (MediaFormat.WAV)) {
		 return new WAVPlayer (volume, playbackRate);
	  }
	  return null;
   }


}