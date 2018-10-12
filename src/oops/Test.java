package oops;

class A {

	public A() {
		super();

	}

	public void m1() {
		System.out.println("A-m1");
	}

	public void m2() {
		System.out.println("A-m2");
	}
}

class B extends A {

	public B() {
		super();

	}

	public void m1() {
		System.out.println("B-m1");
	}

	/*public void m2() {
		System.out.println("B-m2");
	}*/
}

public class Test {

	public static void main(String[] args) {
		
		
		B b = new B();
		b.m2();

		A a = new B();

		System.out.println(a.toString());

		// The method m2() is undefined for the type A
		a.m2();

	}

}
