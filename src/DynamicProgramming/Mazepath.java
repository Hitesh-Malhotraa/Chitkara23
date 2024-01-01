package DynamicProgramming;

import java.util.Scanner;

public class Mazepath {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int m=scn.nextInt();
	int arr[][]=new int[n][m];
//int res=solTD(arr,0,n-1,0,m-1,new int[n][m]);
int res=solBu(arr);
	System.out.println(res);
	}
	public static int sol(int arr[][],int cr, int er,int cc,int ec)
	{
		if(cr==er&&cc==ec)
		{
			return 1;
		}
		if(cr>er||cc>ec)
		{
			return 0;
		}
		int cnt=0;
		cnt+=sol(arr,cr+1,er,cc,ec);
		cnt+=sol(arr,cr,er,cc+1,ec);
		return cnt;
	}
	
	
	public static int solTD(int arr[][],int cr, int er,int cc,int ec,int dp[][])
	{
		if(cr==er&&cc==ec)
		{
			return 1;
		}
		if(cr>er||cc>ec)
		{
			return 0;
		}
		if(dp[cr][cc]!=0)
		{
			return dp[cr][cc];
		}
		int cnt=0;
		cnt+=solTD(arr,cr+1,er,cc,ec,dp);
		cnt+=solTD(arr,cr,er,cc+1,ec,dp);
		dp[cr][cc]=cnt;
		return cnt;		
	}
	public static int solBu(int arr[][])
	{
		int dp[][]=new int[arr.length+1][arr[0].length+1];
	dp[arr.length-1][arr[0].length-1]=1;
	for(int row=arr.length-1;row>=0;row--)
	{
		for(int col=arr[0].length-1;col>=0;col--)
		{
			if(col==arr[0].length-1&&row==arr.length-1)
			{
				continue;
			}
			int res=dp[row][col+1]+dp[row+1][col];
			dp[row][col]=res;
		}
	}
	return dp[0][0];
	}
}