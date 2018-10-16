package oops;

// only public and abstract are allowed
public abstract interface InterfaceTest {

	// <T> allows generic types

	// public static final variables are allowed
	public static final int a = 0;

	int b = 4;

	// Interfaces cannot have constructors
	/*
	 * public InterfaceTest() {
	 * 
	 * }
	 */

	public default void defaultMethod() {
		// default methods are allowed
	}

	public static void staticMethod() {
		// static methods are allowed
	}

	// subclass

	// The interface member type SubClassTest can only be public
	// The class SubClassTest can be either abstract or final, not both
	public static abstract class SubClassTest {

		public static void main(String[] args) {

			System.out.println("main method in sub class");
		}

	}

	// sub interface
	interface SubInterfaceTest {

	}

	// sub enum
	enum EnumTest {

		RED, GREEN, BLUE

	}

	public static void main(String[] args) {

		System.out.println("interface main method");

		System.out.println(InterfaceTest.a);
		System.out.println(InterfaceTest.a);
	}

}
