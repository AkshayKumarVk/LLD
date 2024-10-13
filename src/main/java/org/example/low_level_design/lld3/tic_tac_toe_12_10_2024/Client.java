package org.example.low_level_design.lld3.tic_tac_toe_12_10_2024;

import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.controllers.GameController;
import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.exceptions.BotCountException;
import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.exceptions.DuplicateSymbolException;
import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.exceptions.PlayerCountException;
import org.example.low_level_design.lld3.tic_tac_toe_12_10_2024.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
   public static void main (String[] args) throws PlayerCountException, DuplicateSymbolException, BotCountException {

	  //	  Starting the game
	  System.out.println ("Starting TicTacToe game...");

//	  inputPlayer ();

	  List<Player> players = new ArrayList<> ();

	  players.add (new Player ("Akshay", new Symbol ('X'), PlayerType.HUMAN));
//	  players.add (new Player ("1", new Symbol ('Q'), PlayerType.HUMAN));
//	  players.add (new Player ("2", new Symbol ('W'), PlayerType.HUMAN));
//	  players.add (new Player ("3", new Symbol ('U'), PlayerType.HUMAN));
//	  players.add (new Player ("4", new Symbol ('R'), PlayerType.HUMAN));
	  players.add (new Bot ("Bot", new Symbol ('O'), BotDifficultyLevel.EASY));

	  GameController controller = new GameController ();

	  Game game = controller.startGame (players);

	  playGame (game, controller);

   }

   public static void playGame (Game game, GameController controller) {

	  while (controller.getGameState (game).equals (GameState.IN_PROGRESS)) {
//		 play

		 controller.displayBoard (game);

		 controller.makeMove (game);

	  }
	  switch (controller.getGameState (game)) {
		 case DRAW -> System.out.println ("There is no winner for now, Please restart the game!");
		 case CANCELLED -> System.out.println ("The game has been cancelled!");
		 case PAUSED -> System.out.println ("The game has been paused!");
		 case ENDED -> System.out.println (controller.getWinner (game).getName () + " won the game. Congrats...!");
	  }
   }

   public static void inputPlayer () {
	  //	  Player Input logic
	  Scanner scanner = new Scanner (System.in);


	  System.out.println ("Enter the player details");
	  System.out.print ("How many players are playing?	");
	  int playerCount = scanner.nextInt ();

	  for (int i = 0; i < playerCount; i++) {
		 System.out.println ("Enter " + (i + 1) + "'st player's details");
		 System.out.print ("Enter the name:		");
		 String name = scanner.nextLine ();
		 System.out.println ();
		 System.out.print ("Enter the character:	");
		 char charA = scanner.next ().charAt (0);
		 System.out.println ();
		 System.out.print ("Enter player type");
		 System.out.println ("For Human: 1");
		 System.out.println ("For Bot: 2");
		 int type = scanner.nextInt ();
		 if (type == 1) {
			Player player = new Player (name, new Symbol (charA), PlayerType.HUMAN);
		 } else if (type == 2) {
			Player player = new Player (name, new Symbol (charA), PlayerType.BOT);
		 }
	  }
	  //	  Player Input logic
   }
}
