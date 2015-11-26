import java.util.Scanner;

/**
 * @author Sean McDonald
 * Date: 4/7/2014
 * Class: CS 181 MWF 12:30pm
 * Assignment 6
 * 
 * The purpose of this class is to handle all the user input for the program and create objects of the SavingsAccount
 * and CheckingAccount class to do the calculations.
 *
 */

public class Assignment6 {
	
	/**
	 * @param args The user input
	 * 
	 * This is the main method of the entire program, which takes the user input and then creates objects instantiated
	 * with said input to perform the proper calculations. This main program takes the checks for when year = 0
	 * (to avoid error) and when the CheckingAccount value is greater than 1000.
	 */
	
	public static void main(String[] args)
	{
		int principal = 0;
		int interest_rate = 0;
		int years = 0;
		String accountType = "";
		Scanner in = new Scanner(System.in);
		System.out.print("Input account type: ");
		accountType = in.next();
		System.out.print("Input principal: ");
		principal = in.nextInt();
		System.out.print("Input interest rate: ");
		interest_rate = in.nextInt();
		System.out.print("Input number of years: ");
		years = in.nextInt();
		if (accountType.equals("savings"))
		{
			SavingsAccount savings = new SavingsAccount(principal, interest_rate, years);
			savings.setPrincipal(principal);
			savings.getPrincipal();
			savings.setInterestRate(interest_rate);
			savings.getInterestRate();
			System.out.print("Final value: ");
			if (years == 0)
			{
				System.out.print(principal);
			}
			else
			{
				savings.calculateInterest(years - 1);
				System.out.print(savings.principal);
			}
			
		}
		if (accountType.equals("checking"))
		{
			CheckingAccount checking = new CheckingAccount(principal, interest_rate, years);//?
			{
				checking.setPrincipal(principal);
				checking.getPrincipal();
				checking.setInterestRate(interest_rate);
				checking.getInterestRate();
				checking.calculateInterest(years - 1);
				if (checking.principal > 1000.0)
				{
					System.out.println("Warning: checking account maximum balance exceeded.");
					System.out.print("Final value: 1000");
				}
				else
				{
					System.out.print("Final value: ");
					System.out.println(checking.principal);
				}
			}
		}	
	}
}
