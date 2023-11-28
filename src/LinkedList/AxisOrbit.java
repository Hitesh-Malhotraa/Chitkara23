package LinkedList;

import java.util.Scanner;

public class AxisOrbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		String ans = sol(str);
		System.out.println(ans);
	}

	public static String sol(String str) {
		// odd
		String ans = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = 1; j + i < str.length() && i - j >= 0; j++) {
				if (str.charAt(i + j) != str.charAt(i - j)) {
					break;
				} else {
					int strt = i - j;
					int end = i + j + 1;
					String res = str.substring(strt, end);
					if (ans.length() < res.length()) {
						ans = res;
					}
				}
			}

		}
		// even;
		for (double i = 0.5; i < str.length(); i++) {
			for (double j = 0.5; i + j < str.length() && i - j >= 0; j++) {
				int prev = (int) (i - j);
				int next = (int) (i + j);
				if (str.charAt(prev) != str.charAt(next)) {
					break;
				} else {
					int strt = prev;
					int end = next + 1;
					String res = str.substring(strt, end);
					if (ans.length() < res.length()) {
						ans = res;
					}
				}
			}
		}
		if(ans.length()==0)
		{
			return str.charAt(0)+"";
		}
		return ans;
	}
}