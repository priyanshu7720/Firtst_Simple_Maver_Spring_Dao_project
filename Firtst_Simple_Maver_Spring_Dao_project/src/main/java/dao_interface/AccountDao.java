package dao_interface;

import pojosClasses.Account;

public interface AccountDao {
	
	double withdrowl(Account a,double amount);//amount
	
	double chrckBalance(Account a);

	String getAccountInfo(Account a);
	

}
