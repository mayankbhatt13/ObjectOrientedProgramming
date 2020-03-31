
//Single level inheritance
/*class A{
	public void M1() {
		System.out.println("Mayank Bhatt");
	}
}
public class inheritanceDemo extends A {
	public static void main(String[] args) {
		inheritanceDemo i = new inheritanceDemo();
		i.M1();
	}
}*/

//Multilevel Inheritance
/*class A {
	public void M1() {
		System.out.println("Mayank");
	}
}
class B extends A{
	public void M2() {
		System.out.println("Chandra");
	}
}
class C extends B {
	public void M3() {
		System.out.println("Bhatt");
	}
}
public class inheritanceDemo extends C {
	public static void main(String[] args) {
		inheritanceDemo i = new inheritanceDemo();
		i.M1();
		i.M2();
		i.M3();
		
	}
}*/

//Hierarchical inheritance
/*class A{
	public void M1() {
		System.out.println("Mayank");
	}
}
class B extends A{
	public void M2() {
		System.out.println("Chandra");
	}
}
class C extends A{
	public void M3() {
		System.out.println("Bhatt");
	}
}
public class inheritanceDemo {
	public static void main(String[] args) {
		B b = new B();
		b.M1();
		b.M2();
		C c = new C();
		c.M1();
		c.M3();
	}
}*/

//Multiple Inheritance
interface Interface1{
	public void M1();
}
interface Interface2{
	public void M2();
}
interface Interface3 extends Interface1,Interface2{
	public void M1();
}
class Multiple implements Interface3 {
	@Override
	public void M1() {
		System.out.println("Mayank");
	}
	
	@Override
	public void M2() {
		System.out.println("Bhatt");
	}
}

public class inheritanceDemo{
	public static void main(String[] args) {
		Multiple m = new Multiple();
		m.M1();
		m.M2();
	}
}
