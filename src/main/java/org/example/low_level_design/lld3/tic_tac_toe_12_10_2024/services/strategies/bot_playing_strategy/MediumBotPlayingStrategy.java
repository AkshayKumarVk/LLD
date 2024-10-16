package org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.services.strategies.bot_playing_strategy;

import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.models.Board;
import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.models.Cell;
import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.models.Move;

public class MediumBotPlayingStrategy implements BotPlayingStrategy{
   @Override
   public Move botMove (Board board) {
	  int row, column;

	  do{
		 row = (int) (Math.random () * board.getSize ());
		 column = (int) (Math.random () * board.getSize ());

	  }while (!board.getBoard ().get(row).get (column).isEmpty ());

	  return new  Move(null, new Cell (row,column));
   }
}
