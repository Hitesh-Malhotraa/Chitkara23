package Lec6;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int res=reverse(n);
System.out.println(res);
	}
	public static int reverse(int n)
	{
		int res=0;
		while(n>0)
		{
			int rem=n%10;
			res=(res*10)+rem;
			n=n/10;
		}
		return res;
	}

}
