/*Encapsulation is a combination of Data hiding and Abstraction*/
class Account{
	private double balance; //Data Hiding
	//Created getter and setter for the variable and only accessed through get and set methods is approach of Abstraction
	public double getBalance() {
		//Can have required validations
		return balance;
	}

	public void setBalance(double balance) {
		//Can have required validations
		this.balance = balance;
	}
}
public class EncapsulationDemo {
	public static void main(String[] args) {
		Account ac = new Account();
		ac.setBalance(1000);
		System.out.println("Balance is : "+ ac.getBalance());
	}
}
