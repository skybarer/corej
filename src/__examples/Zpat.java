package __examples;

public class Zpat {
	public static void main(String[] args) {
		int n=10;
		
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=1;j--) {
				if(i==1 || i==n) {
					System.out.print("*");
				}
				if(i>1 && i<n){
					if(i==j)
					System.out.print("*");
					else 
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
