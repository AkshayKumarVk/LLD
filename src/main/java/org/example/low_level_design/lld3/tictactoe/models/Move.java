package org.example.low_level_design.lld3.tictactoe.models;

public class Move {
   private final Cell cell;
   private final Player player;

   public Move (Cell cell, Player player) {
	  this.cell = cell;
	  this.player = player;
   }
}
