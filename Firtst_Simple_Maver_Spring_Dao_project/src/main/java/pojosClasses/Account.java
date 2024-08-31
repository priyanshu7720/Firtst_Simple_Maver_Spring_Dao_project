package pojosClasses;

public class Account {
	
	private int acNo ;
	private String acType;
	private double balance;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int acNo, String acType, double balance) {
		super();
		this.acNo = acNo;
		this.acType = acType;
		this.balance = balance;
	}
	public int getAcNo() {
		return acNo;
	}
	public void setAcNo(int acNo) {
		this.acNo = acNo;
	}
	public String getAcType() {
		return acType;
	}
	public void setAcType(String acType) {
		this.acType = acType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [acNo=" + acNo + ", acType=" + acType + ", balance=" + balance + "]";
	}
	
	
}
