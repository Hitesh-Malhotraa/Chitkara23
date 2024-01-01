package DynamicProgramming;

public class RodCutting {
public static void main(String args[])
{
	int n=8;
//	int arr[]= {1,5,8,9,10,17,17,20};
	int arr[]= {3, 5, 8, 9, 10, 17, 17, 20};
	int ans=sol(arr,n,new int[n+1]);
	System.out.println(ans);
}
public static int sol(int arr[],int rem,int dp[])
{
	if(rem==0||rem<0)
	{
		return 0;
	}
	if(dp[rem]!=0)
	{
		return dp[rem];
	}
	int max=0;
	for(int i=1;i<=rem;i++)
	{
		int res=sol(arr,rem-i,dp)+arr[i-1];
	max=Math.max(res, max);
	}
	dp[rem]=max;
	return max;
}
}
