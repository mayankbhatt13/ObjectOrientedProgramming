import java.util.Scanner;

public class classObject {
	private boolean isOn;
	public void turnOn() {
		isOn = true;
		System.out.println("Fan is on -> "+isOn);
	}
	public void turnOff() {
		isOn = false;
		System.out.println("Fan is on -> "+isOn);
	}
	public static void main(String[] args) {
		classObject obj = new classObject();
		Scanner scannerObj = new Scanner(System.in);
		System.out.println("**** Select from the Menu **** \n 1.) To turn on fan press 1 \n 2.) To turn off fan press 2");
		int userInput = scannerObj.nextInt();
		switch(userInput) {
			case 1 :{
				obj.turnOn();
				break;
			}
			case 2 :{
				obj.turnOff();
				break;
			}
			default : {
				System.out.println("User has selected wrong choice");
			}
		} 
	}
}
