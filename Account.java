/* Author: Param Mehta */

public class Account implements iAccounts {
	
	String owner;
	int accountNumber;
	double balance;
	
	public Account(String string, int i, double d) {
		owner = string;
		accountNumber = i;
		balance = d;
		
	}


	public void deposit(double amount) {
		 this.balance += amount;
	}

	public double withdraw(double amount) {
		
		if(this.balance - amount > 0){
			this.balance -= amount;
			return amount;
		}
		else
			return -1;
	}

	public String displayAccount() {
		return "Name: " + owner
		+ "\n Account Number: " + getAccNum()
		+ "\n Balance: " + getBalance() ;
	}

	
	public String getOwner() {
		
	return owner;
		
	}


	public double getBalance() {
		
		return balance;
	}
	
	public void setBal(double bal) {
		balance = bal;
	}


	public int getAccNum() {
		
		return accountNumber;
	}

	
		
}
