package Lec6;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
  int res= sum(n);
	System.out.println(res);
	}
public static int sum(int n)
{
	int sum=0;
	while(n>0)
	{
		int rem=n%10;
		sum=sum+rem;
		n=n/10;
	}
	return sum;
}
}
