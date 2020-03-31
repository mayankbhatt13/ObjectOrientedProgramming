class Base{
	public void run() {
		System.out.println("Base Class method is running");
	}
}
class Derived extends Base{
	public void run() {
		System.out.println("Derived class method is running");
	}
}
public class methodOverridingDemo {
	public static void main(String[] args) {
		Base b = new Base();
		b.run();
		Derived d = new Derived();
		d.run();
		/*Calling method from derived class object using Parent class reference. It will first verify that
		 * if method is overridden and implementation is present in child class or not, if yes it will invoke child class
		 * method else if no implementation is there it will invoke parent class method. */
		Base bb = new Derived();
		bb.run();
		//This type of Object creation is invalid in java (Derived dd = new Base();) 
	}
}
