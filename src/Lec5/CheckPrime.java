package Lec5;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	boolean res=isPrime(n);
	System.out.print(res);
	
	}
	public static boolean isPrime(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
}