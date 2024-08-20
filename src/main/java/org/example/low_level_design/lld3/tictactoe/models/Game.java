package org.example.low_level_design.lld3.tictactoe.models;

import lombok.Getter;
import lombok.Setter;
import org.example.low_level_design.lld3.tictactoe.services.strategies.winning_strategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Setter
@Getter

public class Game {
   List<WinningStrategy> winningStrategies;
   private final Board board;
   private final List<Player> players;
   private final List<Move> moves;
   private Player winner;
   private final GameState gameState;
   private final int nextPlayerIndex;


   private Game (List<Player> players,
				 List<WinningStrategy> winningStrategies) {
	  this.players = players;
	  int dimension = players.size () + 1;
	  this.board = new Board (dimension);
	  this.winningStrategies = winningStrategies;
	  this.gameState = GameState.IN_PROGRESS;
	  this.moves = new ArrayList<> ();
	  Random random = new Random ();
	  this.nextPlayerIndex = random.nextInt (players.size ());

   }

   public void makeMove(){
	  Player currentPlayer = players.get(nextPlayerIndex);
	  Cell moveCell = currentPlayer.makeMove(board);
   }


//   Builder pattern to create the Game object
   public static Builder getBuilder () {
	  return new Builder ();
   }

   public static class Builder {
	  private List<Player> players;
	  private List<WinningStrategy> winningStrategies;

	  public Builder setPlayers (List<Player> players) {
		 this.players = players;
		 return this;
	  }

	  public Builder setWinningStrategies (List<WinningStrategy> winningStrategies) {
		 this.winningStrategies = winningStrategies;
		 return this;
	  }

	  public Game build () {

//		 validations
		 validate ();
		 return new Game (players, winningStrategies);
	  }

	  private void validate () {
//		 Players are required to start the game
		 if (players == null || players.size () < 2) {
			throw new IllegalArgumentException ("At least 2 players are required to start the game");
		 }
//		 Winning strategies are required to determine the winner
		 if (winningStrategies == null || winningStrategies.isEmpty ()) {
			throw new IllegalArgumentException ("At least 1 winning strategy is required to determine the winner");
		 }

//		 More validations to be added
//		 Number of BOTs in the game least 1
		 if (PlayerType.BOT.equals (players.get (0).getPlayerType ()) &&
					 PlayerType.BOT.equals (players.get (1).getPlayerType ())) {
			throw new IllegalArgumentException ("At least 1 BOT is " +
														"required to start the game");
		 }

	  }

   }
}
