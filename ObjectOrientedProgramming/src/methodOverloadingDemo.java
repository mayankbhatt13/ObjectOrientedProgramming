class TestDemo{
	public void sum(int x, int y) {
		System.out.println("Sum using two parameterised method "+ x+y);
	}
	public void sum(int x, int y, int z) {
		System.out.println("Sum using three parameterised method "+ x+y+z);
	}
	public void sum(double x) {
		System.out.println("Result from single parameterised mathod "+ x*5);
	}
}
public class methodOverloadingDemo {
	public static void main(String[] args) {
		TestDemo t = new TestDemo();
		t.sum(5,6);
		t.sum(7,8,9);
		t.sum(3);
		t.sum(10.25f);//It will implicitly convert float to double.
	}
}
