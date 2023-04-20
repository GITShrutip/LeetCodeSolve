package LeetCodePractice;

import java.util.Stack;

public class LongestCommonPrefix {

	public static void main(String[] args) {

		String[] str = { "dog","racecar","car" };
		System.out.println(longestCommonPrefix(str));
	}

	public static String longestCommonPrefix(String[] str) {
		int flag = 1;
		Stack<Character> st = new Stack<>();
		if (str.length == 1) {
			return str[0];
		} else if (str.length > 1 && str.length < 200) {

			for (int i = 0; i < str[0].length(); i++) {
				if (flag == 1) {
					char c = str[0].charAt(i);

					for (int j = 0; j < str.length; j++) {
						if ((i < str[j].length())) {
							if (c == str[j].charAt(i)) {
								if (j == str.length - 1) {
									st.push(c);
								}

							}
						} else {
							flag = 0;
							break;

						}
					}

				}
			}

		}

		StringBuffer sf = new StringBuffer();
		while (!st.empty()) {
			sf.append(st.pop());
		}

		return sf.reverse().toString();

	}

	}

