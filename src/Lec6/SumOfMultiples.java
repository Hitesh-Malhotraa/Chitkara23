package Lec6;
import java.util.Scanner;
public class SumOfMultiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
int res=sol(n);
System.out.println(res);
	}
	public static int sol(int n)
	{int sum=0;
		for(int i=3;i<=n;i++)
		{
			if(i%3==0||i%5==0||i%7==0)
			{
				sum+=i;
			}
		}
		return sum;
	}

}
