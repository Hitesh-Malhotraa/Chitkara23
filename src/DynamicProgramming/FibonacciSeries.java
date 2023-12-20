package DynamicProgramming;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
//int res=sol(n);
//int ans=solTd(n,new int[n+1]);
System.out.println(solBuse(n));
//System.out.println(ans);
//	System.out.println(res);
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
	public static int solTd(int n,int dp[])
	{
		if(n==0||n==1)
		{
			return n;
		}
		if(dp[n]!=0)
		{
			return dp[n];
		}
		int fh=solTd(n-1,dp);
		int sh=solTd(n-2,dp);
		
		int res= fh+sh;
dp[n]=res;
return res;
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
	public static int solBuse(int n)
	{
		int a=1;
		int b=0;
		for(int i=2;i<=n;i++)
		{
			int res=a+b;
			b=a;
			a=res;
		}
		return a;
		
	}
	
}
