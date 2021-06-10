/* Author: Param Mehta */

public class CheckingAccount extends Account implements iCheckingAccount{
	
	double interestRate;
	double minimumBalance;

	public CheckingAccount(String string, int i, double d) {
		super(string, i, d);
		string = owner;
		i = accountNumber;
		d = balance;
		
		minimumBalance = 500.0;
		interestRate = 0.012;
		
		
	}


	public String getOwner() {
		return owner;
	}


	public double getBalance() {
		return balance;
	}


	public double withdraw(double amount) {
		double extra = balance - amount;
		if(balance - amount > minimumBalance){
			setBal(extra) ;
			return amount;
			//setter method for setBalance
		}
		else
			return -1;
	}






	public String displayAccount() {
		return "Name: " + owner
		+ "\n Account Number: " + getAccNum()
		+ "\n Balance: " + getBalance()
		+ "\n Interest Rate: " + getInterestRate();
		
	}

	public double getInterestRate() {
		return interestRate;
	}
	

	public void depositInterest() {
		//double newint = getInterestRate() / 100;
		double interest = getBalance() * getInterestRate();
		interest = interest * 100;
		Math.floor(interest);
		interest = interest / 10;
		//balance += interest;
		this.balance += interest;
		
	}
	
}
