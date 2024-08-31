package mainApp;

import dao_impliment_class.AccountDaoImt;
import dao_interface.AccountDao;
import pojosClasses.Account;

public class Main {

	public static void main (String arg[]) {
		
		Account a = new Account(101," saving", 1000);
		
		AccountDao aa = new AccountDaoImt();
		System.out.println("  "+ aa.chrckBalance(a));
		System.out.println(" "+ aa.getAccountInfo(a));
		System.out.println(" "+ aa.withdrowl(a, 500));
	
	}
}
