package org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.services.factories;

import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.exceptions.UnknownDifficultyLevelException;
import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.models.BotDifficultyLevel;
import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.services.strategies.bot_playing_strategy.BotPlayingStrategy;
import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.services.strategies.bot_playing_strategy.EasyBotPlayingStrategy;
import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.services.strategies.bot_playing_strategy.HardBotPlayingStrategy;
import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.services.strategies.bot_playing_strategy.MediumBotPlayingStrategy;

public class BotPlayingStrategyFactory {
	public static BotPlayingStrategy getBotPlayingStrategy (BotDifficultyLevel difficultyLevel) throws UnknownDifficultyLevelException{
//	   if (difficultyLevel.equals (BotDifficultyLevel.EASY)) {
//		  return new EasyBotPlayingStrategy ();
//	   } else if (difficultyLevel.equals (BotDifficultyLevel.MEDIUM)) {
//		  return new MediumBotPlayingStrategy ();
//	   } else if (difficultyLevel.equals (BotDifficultyLevel.HARD)) {
//		  return new HardBotPlayingStrategy ();
//	   }
	   return switch(difficultyLevel){
		  case EASY -> new EasyBotPlayingStrategy ();
		  case MEDIUM -> new MediumBotPlayingStrategy ();
		  case HARD -> new HardBotPlayingStrategy ();
		  default -> throw new UnknownDifficultyLevelException ("Unknown difficulty level: " + difficultyLevel);
	   };
   }
}
