package Lec22;

import java.util.Scanner;

public class BostonNumber {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
//		   System.out.println(fact(N));
		System.out.println(check(N));

	}

	public static int fact(int n) {
		int c = 0;
		while (n != 1) {
			for (int i = 2; i <= n;) {
				int sum = 0;
				if (n % i == 0) {

					if (i > 10) {
						int temp1 = i;
						while (temp1 != 0) {
							int r = temp1 % 10;
							sum += r;
							temp1 = temp1 / 10;
						}
						c += sum;

					} else
						c += i;
					n = n / i;
				}
				if (n % i != 0)
					i++;
			}
		}
		return c;
	}

	public static int sumDigits(int n) {
		int temp = n;
		int c = 0;
		while (temp != 0) {
			int r = temp % 10;
			c += r;
			temp = temp / 10;
		}
		return c;
	}

	public static int check(int n) {
		int sumFact = fact(n);
		int sumDigits = sumDigits(n);
		if (sumFact == sumDigits)
			return 1;
		else
			return 0;
	}

}
