package org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter

public class Player {
   private String name;
   private Symbol symbol;
   private PlayerType playerType;
   private Scanner scanner;

   public Player (String name, Symbol symbol, PlayerType playerType) {
	  this.name = name;
	  this.symbol = symbol;
	  this.playerType = playerType;
	  this.scanner = new Scanner (System.in);
   }

   public Move makeMove (Board board) {
//	  Scanner scanner = new Scanner (System.in);
	  int row, column;

	  //validateMove
	  // Player is not responsible for validating the move by itself, let the game validate the move
	  do {
		 do {
			System.out.print ("Enter the row number:	");
			row = scanner.nextInt () - 1;
			if (row < 0 && row >= board.getSize ()) {
			   System.out.println ("Invalid enter! Please enter the row again!!!");
			}
		 } while (row < 0 || row >= board.getSize ());

		 do {
			System.out.print ("Enter the column number:	");
			column = scanner.nextInt () - 1;

			if (column < 0 && column > board.getSize ()) {
			   System.out.println ("Invalid enter! Please enter the column again!!!");
			}
		 } while (column < 0 || column >= board.getSize ());
	  } while (!board.getBoard ().get (row).get (column).isEmpty ());
	  //validateMove

//	  System.out.print ("Enter the row number:	");
//
//	  row = scanner.nextInt () - 1;
//
//	  System.out.print ("Enter the column number:	");
//
//	  column = scanner.nextInt () - 1;


	  return new Move (this, new Cell (row, column));
   }

}
