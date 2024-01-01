package DynamicProgramming;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
long l=10000000000l;

long n=scn.nextLong();
int res=(int)solBuse(n);
System.out.println(res);
	}
	public static int sol(int n)
	{
		if(n==0||n==1)
		{
			return n;
		}
		int fh=sol(n-1);
		int sh=sol(n-2);
	return fh+sh;
	}
	public static int solTD(int n,int dp[])
	{
		if(n==0||n==1)
		{
			return n;
		}
		if(dp[n]!=0)
		{
			return dp[n];
		}
		int fh=solTD(n-1,dp);
		int sh=solTD(n-2,dp);
	dp[n]=fh+sh;
		return fh+sh;
}
	public static int solBu(int n)
	{
		int dp[]=new int[n+1];
		dp[0]=0;
		dp[1]=1;
		for(int i=2;i<=n;i++)
		{
			dp[i]=dp[i-1]+dp[i-2];
			
		}
		return dp[n];
	}
	public static int solBuse(long n)
	{
		int a=1;
		int b=0;
		if(n==0||n==1)
		{
			return (int)n;
		}
		for(int i=2;i<=n;i++)
		{
			int res=a+b;
			b=a;
			a=res;
		}
		return a;
	}
}