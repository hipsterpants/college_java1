import java.util.Scanner;

/**
 * @author Sean McDonald
 * Date: 1/31/14
 * Class: CS 181 12:30 MWF
 * Assignment 2
 * This program has the user input two different DNA strands and compares them to determine if
 * they are compliments of each other.
 * 
 * counter: used to count and read the individual characters in the entered strings
 * sequenceFailure : meant to be a sort of Boolean trigger to determine what message to given
 * to the user
 */

public class DNAComparison 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int counter = 0;
		int sequenceFailure = 0;
		
		//Get the DNA strands
		
		System.out.print("Enter the first sequence: ");
		String firstSequence = in.next();
		System.out.print("Enter the second sequence: ");
		String secondSequence = in.next();
		
		//Compare DNA strands and return message
		
		while (sequenceFailure != 0);
		{
			if (firstSequence.charAt(counter) == 'A')
			{
				if (secondSequence.charAt(secondSequence.length() - (counter + 1)) == 'T')
				{
					sequenceFailure = 0;
				}
				else
				{
					sequenceFailure = 1;
				}
			}
			if (firstSequence.charAt(counter) == 'T')
			{
				if (secondSequence.charAt(secondSequence.length() - (counter + 1)) == 'A')
				{
					sequenceFailure = 0;
				}
				else
				{
					sequenceFailure = 1;
				}
			}
			if (firstSequence.charAt(counter) == 'C')
			{
				if (secondSequence.charAt(secondSequence.length() - (counter + 1)) == 'G')
				{
					sequenceFailure = 0;
				}
				else
				{
					sequenceFailure = 1;
				}
			}
			if (firstSequence.charAt(counter) == 'G')
			{
				if (secondSequence.charAt(secondSequence.length() - (counter + 1)) == 'C')
				{
					sequenceFailure = 0;
				}
				else
				{
					sequenceFailure = 1;
				}
			}
			counter = counter + 1;
		}
		if (sequenceFailure == 1)
		{
			System.out.println("These are not reverse compliments");
		}
		else
		{
			System.out.println("These are reverse compliments");
		}
	}
}