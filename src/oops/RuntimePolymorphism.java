package oops;

class RuntimeParent {

	public RuntimeParent() {
		System.out.println("RuntimeParent");
	}

}

class RuntimeChild extends RuntimeParent {

	public RuntimeChild() {
		super();
		System.out.println("RuntimeChild");
	}

}

public class RuntimePolymorphism {

	public static void main(String[] args) {
		new RuntimeChild();
	}

}
