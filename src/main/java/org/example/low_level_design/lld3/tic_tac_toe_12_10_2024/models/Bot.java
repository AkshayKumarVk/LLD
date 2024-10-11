package org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Bot extends  Player{

   private BotDifficultyLevel botDifficultyLevel;

   public Bot (String name, Symbol symbol,BotDifficultyLevel botDifficultyLevel) {
	  super (name, symbol, PlayerType.BOT);
	  this.botDifficultyLevel = botDifficultyLevel;
   }
}
