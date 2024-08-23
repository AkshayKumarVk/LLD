package org.example.low_level_design.lld3.tictactoe;

import org.example.low_level_design.lld3.tictactoe.controllers.GameController;
import org.example.low_level_design.lld3.tictactoe.models.GameState;
import org.example.low_level_design.lld3.tictactoe.models.Player;
import org.example.low_level_design.lld3.tictactoe.models.PlayerType;
import org.example.low_level_design.lld3.tictactoe.models.Symbol;
import org.example.low_level_design.lld3.tictactoe.services.GameService;
import org.example.low_level_design.lld3.tictactoe.services.strategies.winning_strategy.ColumnWinningStrategy;
import org.example.low_level_design.lld3.tictactoe.services.strategies.winning_strategy.RowWinningStrategy;
import org.example.low_level_design.lld3.tictactoe.services.strategies.winning_strategy.WinningStrategy;
import org.springframework.instrument.classloading.glassfish.GlassFishLoadTimeWeaver;

import java.util.ArrayList;
import java.util.List;

public class Client {
   public static void main (String[] args) {
	  playTicTacToe ();
   }

   private static void playTicTacToe () {

	  System.out.println ("Let's play Tic Tac Toe");

	  List<Player> players= new ArrayList<> ();
	  players.add (new Player ("Xavier", new Symbol ('X'), PlayerType.HUMAN));
	  players.add (new Player ("Ram", new Symbol ('R'), PlayerType.HUMAN));

	  List<WinningStrategy> winningStrategies= List.of(
			  new RowWinningStrategy (),
			  new ColumnWinningStrategy ()
	  );
	  GameController gameController = new GameController ();
	  gameController.startGame (players, winningStrategies);

//	  play the game
	  while (gameController.getGameState () == GameState.IN_PROGRESS) {
		 gameController.printBoard ();
		 gameController.makeMove ();
	  }


//	  Game over
	  System.out.println ("Game over");
	  gameController.printBoard ();
	  if (gameController.getGameState () == GameState.ENDED) {
		 System.out.println (gameController.getWinner ().getName () + " wins");
	  }
	  else {
		 System.out.println (GameState.DRAW.toString ());
	  }
   }
}
