package oops;

class CompileTimeParent {

	String a = "parent";

	static String b = "static-parent";

	public static void compilteTimeTest() {
		System.out.println("CompileTimeParent");
	}

}

class CompileTimeChild extends CompileTimeParent {

	String a = "child";
	
	static String b = "static-child";

	public static void compilteTimeTest() {
		System.out.println("CompileTimeChild");
	}

}

public class CopiletimePolymorphism {

	public static void main(String[] args) {

		CompileTimeParent.compilteTimeTest();// CompileTimeParent
		CompileTimeChild.compilteTimeTest();// CompileTimeChild

		// The static method compilteTimeTest() from the type CompileTimeParent should
		// be accessed in a static way

		CompileTimeParent parent = new CompileTimeParent();
		parent.compilteTimeTest();// CompileTimeParent

		CompileTimeParent parentChild = new CompileTimeChild();
		parentChild.compilteTimeTest();// CompileTimeParent

		CompileTimeChild child = new CompileTimeChild();
		child.compilteTimeTest();// CompileTimeChild
		
		
		System.out.println(parent.a);//parent
		System.out.println(parentChild.a);//parent
		System.out.println(child.a);//child
		
		System.out.println(parent.b);//parent
		System.out.println(parentChild.b);//parent
		System.out.println(child.b);//child

	}

}
