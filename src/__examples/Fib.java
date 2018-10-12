package __examples;

import java.util.ArrayList;
import java.util.List;

public class Fib {
	public static void main(String[] args) {
		int fib3 = 0, fib = 0, fib1 = 1, n = 10;

		List<Integer> list = new ArrayList<>();
		System.out.println(fib + " " + fib1);

		for (int j = 0; j < n; j++) {
			fib3 = 0;
			fib = 0;
			fib1 = 1;
			
			System.out.print(fib + " " + fib1);
			for (int i = 0; i <= j; i++) {
				
				fib3 = fib + fib1;
				
				//System.out.print(" " + fib3);
				list.add(fib3);
				fib = fib1;
				fib1 = fib3;

			}
			System.out.println(list.toString());
			list.removeAll(list);
			System.out.println();
		}
	}
}
