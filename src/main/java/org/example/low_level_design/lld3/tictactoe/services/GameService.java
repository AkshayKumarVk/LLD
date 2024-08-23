package org.example.low_level_design.lld3.tictactoe.services;

import org.example.low_level_design.lld3.tictactoe.models.*;
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

   private boolean checkWinner (Move move) {
	  for (WinningStrategy strategy : game.getWinningStrategies ()) {
		 if (strategy.isWinning (game.getBoard (), move)) {
			return true;
		 }
	  }
	  return false;
   }

   public void makeMove () {
	  Player currentPlayer = game.getPlayers ().get (game.getNextPlayerIndex ());
	  Cell movingCell = currentPlayer.makeMove (game.getBoard ());

//	  Valid move, we can execute on the board

	  Cell currentCell = game.getBoard ().getBoard ().get (movingCell.getRow ()).get (movingCell.getRow ());
	  currentCell.setCellState (CellState.FILLED);
	  currentCell.setPlayer (currentPlayer);

	  Move finalMove = new Move (currentCell, currentPlayer);
	  game.getMoves ().add (finalMove);

//	  Set nextPlayer Index
	  int nextPlayerIndex = game.getNextPlayerIndex ();
	  nextPlayerIndex = (nextPlayerIndex + 1) % game.getPlayers ().size ();
	  game.setNextPlayerIndex (nextPlayerIndex);


//	  check winner or draw

	  if (checkWinner (finalMove)) {
		 game.setWinner (currentPlayer);
		 game.setGameState (GameState.ENDED);
	  } else if (game.getMoves ().size () == (game.getBoard ().getDimension ()) * (game.getBoard ().getDimension ())) {
		 game.setGameState (GameState.DRAW);
	  } else {
		 game.setGameState (GameState.IN_PROGRESS);
	  }
   }

   public GameState getGameState () {
	  return game.getGameState ();
   }

   public Player getWinner () {
	  return game.getWinner ();
   }

   public void printBoard () {
	  game.getBoard ().printBoard ();
   }


}
