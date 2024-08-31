package dao_impliment_class;

import dao_interface.AccountDao;
import pojosClasses.Account;

public class AccountDaoImt implements AccountDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public double withdrowl(Account a,double amount) {
		// TODO Auto-generated method stub
		double bal = a.getBalance()-amount;
		return bal;
	}

	@Override
	public double chrckBalance(Account a) {
		
		return a.getBalance();
	}

	@Override
	public String getAccountInfo(Account a) {
		
		return a.toString();
	}

}
