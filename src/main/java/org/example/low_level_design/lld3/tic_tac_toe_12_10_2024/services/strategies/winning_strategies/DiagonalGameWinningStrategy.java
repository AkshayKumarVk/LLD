package org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.services.strategies.winning_strategies;

import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.models.Board;
import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.models.Move;
import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class DiagonalGameWinningStrategy implements GameWinningStrategy {
   private final Map<Symbol, Integer> leftDiagonalMap = new HashMap<> ();
   private final Map<Symbol, Integer> rightDiagonalMap = new HashMap<> ();


   @Override

   public boolean isWinning (Board board, Move move) {
	  int row = move.getCell ().getRow ();
	  int column = move.getCell ().getColumn ();

	  Symbol symbol = move.getPlayer ().getSymbol ();

	  if (row == column) {
		 if (!leftDiagonalMap.containsKey (symbol)) {
			leftDiagonalMap.put (symbol, 1);
		 } else {
			leftDiagonalMap.put (symbol, leftDiagonalMap.get (symbol) + 1);
		 }

		 return leftDiagonalMap.get (symbol) == board.getSize ();
	  }

	  if (row + column == board.getSize ()) {

		 if (!rightDiagonalMap.containsKey (symbol)) {
			rightDiagonalMap.put (symbol, 1);
		 } else {
			rightDiagonalMap.put (symbol, rightDiagonalMap.get (symbol) + 1);
		 }

		 return rightDiagonalMap.get (symbol) == board.getSize ();
	  }
	  return false;
   }
}
