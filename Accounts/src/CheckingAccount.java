
/**
 * @author Sean McDonald
 *
 * This class does the calculations for a checking account.
 * 
 * principal - the instance variable that contains the principal value gotten from the main method
 * interest_rate - the instance variable that contains the interest rate value gotten from the main method
 * years - the instance variable that contains the years value gotten from the main method
 */

public class CheckingAccount implements Interest 
{
	public double principal;
	private int interest_rate;
	private int years;
	
	/**
	 * @param localPrincipal The principal value received from the main method in the Assignment6 class
	 * @param localInterest_rate The interest_rate value received from the main method in the Assignment6 class
	 * @param localYears The years value received from the main method in the Assignment6 class
	 * 
	 * This method is a constructor to receive the user input from the main method and input the data into
	 * instance variables.
	 */
	
	public CheckingAccount(double localPrincipal, int localInterest_rate, int localYears)
	{
		principal = localPrincipal;
		interest_rate = localInterest_rate;
		years = localYears;
	}
	
	/**
	 * This method gets the localPrincipal value (the user input principal value) and stores it in an instance variable.
	 */
	
	public void setPrincipal(double localPrincipal)
	{
		principal = localPrincipal;
	}
	
	/**
	 * This method simply returns the principal instance variable to the main method.
	 */
	
	public double getPrincipal()
	{
		return principal;
	}
	
	/**
	 * This method gets the localInterest_rate value (the user input interest_rate value) and stores it in an instance variable.
	 */
	
	public void setInterestRate(int localInterest_rate)
	{
		interest_rate = localInterest_rate;
	}
	
	/**
	 * This method simply returns the interest_Rate instance variable to the main method.
	 */
	
	public int getInterestRate()
	{
		return interest_rate;
	}
	
	/**
	 * This method performs the calculation to find the information using the principal value, the interest rate, and the
	 * number of years. It is performed recursively, with the years being decreased each time until the number of years
	 * is equal to 0.
	 */
	
	public void calculateInterest(int years)
	{
		principal = ((principal * ((double)interest_rate/100) + principal));
		if (years != 0)
		{
			calculateInterest(years - 1);
		}
	}

}
