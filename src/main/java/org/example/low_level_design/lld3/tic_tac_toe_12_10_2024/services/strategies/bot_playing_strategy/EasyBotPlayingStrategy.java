package org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.services.strategies.bot_playing_strategy;

import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.models.*;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy {
   @Override
   public Move botMove (Board board) {
	  for(List<Cell> cells : board.getBoard ()){
		 for(Cell cell : cells){
			if (cell.isEmpty ()){
			   return new Move (null, cell);
			}
		 }
	  }
	  return null;
   }
}
