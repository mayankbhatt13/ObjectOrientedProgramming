import java.util.ArrayList;

abstract class mobilee{
	ArrayList<String> contact = new ArrayList<String>();
	abstract void calling(String number);
	abstract void senMessage(String message);
	/*Concrete Method*/
	public void addContact(String number) {
		contact.add(number);
	}
}

class samsung extends mobilee{
	@Override
	void calling(String number) {
		System.out.println("Calling ... "+ number );
	}

	@Override
	void senMessage(String message) {
		System.out.println("Sending Message ... "+ message);
	}
}
public class abstractionFromAbstractClass {
	public static void main(String[] args) {
		samsung myNewPhone = new samsung();
		myNewPhone.calling("654789321");
		myNewPhone.senMessage("Abstraction using Abstract class .. ");
	}
}
