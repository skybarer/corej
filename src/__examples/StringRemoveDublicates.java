package __examples;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringRemoveDublicates {

	public static void main(String[] args) {
		String str = "akashdharinkollu";
		Set<Character> charset = new LinkedHashSet<>();
		for (char c : str.toCharArray())
			charset.add(c);
		
		for (char c : str.toCharArray())
			charset.add(c);
		
		System.out.println(str);
		charset.forEach(System.out::print);

	}

}
