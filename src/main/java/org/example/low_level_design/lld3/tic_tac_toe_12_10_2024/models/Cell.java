package org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Cell {
   private int row;
   private int column;
   private Player player;
   private CellState cellState;

   public Cell (int row, int column) {
	  this.row = row;
	  this.column = column;
	  this.cellState = CellState.EMPTY;
   }

   public boolean isEmpty(){
	  return cellState.equals(CellState.EMPTY);
   }
}
