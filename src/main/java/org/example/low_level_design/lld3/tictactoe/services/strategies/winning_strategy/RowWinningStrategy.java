package org.example.low_level_design.lld3.tictactoe.services.strategies.winning_strategy;

import org.example.low_level_design.lld3.tictactoe.models.Board;
import org.example.low_level_design.lld3.tictactoe.models.Move;
import org.example.low_level_design.lld3.tictactoe.models.Symbol;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class RowWinningStrategy implements WinningStrategy {
   private final Map<Integer, Map<Symbol, Integer>> rowMap = new HashMap<> ();

   @Override
   public boolean isWinning (Board board, Move move) {
	  int row = move.getCell ().getRow ();
	  Symbol symbol = move.getPlayer ().getSymbol ();

//	  check if the current row present in the map
	  if (!rowMap.containsKey (row)) {
		 rowMap.put (row, new HashMap<> ());
	  }
	  Map<Symbol, Integer> rowCountMap = rowMap.get(row);

//	   check if the symbol is  preset in the map
	  if (!rowCountMap.containsKey (symbol)) {
		 rowCountMap.put (symbol, 0);
	  }
	  rowCountMap.put (symbol, rowCountMap.get (symbol) + 1);

	  return rowCountMap.get(symbol) == board.getDimension ();
   }

}
