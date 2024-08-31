package mainApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao_impliment_class.AccountDaoImt;
import dao_interface.AccountDao;
import pojosClasses.Account;

public class AccountDaoImp_using_as_a_Bean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		ApplicationContext context = new ClassPathXmlApplicationContext("AccountDaoImp_as_a_Bean.xml");
		AccountDao ad= (AccountDaoImt)context.getBean("account");
		Account a= new Account(2004, "current", 5200);
		System.out.println(a);
		System.out.println(ad.withdrowl(a, 600));
		System.out.println(ad.chrckBalance(a));
		System.out.println(" "+ad.getAccountInfo(a));
		
	}

}
