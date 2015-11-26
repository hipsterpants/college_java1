
/**
 * @author Sean McDonald
 * 
 * The interface for the SavingsAccount and CheckingAccount classes.
 */

public interface Interest {
	
	void setPrincipal(double principal);
	double getPrincipal();
	void setInterestRate(int interest_rate);
	int getInterestRate();
	void calculateInterest(int years);

}
