package __examples;

public class Fact {
	static int fact(int i) {
		if(i<=1) {
			return 1;
		}else {
			return i*fact(i-1);
		}
	}
	public static void main(String[] args) {
		int n=6;
		
		System.out.println(fact(n));
	}

}
