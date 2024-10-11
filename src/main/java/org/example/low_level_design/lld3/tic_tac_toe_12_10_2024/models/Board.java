package org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter

public class Board {
   private int size;
   private List<List<Cell>> board;

   public Board (int size) {
	  this.size = size;

	  this.board = new ArrayList<> ();

	  for (int i = 0; i < size; i++) {
		 List<Cell> row = new ArrayList<> ();
		 for(int j = 0; j < size; j++){
			row.add (new Cell (i, j));
		 }
		 board.add (row);
	  }

   }

}
