/* Author: Param Mehta */

public class AccountTest {

	public static void main(String[] args) {
		System.out.print("Get method test: ");
		if(testGetMethods()){ System.out.println("Passed");}
		else { System.out.println("Failed");}
		
		System.out.print("\nDeposit Test: ");
		if(testDeposit()){ System.out.println("Passed");}
		else { System.out.println("Failed");}

		System.out.print("\nWithdraw Test: ");
		if(testWithdraw()){ System.out.println("Passed");}
		else { System.out.println("Failed");}
		
		System.out.println("\nTest Display: ");
		testDisplay();
	}
	
	public static boolean testGetMethods(){
		Account a = new Account("Test Owner", 1234, 1000.0);
		if(a.getOwner().equals("Test Owner"))
			if(a.getAccNum()==1234)
				if(a.balance == 1000.0)
					return true;
		return false;
	}
	public static boolean testDeposit(){
		Account a = new Account("Test Owner", 1234, 1000.0);
		a.deposit(100);
		if(a.getBalance() == 1100.0)
			return true;
		return false;
	}
	public static boolean testWithdraw(){
		Account a = new Account("Test Owner", 1234, 1000.0);
		if(a.withdraw(100) == 100)
			if(a.getBalance() == 900.0)
				if(a.withdraw(1000) == -1)
					return true;
		return false;
	}
	public static void testDisplay(){
		Account a = new Account("Test Owner", 1234, 1000.0);
		System.out.println("Check to see your display matches the proper display");
		System.out.println("Your display returns: ");
		System.out.println(a.displayAccount());
		System.out.println("\n The proper display is");
		System.out.println("Name: Test Owner\nAccount Number: 1234\nBalance: 1000.0");
	}
}
