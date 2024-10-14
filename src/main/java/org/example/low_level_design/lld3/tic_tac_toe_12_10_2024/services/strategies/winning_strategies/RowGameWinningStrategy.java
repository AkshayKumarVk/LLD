package org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.services.strategies.winning_strategies;

import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.models.Board;
import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.models.Move;
import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class RowGameWinningStrategy implements GameWinningStrategy {

   private final Map<Integer, Map<Symbol, Integer>> rowMap = new HashMap<> ();

   @Override
   public boolean isWinning (Board board, Move move) {
	  int row = move.getCell ().getRow ();
	  Symbol symbol = move.getPlayer ().getSymbol ();

	  if (!rowMap.containsKey (row)) {
		 rowMap.put (row, new HashMap<> ());
	  }

	  Map<Symbol, Integer> currentRowSymbolMap = rowMap.get (row);

	  if (!currentRowSymbolMap.containsKey (symbol)) {
		 currentRowSymbolMap.put (symbol, 1);
	  } else {
		 currentRowSymbolMap.put (symbol, currentRowSymbolMap.get (symbol) + 1);
	  }

	  return currentRowSymbolMap.get (symbol) == board.getSize ();
   }

}
