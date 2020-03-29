
public abstract class abstractDemo {
	//Abstract methods
	public abstract int id();
	public abstract void name();
	//Concrete method
	public void display(String msg) {
		System.out.println("Message Entered is :- "+ msg);
	}
}

class childClass extends abstractDemo{

	@Override
	public int id() {
		System.out.println("Id method is called");
		return 13;
	}

	@Override
	public void name() {
		System.out.println("This is Abstract Demo");		
	}
	@Override
	public void display(String msg) {
		System.out.println("After method overloading Message is :- "+msg);
	}
	
}