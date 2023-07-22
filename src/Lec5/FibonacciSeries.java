package Lec5;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int res=fibo(n);
	System.out.println(res);
	}
	public static int fibo(int n)
	{
		if(n==0||n==1)
		{
			return n;
		}
		int cnt=2;
		int a=1;
		int prev=1;
		int b=0;
		while(cnt<=n)
		{
			int sum=a+b;
			prev=a;
			b=a;
			a=sum;
			cnt+=1;
		}
		System.out.print(b+"+"+prev+"="+a);
		return a;
	}

}
