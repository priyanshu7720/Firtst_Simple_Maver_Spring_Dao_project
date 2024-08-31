package mainApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao_impliment_class.AccountDaoImt;
import dao_interface.AccountDao;
import pojosClasses.Account;

public class CreateMulipul_Accounts {

	
	public static void main(String[] args) {
		// 
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Account_as_a _Bean_without_value.xml");
		Account a1 = context.getBean(Account.class);
		Account a2 = context.getBean(Account.class);
		Account a3 = context.getBean(Account.class);
		
		a1.setAcNo(123); a1.setAcType("saving"); a1.setBalance(1234);
		a2.setAcNo(456); a2.setAcType("current"); a2.setBalance(5678);
		a3.setAcNo(789); a3.setAcType("patha ni"); a3.setBalance(9123);
		ApplicationContext context1 = new ClassPathXmlApplicationContext("AccountDaoImp_as_a_Bean.xml");
		AccountDao ad= (AccountDaoImt)context1.getBean("account");
		System.out.println("account info of a1 : "+ad.getAccountInfo(a1));
		System.out.println(" check aacount balance : "+ad.chrckBalance(a1));
		System.out.println("withdrowl 500 in a1 : "+ad.withdrowl(a1, 500));
	//	System.out.println(" check aacount balance after withdroeling : "+ad.chrckBalance(a1));

		System.out.println("account info of a2 : "+ad.getAccountInfo(a2));
		System.out.println(" check aacount balance : "+ad.chrckBalance(a2));
		System.out.println("withdrowl 500 in a2 : "+ad.withdrowl(a2, 500));
	//	System.out.println(" check aacount balance after withdroeling : "+ad.chrckBalance(a2));

		System.out.println("account info of a3 : "+ad.getAccountInfo(a3));
		System.out.println(" check aacount balance : "+ad.chrckBalance(a3));
		System.out.println("withdrowl 500 in a3 : "+ad.withdrowl(a3, 500));
	//	System.out.println(" check aacount balance after withdroeling : "+ad.chrckBalance(a3));

		
	}

}
