import java.util.ArrayList;
//Achieved abstraction using Interface
interface Mobile{
	public void calling(String number);
	public void sendMessage(String message);
}

class Apple implements Mobile{
	
	private ArrayList<String> contacts = new ArrayList<String>();
	
	public void addContact(String number) {
		contacts.add(number);
	}
	
	@Override
	public void calling(String number) {
		System.out.println("Calling .... "+number);
	}

	@Override
	public void sendMessage(String message) {
		System.out.println("Sending message... "+ message);
	}
}
public class abstractionFromInterface {
	public static void main(String[] args) {
		Apple myPhone = new Apple();
		myPhone.calling("987654321");
		myPhone.sendMessage("This is abstration demo example.");
		myPhone.addContact("6542319875");
	}
}

