package org.example.low_level_design.lld3.tictactoe.services.strategies.winning_strategy;

import org.example.low_level_design.lld3.tictactoe.models.Board;
import org.example.low_level_design.lld3.tictactoe.models.Move;
import org.example.low_level_design.lld3.tictactoe.models.Symbol;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ColumnWinningStrategy implements WinningStrategy {

   Map<Integer, Map<Symbol, Integer>> columnMap = new HashMap<> ();

   @Override
   public boolean isWinning (Board board, Move move) {
	  int column =move.getCell ().getColumn ();
	  Symbol symbol = move.getPlayer ().getSymbol ();

//	  check current column presence
	  if (!columnMap.containsKey (column)) {
		 columnMap.put (column, new HashMap<> ());
	  }

	  Map<Symbol, Integer> columnCountMap = columnMap.get(column);

//	  check if the symbol present in the column

	  if (!columnCountMap.containsKey (symbol)) {
		 columnCountMap.put (symbol, 0);
	  }

	  columnCountMap.put (symbol, columnCountMap.get (symbol)+1);

	  return columnCountMap.get(symbol) == board.getDimension ();
   }
}
