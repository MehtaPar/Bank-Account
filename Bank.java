/* Author: Param Mehta */

import java.util.ArrayList;

public class Bank implements iBank {

	protected ArrayList<Account> account;
	
	public Bank(ArrayList<Account> account) {
		this.account = account;
	}

	public ArrayList<Account> getAccounts() {
		return account;
	}


	public String displayAccount(int accNum) {
		//String display = null;
		for(int k = 0; k < account.size(); k++) {
			if(account.get(k).getAccNum() == accNum) {
				//display += displayAccount(k);
				String info =  account.get(k).displayAccount();
				//if(display != null) {
					return info;
			//	}
			}
		}
		return "Sorry, The Account does not EXIST";	
	}



	 public String displayAccounts(String name) {
		// String display = null;
		for(int j = 0; j < account.size(); j++) {
			if(account.get(j).getOwner().equals(name)) {
				//display += displayAccount(j);
				String information =  account.get(j).displayAccount();
				//if(display != null) {
					return information;
			//	}
			}
		}
					return "Sorry, The Account does not EXIST";	
	}



	public void addAccount(String name, int accNum, double bal, boolean checking) {

		if(checking == true) {
			account.add(new CheckingAccount(name, accNum, bal));
		}
		else {
			account.add(new Account(name, accNum, bal ));
		}
	}
	
	


	public int findAccount(int accNum) 
		{
		int index = 0;
		for(Account j : account)
		{
			if(j.accountNumber == accNum)
			{
				return index;
			}
			index ++;
		}
		return -1;
		}
		
		/*
		for(int k = 0; k < account.size(); k++) {
			if(account.get(k).getAccNum() == accNum) {
				return  account.indexOf(account.get(k));
			}
		}
	return -1;
	}*/

	@Override
	public int findAccount(String name) {
	{
		for(int j = 0; j < account.size(); j++) {
			if(account.get(j).getOwner().equals(name))
			{
				return j;
			}

		}
		return -1;
		}
	}
}
		
		
		
		/*
		for(int j = 0; j < account.size(); j++) {
			if(account.get(j).getOwner() == name) {
				return account.indexOf(account.get(j));
			}
		}
	return -1;
	}
}
*/