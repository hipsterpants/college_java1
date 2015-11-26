import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Sean McDonald
 * 
 * This is a JUnit test for the CheckingAccount class.
 */

public class CheckingAccountTest {
	private double principal;
	private int interest_rate;
	private int years;

	/**
	 * This is a test for the CheckingAccount constructor (I am unable to make it work however, unsure how to deal
	 * with private instance variables).
	 */
	
	@Test
	public void testCheckingAccount() {
		double localPrincipal = 10.00;
		int localInterest_rate = 10;
		int localYears = 1;
		CheckingAccount testObject = new CheckingAccount(localPrincipal, localInterest_rate, localYears);
		assertEquals("10.00", testObject.principal);
		//assertEquals("10", testObject.interest_rate);
		//assertEquals("1", testObject.years);
	}

	/**
	 * This is a test for the setPrincipal method.
	 */
	
	@Test
	public void testSetPrincipal() {
		double localPrincipal = 10.00;
		int localInterest_rate = 10;
		int localYears = 1;
		CheckingAccount testObject = new CheckingAccount(localPrincipal, localInterest_rate, localYears);
		testObject.setPrincipal(localPrincipal);
		assertEquals("Should be 10.00", 10.00, testObject.getPrincipal());
	}

	/**
	 * This is a test for the getPrincipal method.
	 */
	
	@Test
	public void testGetPrincipal() {
		double localPrincipal = 10.00;
		int localInterest_rate = 10;
		int localYears = 1;
		principal = 10.0;
		CheckingAccount testObject = new CheckingAccount(localPrincipal, localInterest_rate, localYears);
		assertEquals("10.00", testObject.getPrincipal(), 00.01f );
	}

	/**
	 * This is a test for the setInterestRate method.
	 */
	
	@Test
	public void testSetInterestRate() {
		double localPrincipal = 10.00;
		int localInterest_rate = 10;
		int localYears = 1;
		CheckingAccount testObject = new CheckingAccount(localPrincipal, localInterest_rate, localYears);
		testObject.setInterestRate(localInterest_rate);
		assertEquals("10", testObject.getInterestRate());
	}

	/**
	 * This is a test for the getInterestRate method.
	 */
	
	@Test
	public void testGetInterestRate() {
		double localPrincipal = 10.00;
		int localInterest_rate = 10;
		int localYears = 1;
		interest_rate = 10;
		CheckingAccount testObject = new CheckingAccount(localPrincipal, localInterest_rate, localYears);
		assertEquals("10", testObject.getInterestRate());
	}

	/**
	 * This a test for the calculateInterest method when all values are above 0.
	 */
	
	@Test
	public void testCalculateInterest() {
		double localPrincipal = 10.0;
		int localInterest_rate = 10;
		int localYears = 1;
		principal = 10.0;
		interest_rate = 10;
		years = 1;
		CheckingAccount testObject = new CheckingAccount(localPrincipal, localInterest_rate, localYears);
		testObject.calculateInterest(localYears - 1);
		assertEquals("11.0", testObject.principal);
	}
	
	/**
	 * This is a test for the calculateInterest method when the principal value is 0.
	 */
	
	@Test
	public void test2CalculateInterest() {
		double localPrincipal = 0.0;
		int localInterest_rate = 10;
		int localYears = 1;
		principal = 0.0;
		interest_rate = 10;
		years = 1;
		CheckingAccount testObject = new CheckingAccount(localPrincipal, localInterest_rate, localYears);
		testObject.calculateInterest(localYears - 1);
		assertEquals("0.0", testObject.principal);
	}

	/**
	 * This a test for the calculateInterest method when the interest_rate value is 0.
	 */
	
	@Test
	public void test3CalculateInterest() {
		double localPrincipal = 10.0;
		int localInterest_rate = 0;
		int localYears = 1;
		principal = 10.0;
		interest_rate = 0;
		years = 1;
		CheckingAccount testObject = new CheckingAccount(localPrincipal, localInterest_rate, localYears);
		testObject.calculateInterest(localYears - 1);
		assertEquals("10.0", testObject.principal);
	}
	
	/**
	 * This is a test for the calculateInterest method when the years value is 0. Produces an error but said error
	 * is checked and fixed in main method before it is called to the CheckingAccount method.
	 */
	
	@Test
	public void test4CalculateInterest() {
		double localPrincipal = 10.0;
		int localInterest_rate = 10;
		int localYears = 0;
		principal = 10.0;
		interest_rate = 10;
		years = 0;
		CheckingAccount testObject = new CheckingAccount(localPrincipal, localInterest_rate, localYears);
		testObject.calculateInterest(localYears - 1);
		assertEquals("10.0", testObject.principal);
	}
}
