import java.util.Scanner;

/**
 * @author Sean McDonald
 * CS 181 12:30am MWF
 * April 24, 2014
 * 
 * This class simply takes the human input and sends it to the GameBoard class.
 * 
 * humanInput - the human input move.
 */

public class HumanPlayer {
	
	public String humanInput;
	
	/**
	 * This method asks the human player to input a move and then stores it in the humanInput variable.
	 */
	
	public void humanInputMethod()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Player 1's move? ");
		humanInput = in.next();
	}
}
