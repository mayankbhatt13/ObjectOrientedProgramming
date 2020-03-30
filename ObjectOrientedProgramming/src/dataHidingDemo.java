
class BankAccount {
	//Data hiding concept by declaring each essential attribute as private. Then after proper login user can use those. 
	private double balance = 1000;
	private String userName = "mayankbhatt";
	private String password = "mb13";
	
	public double getBalance(String uname, String upass) {
		if(this.userName == uname && this.password == upass) {
			return balance;
		}
		else {
			return 0.0;
		}
	}
}

public class dataHidingDemo{
	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		System.out.println("Balance is :- "+ba.getBalance("mayankbhatt", "mb13"));// Correct user detail
		System.out.println("Balance is :- "+ba.getBalance("mayankbhatt", "mb133"));// InCorrect user detail
	}
}