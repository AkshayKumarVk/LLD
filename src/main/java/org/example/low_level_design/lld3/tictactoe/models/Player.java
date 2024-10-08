package org.example.low_level_design.lld3.tictactoe.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
public class Player {
   private String name;
   private Symbol symbol;
   private PlayerType playerType;

   public Player (String name, Symbol symbol, PlayerType playerType) {
	  this.name = name;
	  this.symbol = symbol;
	  this.playerType = playerType;
   }

   public Cell makeMove (Board board) {
	  Scanner scanner = new Scanner (System.in);
	  System.out.println (this.getName () + "'s turn");
	  int row, column;
	  do {
		 do {
//		 row calculator
			System.out.println ("Enter the row number between 0 to " + (board.getDimension ()-1));
			row = scanner.nextInt ();
			if (row < 0 || row >= board.getDimension ()) {
			   System.out.println ("Entered row number is invalid, Please enter a valid number");
			}
		 }
		 while (row < 0 || row >= board.getDimension ());

//		 Column calculation
		 do {
			System.out.println ("Enter the column number between 0 to " + (board.getDimension ()-1));
			column = scanner.nextInt ();
			if (column < 0 || column >= board.getDimension ()) {
			   System.out.println ("Entered column number is invalid, please enter a valid number");
			}
		 }
		 while (column < 0 || column >= board.getDimension ());
	  }
	  while (board.getBoard ().get (row).get (column).getCellState () != CellState.EMPTY);
	  return new Cell (row, column);
   }

}
