public interface interfaceDemo {
	static final String a = "Static constant";
	public void firstMethod();
	public int secondMethod();
	public void thirdMethod();
	default int fourthMethod() {
		return 0;
	}
}
/*For following the interface implementation rule each class should have to implement all the absatract methos
 inside the Interface. If one class does't follow this rule that class has to made abstract class.*/
 class Test implements interfaceDemo{

	@Override
	public void firstMethod() {
		//Give implementation according to the requirement.
	}

	@Override
	public int secondMethod() {
		// Give implementation according to the requirement.
		return 0;
	}

	@Override
	public void thirdMethod() {
		// Give implementation according to the requirement.
	}
 }