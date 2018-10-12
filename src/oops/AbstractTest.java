package oops;

public abstract class AbstractTest implements InterfaceTest {

	int a = 0;
	static int b = 0;
	 static final int c = 0;

	public final static void test() {
		System.out.println("static final in abstract method.");
	}

	public AbstractTest() {
		System.out.println("abstract class constructor.");
	}

	// can have abstract methods
	public abstract void abstractMethod();

	public void concreteMethod() {
		// can have concrete method
	}

	// abstract class may or may-not contain abstract methods/concrete methods.

	public static void main(String[] args) {
		AbstractTest abstractTest= new AbstractTest() {
			
			@Override
			public void abstractMethod() {
			System.out.println("new Classes");
				
			}
		};		
		System.out.println("abstract test");
		
		abstractTest.test();
	
	}

}
