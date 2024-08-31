package mainApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao_interface.AccountDao;
import pojosClasses.Account;

public class TestSingletonScopInXml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("TestSingletonScopInXml.xml");
		AccountDao adi =(AccountDao)context.getBean("acDaoImt");
		Account a1 =(Account)context.getBean("account1");
		Account a2 =(Account)context.getBean("account2");
		Account a3 =(Account)context.getBean("account3");
		
		System.out.println(a1+"\n " +a1.hashCode() +"");
		System.out.println(" account1 : adi : \n account balance : "+adi.chrckBalance(a1));
		System.out.println("withdrowl 1000 : "+adi.withdrowl(a1, 1000)+"\n \n");
		
		System.out.println(a2+"\n " +a2.hashCode() +"");
		System.out.println(" account2 : adi : \n account balance : "+adi.chrckBalance(a2));
		System.out.println("withdrowl 1000 : "+adi.withdrowl(a2, 1000)+"\n \n");
		
		System.out.println(a3+"\n " +a3.hashCode() +"");
		System.out.println(" account3 : adi : \n account balance : "+adi.chrckBalance(a3));
		System.out.println("withdrowl 1000 : "+adi.withdrowl(a3, 1000)+"\n \n");
		
	}

}
