package org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.models;

import lombok.Getter;
import lombok.Setter;
import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.exceptions.BotCountException;
import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.exceptions.DuplicateSymbolException;
import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.exceptions.PlayerCountException;
import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.services.strategies.winning_strategies.RowWinningStrategy;
import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.services.strategies.winning_strategies.WinningStrategy;

import java.util.*;

@Getter
@Setter

public class Game {
   private List<Player> players;
   private Board board;
   private List<Move> moves;
   private GameState gameState;
   private Player winner;
   private int nextPlayerIndex;

   private Game (List<Player> players) {
	  this.players = players;
	  this.board = new Board (players.size () + 1);
	  this.moves = new ArrayList<> ();
	  this.gameState = GameState.IN_PROGRESS;

	  Random random = new Random ();
	  this.nextPlayerIndex = random.nextInt (players.size ());
   }

   public static Builder getBuilder () {
	  return new Builder ();
   }

   public void printBoard () {
	  board.printBoard ();
   }


   public boolean validateMove (Move move, Board board) {

	  int row = move.getCell ().getRow ();
	  int column = move.getCell ().getColumn ();

	  Cell currentCell = board.getBoard ().get (row).get (column);

	  return row >= 0 && row < board.getSize () &&
					 column >= 0 && column < board.getSize () &&
					 currentCell.isEmpty ();
   }


   public void makeMove () {
	  Player currentPlayer = players.get (getNextPlayerIndex ());
	  System.out.println (currentPlayer.getName () + "'s turn...");

	  Move move = currentPlayer.makeMove (board);
//	  validateMove (move, board);

	  int row = move.getCell ().getRow ();
	  int column = move.getCell ().getColumn ();

	  Cell cell = board.getBoard ().
						  get (row).get (column);

	  cell.setPlayer (currentPlayer);
	  cell.setCellState (CellState.OCCUPIED);

	  Move finalMove = new Move (currentPlayer, cell);

	  this.setNextPlayerIndex ((getNextPlayerIndex () + 1) % players.size ());

	  this.moves.add (finalMove);

	  // check this move status, winning or not

	  if (checkWinner (board, move)) {
		 this.setGameState (GameState.ENDED);
		 this.setWinner (currentPlayer);
	  } else if (moves.size () >= (board.getSize () * board.getSize ())) {
		 this.setGameState (GameState.DRAW);
	  }
   }

   //checking winner
   private boolean checkWinner (Board board, Move move) {
	  WinningStrategy winningStrategy = new RowWinningStrategy ();
	  return winningStrategy.checkWinning (board, move);
   }
   //checking winner


   public static class Builder {
	  private List<Player> players;

	  public Builder setPlayers (List<Player> players) {
		 this.players = players;
		 return this;
	  }

	  private void validatePlayerCount () throws PlayerCountException {
		 if (players.size () < 2) {
			throw new PlayerCountException
						  ("Player size should be greater than 1...!");
		 }
	  }

	  private void validateUniqueSymbolCount () throws DuplicateSymbolException {
		 Set<Character> symbolSet = new HashSet<> ();
		 for (Player player : players) {
			if (symbolSet.contains (player.getSymbol ().getAChar ())) {
			   throw new DuplicateSymbolException
							 ("Players has been chosen duplicate symbol...! Please change the symbol.");
			}
			symbolSet.add (player.getSymbol ().getAChar ());
		 }
	  }

	  private void validateBotCountException () throws BotCountException {
		 int boatCount = 0;
		 for (Player player : players) {
			if (player.getPlayerType () == PlayerType.BOT) {
			   boatCount++;
			}
			if (boatCount > 1) {
			   throw new BotCountException
							 ("There are more than one Boat in the game...!, Please change the Players");
			}
		 }
	  }

	  private void validateGame (List<Player> players) throws PlayerCountException,
																	  DuplicateSymbolException,
																	  BotCountException {
		 validatePlayerCount ();
		 validateUniqueSymbolCount ();
		 validateBotCountException ();
	  }

	  public Game build () throws PlayerCountException,
										  DuplicateSymbolException,
										  BotCountException {
//		 Validations
		 validateGame (players);

		 return new Game (players);
	  }
   }
}
