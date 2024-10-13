package org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.services.strategies.winning_strategies;

import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.models.Board;
import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.models.Move;

public class RowWinningStrategy implements WinningStrategy{
   @Override
   public boolean checkWinning (Board board, Move move) {
	  return false;
   }
}
