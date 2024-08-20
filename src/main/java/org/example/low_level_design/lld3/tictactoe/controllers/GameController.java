package org.example.low_level_design.lld3.tictactoe.controllers;

import org.example.low_level_design.lld3.tictactoe.models.GameState;
import org.example.low_level_design.lld3.tictactoe.models.Player;
import org.example.low_level_design.lld3.tictactoe.services.GameService;
import org.example.low_level_design.lld3.tictactoe.services.strategies.winning_strategy.WinningStrategy;

import java.util.List;

public class GameController {

   private GameService gameService;

   public GameController(){
	  gameService=new GameService ();
   }

//   Start game -> calling service
   public void startGame (List<Player> players, List<WinningStrategy> winningStrategies) {
	  gameService.startGame (players, winningStrategies);
   }


   public void makeMove () {
	  // Make a move -> calling service
	  gameService.makeMove();

   }

   public GameState getGameState () {
	  // Get the game state

   }

   public Player getWinner () {
	  // Get the winner
   }

   public void printBoard(){
	  gameService.printBoard();
   }
}
