package org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.services.strategies.winning_strategies;

import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.models.Board;
import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.models.Move;
import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class ColumnGameWinningStrategy implements GameWinningStrategy {

   private Map<Integer, Map<Symbol, Integer>> columnMap = new HashMap<> ();


   @Override
   public boolean isWinning (Board board, Move move) {
	  int column = move.getCell ().getColumn ();
	  Symbol symbol = move.getPlayer ().getSymbol ();

	  if (!columnMap.containsKey (column)) {
		 columnMap.put (column, new HashMap<> ());
	  }

	  Map<Symbol, Integer> currentColumnMap = columnMap.get (column);

	  if(!currentColumnMap.containsKey (symbol)){
		 currentColumnMap.put (symbol,1);
	  }else{
		 currentColumnMap.put (symbol, currentColumnMap.get (symbol) + 1);
	  }

	  return currentColumnMap.get(symbol) == board.getSize ();
   }
}
