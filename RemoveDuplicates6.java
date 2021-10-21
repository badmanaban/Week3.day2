package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates6 {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		Set<String> s = new LinkedHashSet<String>();
		for (String string : split) {
			s.add(string);
		}
		System.out.println(s);
		

	}

}
