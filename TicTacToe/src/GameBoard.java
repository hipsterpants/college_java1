import java.util.ArrayList;

/**
 * @author Sean McDonald
 * CS 181 12:30pm MWF
 * April 25, 2014
 * 
 * This class contains all the actions of the game board. It takes the player's input from either the HumanPlayer or
 * ComputerPlayer class and translates that to create a viewable game board and eventually determine a victor.
 * 
 * inputMoves - The ArrayList of possible moves.
 * usedMoves - The ArrayList of moves already used.
 * player1Moves - The ArrayList of all the moves input by the first player.
 * player2Moves - The ArrayList of all the moves input by the second player.
 * All the String instance variables except result are parts of the game board to be printed.
 * result - The string that is used to identify the victor (or lack of) for the game.
 */

public class GameBoard {
	
	private ArrayList<String> inputMoves = new ArrayList<String>();
	private ArrayList<String> usedMoves = new ArrayList<String>();
	private ArrayList<String> player1Moves = new ArrayList<String>();
	private ArrayList<String> player2Moves = new ArrayList<String>();
	private String a1Quadrant;
	private String a2Quadrant;
	private String a3Quadrant;
	private String b1Quadrant;
	private String b2Quadrant;
	private String b3Quadrant;
	private String c1Quadrant;
	private String c2Quadrant;
	private String c3Quadrant;
	private String upperQuadrant;
	private String lowerQuadrant;
	private String middleBar;
	private String result;
	HumanPlayer humanMove = new HumanPlayer();
	ComputerPlayer computerMove = new ComputerPlayer();
	
	/**
	 * @param Player1 - The object for the first player sent from the TicTacToe class
	 * @param Player2 - The object for the second player sent from the TicTacToe class
	 * 
	 * This is the constructor when there are two human players.
	 */
	
	public GameBoard(HumanPlayer Player1, HumanPlayer Player2)
	{
		humanMove = Player1;
		humanMove = Player2;
	}
	
	/**
	 * @param Player1 - The object for the first player sent from the TicTacToe class
	 * @param Player2 - The object for the second player sent from the TicTacToe class
	 * 
	 * This is the constructor when there is one human player and one computer player.
	 */
	
	public GameBoard(HumanPlayer Player1, ComputerPlayer Player2)
	{
		humanMove = Player1;
		computerMove = Player2;
	}
	
	/**
	 * This method initializes the board as being blank for modification and future printing out.
	 */
	
	public void initializeBoard()
	{
		a1Quadrant = "   ";
		a2Quadrant = "   ";
		a3Quadrant = "   ";
		b1Quadrant = "   ";
		b2Quadrant = "   ";
		b3Quadrant = "   ";
		c1Quadrant = "   ";
		c2Quadrant = "   ";
		c3Quadrant = "   ";
		upperQuadrant = "   ";
		lowerQuadrant = "___";
		middleBar = "|";
	}
	
	/**
	 * This method fills the inputMoves ArrayList with possible moves.
	 */
	
	public void inputMovesArray()
	{
		inputMoves.add("A1");
		inputMoves.add("A2");
		inputMoves.add("A3");
		inputMoves.add("B1");
		inputMoves.add("B2");
		inputMoves.add("B3");
		inputMoves.add("C1");
		inputMoves.add("C2");
		inputMoves.add("C3");
	}
	
	/**
	 * This method performs the humanInputMethod of the HumanPlayer class to get the move from the human player.
	 * It then compares that move with already used moves and forces the user to try again if said move has already
	 * been used.
	 */
	
	public void humanMoveErrorCheck()
	{
		humanMove.humanInputMethod();
		inputMovesArray();
		int i = 0;
		while (i < usedMoves.size())
		{
			if (humanMove.humanInput.equals(usedMoves.get(i)))
			{
				System.out.println("Input already used, input again");
				humanMoveErrorCheck();
			}
			else
			{
				i++;
			}
		}
	}
	
	/**
	 * This method takes the user input already found in the error check method and performs the necessary actions upon it,
	 * such as adding it to usedMoves and  player1Moves.
	 */
	
	public void humanMove()
	{

		int i = 0;
		while (i < inputMoves.size())
		{
			if (humanMove.humanInput.equals(inputMoves.get(i)))
			{
				usedMoves.add(humanMove.humanInput);
				player1Moves.add(humanMove.humanInput);
				inputMoves.remove(i);
			}
			else
			{
				i++;
			}
		}
	}
	
	/**
	 * @param i - The variable for searching the computerMoveArray for moves for the the computer to use.
	 * 
	 * This method selects the move for the computer and then compares it to see if the move has already been used. If it
	 * has, it goes further down the array until it finds a possible move, and then uses that is its input move.
	 */
	
	public void computerMoveErrorCheck(int i)
	{
		computerMove.fillComputerMoveArray();
		computerMove.selectMoveArray(i);
		int j = 0;
		while (j < inputMoves.size())
		{	
			if(computerMove.computerInput.equals(usedMoves.get(j)))
			{
				computerMoveErrorCheck(i++);
			}
			else
			{
				j++;
			}
		}
	}
	
	/**
	 * This method performs the necessary actions on the computer input, such as adding it to usedMoves and player2Moves.
	 */
	
	public void computerMove()
	{
		int i = 0;
		while (i < inputMoves.size())
		{
			if (computerMove.computerInput.equals(inputMoves.get(i)))
			{
				usedMoves.add(computerMove.computerInput);
				player2Moves.add(computerMove.computerInput);
				inputMoves.remove(i);
			}
		}
	}
	
	/**
	 * This method modifies the board's strings dependent on the elements present in both player1 and player2 arrays.
	 */
	
	public void boardModification()
	{
		initializeBoard();
		int i = 0;
		while (i < player1Moves.size())
		{
			if (player1Moves.get(i).equals("A1"))
			{
				a1Quadrant = " X ";
				System.out.print("balls");
			}
			if (player1Moves.get(i).equals("A2"))
			{
				a2Quadrant = " X ";
			}
			if (player1Moves.get(i).equals("A3"))
			{
				a3Quadrant = " X ";
			}
			if (player1Moves.get(i).equals("B1"))
			{
				b1Quadrant = " X ";
			}
			if (player1Moves.get(i).equals("B2"))
			{
				b2Quadrant = " X ";
			}
			if (player1Moves.get(i).equals("B3"))
			{
				b3Quadrant = " X ";
			}
			if (player1Moves.get(i).equals("C1"))
			{
				c1Quadrant = " X ";
			}
			if (player1Moves.get(i).equals("C2"))
			{
				c2Quadrant = " X ";
			}
			if (player1Moves.get(i).equals("C3"))
			{
				c3Quadrant = " X ";
			}
		i = 0;
		while (i < player2Moves.size())	
		{
			if (player2Moves.get(i).equals("A1"))
			{
				a1Quadrant = " O ";
			}
			if (player2Moves.get(i).equals("A2"))
			{
				a2Quadrant = " O ";
			}
			if (player2Moves.get(i).equals("A3"))
			{
				a3Quadrant = " O ";
			}
			if (player2Moves.get(i).equals("B1"))
			{
				b1Quadrant = " O ";
			}
			if (player2Moves.get(i).equals("B2"))
			{
				b2Quadrant = " O ";
			}
			if (player2Moves.get(i).equals("B3"))
			{
				b3Quadrant = " O ";
			}
			if (player2Moves.get(i).equals("C1"))
			{
				c1Quadrant = " O ";
			}
			if (player2Moves.get(i).equals("C2"))
			{
				c2Quadrant = " O ";
			}
			if (player2Moves.get(i).equals("C3"))
			{
				c3Quadrant = " O ";
			}
			i++;
		}
		}
	}
	
	/**
	 * This method performs all the necessary actions of calling the other move methods to get human and computer input.
	 * It then modifies the board and checks to see if there is a victor (or the board is full). If there is, it then calls for the isFinished method,
	 * which should end the game.
	 */
	
	public void move()
	{
		humanMoveErrorCheck();
		humanMove();
		computerMoveErrorCheck(0);
		computerMove();
		boardModification();
		System.out.print("test");
		victoryCheck();
		if (result.equals("player 1 victor"))
		{
			isFinished();
		}
		if (result.equals("player 2 victor"))
		{
			isFinished();
		}
		if (usedMoves.size() == 9)
		{
			result = "no victor";
			isFinished();
		}
	}
	
	/**
	 * This method prints the board.
	 */
	
	public void printBoard()
	{
		System.out.print(upperQuadrant);
		System.out.print(middleBar);
		System.out.print(upperQuadrant);
		System.out.print(middleBar);
		System.out.println(upperQuadrant);
		System.out.print(a1Quadrant);
		System.out.print(middleBar);
		System.out.print(a2Quadrant);
		System.out.print(middleBar);
		System.out.println(a3Quadrant);
		System.out.print(lowerQuadrant);
		System.out.print(middleBar);
		System.out.print(lowerQuadrant);
		System.out.print(middleBar);
		System.out.println(lowerQuadrant);
		System.out.print(upperQuadrant);
		System.out.print(middleBar);
		System.out.print(upperQuadrant);
		System.out.print(middleBar);
		System.out.println(upperQuadrant);
		System.out.print(b1Quadrant);
		System.out.print(middleBar);
		System.out.print(b2Quadrant);
		System.out.print(middleBar);
		System.out.println(b3Quadrant);
		System.out.print(lowerQuadrant);
		System.out.print(middleBar);
		System.out.print(lowerQuadrant);
		System.out.print(middleBar);
		System.out.println(lowerQuadrant);
		System.out.print(upperQuadrant);
		System.out.print(middleBar);
		System.out.print(upperQuadrant);
		System.out.print(middleBar);
		System.out.println(upperQuadrant);
		System.out.print(c1Quadrant);
		System.out.print(middleBar);
		System.out.print(c2Quadrant);
		System.out.print(middleBar);
		System.out.println(c3Quadrant);
		System.out.print(upperQuadrant);
		System.out.print(middleBar);
		System.out.print(upperQuadrant);
		System.out.print(middleBar);
		System.out.println(upperQuadrant);
	}
	
	/**
	 * This method checks for the victor via seeing which strings have been modified.
	 */
	
	public void victoryCheck()
	{
		if (a1Quadrant.equals(" X "))
		{
			if (a2Quadrant.equals(" X "))
			{
				if (a3Quadrant.equals(" X "))
				{
					result = "player 1 victor";
				}
			}
			if (b2Quadrant.equals(" X "))
			{
				if (c3Quadrant.equals(" X "))
				{
					result = "player 1 victor";
				}
			}
			if (b1Quadrant.equals(" X "))
			{
				if (c1Quadrant.equals(" X "))
				{
					result = "player 1 victor";
				}
			}
		}
		if (b1Quadrant.equals(" X "))
		{
			if (b2Quadrant.equals(" X "))
			{
				if (b3Quadrant.equals(" X "))
				{
					result = "player 1 victor";
				}
			}
		}
		if (c1Quadrant.equals(" X "))
		{
			if (c2Quadrant.equals(" X "))
			{
				if (c3Quadrant.equals(" X "))
				{
					result = "player 1 victor";
				}
			}
			if (b2Quadrant.equals(" X "))
			{
				if (a3Quadrant.equals(" X "))
				{
					result = "player 1 victor";
				}
			}
		}
		if (a2Quadrant.equals(" X "))
		{
			if (b2Quadrant.equals(" X "))
			{
				if (c2Quadrant.equals(" X "))
				{
					result = "player 1 victor";
				}
			}
		}
		if (a3Quadrant.equals(" X "))
		{
			if (b3Quadrant.equals(" X "))
			{
				if (c3Quadrant.equals(" X "))
				{
					result = "player 1 victor";
				}
			}
		}
		if (a1Quadrant.equals(" O "))
		{
			if (a2Quadrant.equals(" O "))
			{
				if (a3Quadrant.equals(" O "))
				{
					result = "player 2 victor";
				}
			}
			if (b2Quadrant.equals(" O "))
			{
				if (c3Quadrant.equals(" O "))
				{
					result = "player 2 victor";
				}
			}
			if (b1Quadrant.equals(" O "))
			{
				if (c1Quadrant.equals(" O "))
				{
					result = "player 2 victor";
				}
			}
		}
		if (b1Quadrant.equals(" O "))
		{
			if (b2Quadrant.equals(" O "))
			{
				if (b3Quadrant.equals(" O "))
				{
					result = "player 2 victor";
				}
			}
		}
		if (c1Quadrant.equals(" O "))
		{
			if (c2Quadrant.equals(" O "))
			{
				if (c3Quadrant.equals(" O "))
				{
					result = "player 2 victor";
				}
			}
			if (b2Quadrant.equals(" O "))
			{
				if (a3Quadrant.equals(" O "))
				{
					result = "player 2 victor";
				}
			}
		}
		if (a2Quadrant.equals(" O "))
		{
			if (b2Quadrant.equals(" O "))
			{
				if (c2Quadrant.equals(" O "))
				{
					result = "player 2 victor";
				}
			}
		}
		if (a3Quadrant.equals(" O "))
		{
			if (b3Quadrant.equals(" O "))
			{
				if (c3Quadrant.equals(" O "))
				{
					result = "player 2 victor";
				}
			}
		}
	}
	
	/**
	 * @return - The boolean value to end the game.
	 * 
	 * This method checks to see which result has been found and sends the proper boolean value to end the game.
	 */
	
	public boolean isFinished()
	{
		boolean end = false;
		result = "";
		if (result.equals("player 1 victor"))
			{
				end = true;
			}
		if (result.equals("player 2 victor"))
		{
			end = true;
		}
		if (result.equals("no victor"))
		{
			end = true;
		}
		return end;
	}
	
	/**
	 * This method prints the correct message depending on which player was victorious or if there was no victor.
	 */
	
	public void printResult()
	{
		if (result.equals("player 1 victor"))
		{
			System.out.println("Player 1 is the winner.");
		}
		if (result.equals("player 2 victor"))
		{
			System.out.println("Player 2 is the winner.");
		}
		if (result.equals("no victor"))
		{
			System.out.println("There is a tie.");
		}
	}
}
