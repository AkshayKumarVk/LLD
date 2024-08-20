package org.example.low_level_design.lld3.tictactoe.models;

public class Bot extends Player {
   private BotDifficultyLevel difficultyLevel;

   public Bot (String name, Symbol symbol, BotDifficultyLevel difficultyLevel) {
	  super (name, symbol, PlayerType.BOT);
	  this.difficultyLevel = difficultyLevel;
   }
}
