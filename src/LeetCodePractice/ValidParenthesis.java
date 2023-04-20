package LeetCodePractice;

import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isvalid("[]{}()"));
	}

	public static boolean isvalid(String s) {
		// 1. (()) 2. ()()[]
		char[] ar = s.toCharArray();
		Stack<Character> st = new Stack<>();
		int x = ar.length % 2;
		int count = -1;
		if (x == 0) {
			for (int i = 0; i < ar.length; i++) {
				if (ar[i] == '(' || ar[i] == '[' || ar[i] == '{') {
					st.push(ar[i]);
					count++;
				} else if (ar[i] == ')' && !st.empty()) {
					if (st.get(count) == '(') {
						st.pop();
						count--;
						continue;

					} else {
						return false;
					}
				}

				else if (ar[i] == ']' && !st.empty()) {
					if (st.get(count) == '[') {
						st.pop();
						count--;
						continue;
					} else {
						return false;
					}

				} else if (ar[i] == '}' && !st.empty()) {
					if (st.get(count) == '{') {
						st.pop();
						count--;
						continue;
					} else {
						return false;
					}
				} else {
					return false;
				}
			}
		} else {
			return false;
		}

		if (st.empty()) {
			return true;
		} else {
			return false;
		}

	}
}
