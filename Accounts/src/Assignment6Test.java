import static org.junit.Assert.*;

import org.junit.Test;


/**
 * @author Sean McDonald
 *
 * This is the JUnit test for the Assignment6 class.
 */

public class Assignment6Test {
	
	/**
	 * The test for an object of the SavingsAccount class.
	 */

	@Test
	public void testMainSavings() {
		double principal = 10.0;
		int interest_rate = 10;
		int years = 1;
		SavingsAccount testObject = new SavingsAccount(principal, interest_rate, years);
		testObject.setPrincipal(principal);
		testObject.getPrincipal();
		testObject.setInterestRate(interest_rate);
		testObject.getInterestRate();
		testObject.calculateInterest(years - 1);
		assertEquals("11.0", testObject.principal);
	}
	
	/**
	 * A test for an object of the CheckingAccount class when the calculated value is less than $1000.
	 */

	@Test
	public void testMainChecking() {
		double principal = 10.0;
		int interest_rate = 10;
		int years = 1;
		CheckingAccount testObject = new CheckingAccount(principal, interest_rate, years);
		testObject.setPrincipal(principal);
		testObject.getPrincipal();
		testObject.setInterestRate(interest_rate);
		testObject.getInterestRate();
		testObject.calculateInterest(years - 1);
		assertEquals("11.0", testObject.principal);
	}
	
	/**
	 * A test for an object of the CheckingAccount class when the calculated value is greater than $1000.
	 */
	
	@Test
	public void testMainCheckingOver1000() {
		double principal = 1000.0;
		int interest_rate = 10;
		int years = 1;
		CheckingAccount testObject = new CheckingAccount(principal, interest_rate, years);
		testObject.setPrincipal(principal);
		testObject.getPrincipal();
		testObject.setInterestRate(interest_rate);
		testObject.getInterestRate();
		testObject.calculateInterest(years - 1);
		assertEquals("Maximum balance is 1000", 1100.0, testObject.principal);
	}
}
