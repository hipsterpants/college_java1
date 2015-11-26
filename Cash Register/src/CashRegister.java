import java.util.Scanner;

/**
 * @author Sean McDonald
 * Date: 2/14/2014
 * Class: CS 191 12:30pm MWF
 * Assignment 3
 * 
 * Purpose:
 * This program is meant to act as a simple cash register, having the user enter the total
 * price of items that a customer bought and entering them into an array. It then prompts
 * the user to enter the number of returns that a customer made and the total cost of
 * those returns. If a negative or invalid number is entered, the cash register does not work
 * properly and must be attempted again. If the total value of returns is greater than the
 * number of sales, the number of returns is invalidated and the total number of sales is shown
 * alone.
 * 
 * Variable names:
 * Main
 * 	priceArray: The array of prices entered up to 100.
 * 	returnArray: The array of return costs entered up to 100.
 * 	priceValue: The total of all the prices added together.
 * 	totalValue: The total value after returns have been subtracted from the total price.
 * 
 * process_sale
 * 	currentSize: A variable meant to number the total size of the partially filled array.
 * 	priceValue: Same definition as in Main.
 * 
 * process_return
 * 	returnValue: Value of all the items returned combined.
 * 	noReturn: A trigger to be set if the total cost of returns exceeds the total price.
 * 	totalValue: Same definition as in Main.
 * 	currentSizeTwo: A variable meant to number the total size of the partially filled array.
 * 
 * view_balance
 * 	totalValue: Same definition as in Main.
 */
public class CashRegister
{
public static void main(String[] args)
{
	double[] priceArray = new double[100];
	double[] returnArray = new double[100];
	double priceValue = process_sale(priceArray);
	double totalValue = process_return(returnArray, priceValue);
	if (totalValue == -1.0)
	{
		System.out.println(priceValue);
	}
	else
	{
	System.out.println(view_balance(totalValue));
	}
	
	
}
public static double process_sale(double[] priceArray)
{
	int currentSize = 0;
	Scanner in = new Scanner(System.in);
	System.out.println("Please enter the prices of each item sold. Enter a character when finished");
	while (in.hasNextDouble())
	{
		if (currentSize < priceArray.length)
		{
			priceArray[currentSize] = in.nextDouble();
			currentSize++;
		}
	}
	double priceValue = 0;

	for (int i = 0; i < currentSize; i++)
	{
		priceValue = priceValue + priceArray[i];
	}
	return priceValue;
}
public static double process_return(double[] returnArray, double priceValue)
{
	double returnValue = 0;
	double noReturn = -1.0;
	double totalValue = 0;
	int currentSizeTwo = 0;
	Scanner in = new Scanner(System.in);
	System.out.println("Please enter the prices of each item returned. Enter a character when finished.");
	while (in.hasNextDouble())
	{
		if (currentSizeTwo < returnArray.length)
		{
			returnArray[currentSizeTwo] = in.nextDouble();
			currentSizeTwo++;
		}
	}
	
	
	for (int i = 0; i < currentSizeTwo; i++)
	{
		returnValue = returnValue + returnArray[i];
	}
	if (returnValue > priceValue)
	{
		return noReturn;
	}
	else if (returnValue < priceValue)
	{
		totalValue = priceValue - returnValue;
	}
	return totalValue;
}
public static double view_balance(double totalValue)
{
	return totalValue;
}	
}