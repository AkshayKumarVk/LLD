package org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Getter
@Setter

public class Game {
   private List<Player> players;
   private Board board;
   private List<Move> moves;
   private GameState gameState;
   private Player winner;
   private int nextPlayerIndex;

   public Game (List<Player> players) {
	  this.players = players;
	  int boardSize = players.size()+1;
	  this.board = new Board (boardSize);
	  this.moves = new ArrayList<> ();
	  this.gameState =  GameState.IN_PROGRESS;

	  Random random = new Random ();

	  this.nextPlayerIndex = random.nextInt (players.size ());



   }
}
