package LeetCodePractice;

import java.util.Stack;

public class RemoveStarFromString {

	public static void main(String[] args) {

		System.out.println(removeStars("shr**tt*"));

	}

	public static String removeStars(String s) {

		// char[] c=s.toCharArray();
		Stack<Character> st = new Stack<>();

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '*') {
				st.pop();
			} else {
				st.push(s.charAt(i));
			}

		}

		StringBuffer sf = new StringBuffer();
		while (!st.isEmpty()) {

			sf.append(st.pop());
		}

		return sf.reverse().toString();

	}

}
