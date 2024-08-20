package org.example.low_level_design.lld3.tictactoe.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cell {
   private int row;
   private int column;
   private CellState cellState;
   private Player player;

   public Cell(int row, int column) {
	  this.row = row;
	  this.column = column;
	  this.cellState = CellState.EMPTY;

   }
}
