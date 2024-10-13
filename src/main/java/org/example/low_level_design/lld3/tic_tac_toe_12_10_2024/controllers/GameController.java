package org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.controllers;

import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.exceptions.BotCountException;
import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.exceptions.DuplicateSymbolException;
import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.exceptions.PlayerCountException;
import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.models.Game;
import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.models.GameState;
import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.models.Player;

import java.util.List;

public class GameController {

   public Game startGame (List<Player> players) throws PlayerCountException,
															   DuplicateSymbolException,
															   BotCountException {

	  return Game.getBuilder ()
					 .setPlayers (players)
					 .build ();
   }

   public void makeMove (Game game) {

	  game.makeMove();
   }

   public Player getWinner (Game game) {
	  return game.getWinner ();
   }

   public void undo (Game game) {

   }

   public void displayBoard (Game game) {
		game.printBoard();
   }

   public GameState getGameState(Game game){
	  return game.getGameState ();
   }
}
