
	import java.util.Scanner;

/**
 * @author Sean McDonald
 * CS 181 12:30pm MWF
 * April 25, 2014
 * 
 * This class contains the main method and calls to objects of other classes in order to create a functioning TicTacToe game.
 *
 */
	public class TicTacToe
	{
		
		/**
		 * @param args - the input from the player.
		 * 
		 * This main method allows the user to choose whether to play another human or a computer. It then uses that choice to
		 * send the appropriate objects to the GameBoard class. It contains a loop to perform to "loop" actions of the game and
		 * exits when a winner is declared via the isFinished method. The results and victor are then printed.
		 * 
		 */
	    public static void main(String[] args)
	    {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Play vs. 'h'uman or 'c'omputer? ");
	        String choice = new String(in.nextLine());
			boolean computerIsPlayer = choice.equalsIgnoreCase("c");

			GameBoard game;
	        if (computerIsPlayer)
	        {
				game = new GameBoard(new HumanPlayer(), new ComputerPlayer());
	        }
	        else
	        {
	            game = new GameBoard(new HumanPlayer(), new HumanPlayer());
	        }
			

			while (!game.isFinished())
			{
				System.out.print("test");
				game.move();
				System.out.print("test2");
				System.out.print("test3");
				game.printBoard();
			}
			
			game.printResult();
	    }
	}
