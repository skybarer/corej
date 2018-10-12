package oops;

public enum EnumTest {
	
	/*
	 * provides type-safety and can be used inside switch statment like int
	 * variables.
	 */
	
	

	RED, GREEN, BLUE,YELLOW;
	
	private EnumTest() {
		
		System.out.println(this.getClass());
		// Enum allows only private constructor
	}
	
	//variables cannot be written inside enum
	
	//mehtods cannot be written in emun.
	
	
	

	public static void main(String[] args) {
		
		/*cannot create object for enum */
	/*	EnumTest EnumTest = new EnumTest();*/

		System.out.println("enum main method");
		System.out.println(EnumTest.RED);
	}

}
