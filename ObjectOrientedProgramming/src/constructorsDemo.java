class conDemo{
	private int x = 0;
	/* Non Parameterized Constructor*/
	conDemo(){
		x = 10;
	}
	conDemo(int a){
		this.x = a;
	}
	
	public void display() {
		System.out.println("value of x is :- "+x);
	}
}
public class constructorsDemo {
public static void main(String[] args) {
	conDemo nonParameterizedObj = new conDemo();
	nonParameterizedObj.display();
	conDemo parameterizedObj = new conDemo(13);
	parameterizedObj.display();
}
}
