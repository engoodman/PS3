
import java.util.Date;

public class Account {
	private int id;
	private int id(){
		id = 0;
		return id;
	}
	private double balance;
	private double balance(){
		balance = 0;
		return balance;
	}
	private double annualInterestRate;
	private double annualInterestRate(){
		annualInterestRate = 0;
		return annualInterestRate;
	}
	private Date dateCreated;
	private Date dateCreated(){
		Date dateCreated = new Date();
		System.out.println(dateCreated.toString());
		return dateCreated;
	}
	
	Account(){
		id = 0;
		balance = 0.0;
		annualInterestRate = 0.0;
	}
	Account(int newID, double newBalance){
		id = newID;
		balance = newBalance;
		
	}
	Account(int newID, double newBalance, double newAnnualInterestRate){
		id = newID;
		balance = newBalance;
		annualInterestRate = newAnnualInterestRate;
		
	}
	
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public Date getDateCreated() {

		return dateCreated;
	}
	public double getMonthlyInterestRate(){
		double getMonthlyInterestRate = annualInterestRate/12;
		return getMonthlyInterestRate;
	}
	public double withdraw(double amount){
		return balance -= amount;
	}
	public double deposit(double amount){
		return balance += amount;
		
	}
	public void Test() {
		Account account = new Account(1122,20000,4.5);
		account.withdraw(2500);
		account.deposit(3000);
		System.out.println("Your balance is: " + account.getBalance());
		System.out.println("Your monthly interest rate is: " + account.getMonthlyInterestRate());
		System.out.println("Date created: " + dateCreated);
	

}
}
