import java.util.ArrayList;

/**
 * @author Sean McDonald
 * CS 181 12:30pm MWF
 * April 25, 2014
 * 
 * This class selects the computerPlayer's move to be sent to the GameBoard.
 * 
 * computerInput - the selected computerPlayer's move.
 * computerMoveArray - the ArrayList of possible computer moves
 */

public class ComputerPlayer {


	public String computerInput;
	public ArrayList<String> computerMoveArray = new ArrayList<String>();
	
	
	/**
	 * This method fills the computerMoveArray with possible moves.
	 */
	
	public void fillComputerMoveArray()
	{
		System.out.print("Test");
		computerMoveArray.add("A1");
		computerMoveArray.add("A2");
		computerMoveArray.add("A3");
		computerMoveArray.add("B1");
		computerMoveArray.add("B2");
		computerMoveArray.add("B3");
		computerMoveArray.add("C1");
		computerMoveArray.add("C2");
		computerMoveArray.add("C3");
	}
	
	/**
	 * @param i - The index for selecting a move within the computerMoveArray;
	 * 
	 * This method takes in an integer and uses it to select a move within the computerMoveArray in the computerInput variable.
	 */
	
	public void selectMoveArray(int i)
	{
		fillComputerMoveArray();
		computerInput = computerMoveArray.get(i);	
	}
}
