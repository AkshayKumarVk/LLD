package org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.models;

import lombok.Getter;
import lombok.Setter;
import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.exceptions.UnknownDifficultyLevelException;
import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.services.factories.BotPlayingStrategyFactory;
import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.services.strategies.bot_playing_strategy.BotPlayingStrategy;

@Getter
@Setter

public class Bot extends Player {

   private BotDifficultyLevel botDifficultyLevel;
   private BotPlayingStrategy botPlayingStrategy;

   public Bot (String name, Symbol symbol, BotDifficultyLevel botDifficultyLevel) throws
		   UnknownDifficultyLevelException {
	  super (name, symbol, PlayerType.BOT);
	  this.botDifficultyLevel = botDifficultyLevel;
	  this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy (botDifficultyLevel);
   }

   @Override
   public Move makeMove (Board board) {
	  Move botMove = botPlayingStrategy.botMove (board);
	  botMove.setPlayer (this);
	  return botMove;
   }
}
