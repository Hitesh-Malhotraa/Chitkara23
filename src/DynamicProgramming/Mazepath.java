package DynamicProgramming;

public class Mazepath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][]=new int[30][30];

//		int ans=solTD(arr,0,0,arr.length-1,arr.length-1,new int[30][30]);
int ans=solBu(arr);	
System.out.println(ans);
	}
	public static int sol(int arr[][],int cr,int cc,int er,int ec)
	{
		if(cr==er&&cc==ec)
		{
			return 1;
		}
		if(cr>er||cc>ec)
		{
			return 0;
		}
		int down=sol(arr,cr+1,cc,er,ec);
		int right=sol(arr,cr,cc+1,er,ec);
		return down+right;
	}
	public static int solTD(int arr[][],int cr,int cc,int er,int ec,int dp[][])
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
		int down=solTD(arr,cr+1,cc,er,ec,dp);
		int right=solTD(arr,cr,cc+1,er,ec,dp);
		int res= down+right;
	dp[cr][cc]=res;
	return res;
	}
public static int solBu(int arr[][])
{
	int dp[][]=new int[arr.length+1][arr.length+1];
dp[arr.length-1][arr.length-1]=1;
for(int row=arr.length-1;row>=0;row--)
{
	for(int col=arr.length-1;col>=0;col--)
	{
		if(row==arr.length-1&&col==arr.length-1)
		{
			continue;
		}
		int down=dp[row+1][col];
		int right=dp[row][col+1];
		int res=down+right;
		dp[row][col]=res;
	}
}
return dp[0][0];
}
}
