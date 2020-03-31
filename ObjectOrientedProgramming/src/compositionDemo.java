
class Home{
	private Kitchen kitchen;
	//Constructor
	public Home() {
		//We are creating object of Kitchen inside constructor of Home class, So if home class destroys
		///Kitchen class will also, resulting in stating the approach of Composition.
		kitchen = new Kitchen();
		kitchen.setFood("Pizza");
	}
	
	public String getFood() {
		return kitchen.getFood();
	}
}
class Kitchen{
	private String food;

	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
}
public class compositionDemo {
	public static void main(String[] args) {
		Home h = new Home();
		System.out.println("Food is :- "+h.getFood());
	}
}
