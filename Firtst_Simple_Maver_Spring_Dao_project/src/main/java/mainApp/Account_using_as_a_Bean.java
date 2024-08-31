package mainApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao_impliment_class.AccountDaoImt;
import dao_interface.AccountDao;
import pojosClasses.Account;

public class Account_using_as_a_Bean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		ApplicationContext context = new ClassPathXmlApplicationContext("Account_as_a_Bean_withValues.xml");
		Account a= context.getBean(Account.class);
		
		AccountDaoImt adi = new AccountDaoImt();
		System.out.println(a);
		System.out.println(adi.withdrowl(a, 600));
		System.out.println(adi.chrckBalance(a));
		System.out.println(" "+adi.getAccountInfo(a));
					
	}

}
