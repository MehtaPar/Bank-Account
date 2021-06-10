import java.util.ArrayList;

public interface iAccounts {
	public void deposit(double amount);
	public double withdraw(double amount);
	public String displayAccount();
	public String getOwner();
	public double getBalance();
	

}

interface iCheckingAccount{
	public void deposit(double amount);
	public double withdraw(double amount);
	public String displayAccount();
	public void depositInterest();
}

interface iBank{
	public ArrayList<Account> getAccounts();
	public String displayAccount(int accNum);
	public String displayAccounts(String name);
	public void addAccount(String name, int accNum, double bal, boolean checking);
	public int findAccount(int accNum);
	public int findAccount(String name);
	
}