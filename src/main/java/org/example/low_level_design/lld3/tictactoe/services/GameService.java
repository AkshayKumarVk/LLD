package org.example.low_level_design.lld3.tictactoe.services;

import org.example.low_level_design.lld3.tictactoe.models.Game;
import org.example.low_level_design.lld3.tictactoe.models.GameState;
import org.example.low_level_design.lld3.tictactoe.models.Player;
import org.example.low_level_design.lld3.tictactoe.services.strategies.winning_strategy.WinningStrategy;

import java.util.List;

public class GameService {
   private Game game;

   public void startGame (List<Player> players, List<WinningStrategy> winningStrategies) {
	  game = Game.getBuilder ().
					 setPlayers (players).
					 setWinningStrategies (winningStrategies).
					 build ();
   }

   public void makeMove () {
	  game.makeMove ();
   }

   public GameState getGameState () {
   }

   public Player getWinner () {
   }

   public void printBoard(){
	  game.getBoard().printBoard();
   }


}
