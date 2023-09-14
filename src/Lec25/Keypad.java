package Lec25;

import java.util.ArrayList;

public class Keypad {

	public static void main(String[] args) {
		ArrayList<String> ans = sol("43", "");
		System.out.println(ans);
	}

	public static ArrayList<String> sol(String str, String ans) {
		if (str.length() == 0) {
//			System.out.println(ans);
			ArrayList<String> list = new ArrayList();
			list.add(ans);
			return list;
		}
		ArrayList<String> mr = new ArrayList();
		char ch = str.charAt(0);
		String temp = getString(ch);
		for (int i = 0; i < temp.length(); i++) {
			char ch1 = temp.charAt(i);
			ArrayList<String> res = sol(str.substring(1), ans + ch1);
			for (int j = 0; j < res.size(); j++) {
				mr.add(res.get(j));
			}
		}
		return mr;
	}

	public static String getString(char ch) {
		if (ch == '2') {
			return "abc";
		}

		if (ch == '3') {
			return "def";
		}

		if (ch == '4') {
			return "ghi";
		}

		if (ch == '5') {
			return "jkl";
		}

		if (ch == '6') {
			return "mno";
		}

		if (ch == '7') {
			return "pqrs";
		}

		if (ch == '8') {
			return "tuv";
		}

		if (ch == '9') {
			return "wxyz";
		}

		return null;
	}
}