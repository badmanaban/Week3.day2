package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str1 = "PayPal India";
		char[] charArray = str1.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for(char x : charArray)
		{
			charSet.add(x);
		}
		System.out.println(charSet);
	}

}
