import java.io.*;
import java.util.*;
public class Util {

	public static ArrayList<Account> getAccounts() throws NumberFormatException, IOException{
		ArrayList<Account>accounts = new ArrayList<Account>();
		FileReader inFile = null;
		try{
			inFile = new FileReader("AccountFile.txt");
				
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		BufferedReader inStream = new BufferedReader(inFile);
		String name, accNum, bal, isChecking;
		while(	((name = inStream.readLine()) != null) &&
				((accNum = inStream.readLine()) != null) &&
				((bal = inStream.readLine()) != null)	&&
				((isChecking = inStream.readLine()) != null)){
			if(Boolean.parseBoolean(isChecking)){
			accounts.add(new CheckingAccount(name, Integer.parseInt(accNum),Double.parseDouble(bal)));
			}
			else{
				accounts.add(new Account(name, Integer.parseInt(accNum),Double.parseDouble(bal)));
			}
		}
		return accounts;
	}
		
	public static String splitAccounts(String s){
		ArrayList<Integer>locs = new ArrayList<Integer>();
		int index = s.indexOf("Name");
		while(index >=0){
			locs.add(index);
			index = s.indexOf("Name", index + 4);
		}
		String output = "";
		for(int i = 0; i < locs.size()-1; i++){
			output += s.substring(locs.get(i), locs.get(i+1))+"\n\n";
		}
		output += s.substring(locs.get(locs.size()-1));
		return output;
	}
}