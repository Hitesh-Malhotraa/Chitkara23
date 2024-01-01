package DynamicProgramming;

public class WineProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = { 2, 4, 6, 54, 4, 54, 54, 4, 34, 23, 23, 43, 54, 5, 65, 6, 67, 7, 7, 76, 76, 76, 76, 76, 76, 67, 76,
//				76, 76, 76, 67, 76, 10,5,6,5,4,3,2,3,4,5,90,6,7,7,6,5,4,3,3,3,4,6, };
		int arr[]= {2,4,6,2,5};
		System.out.println(arr.length);
		int res = solTD(arr, 0, arr.length - 1, 1, 0,new int[arr.length][arr.length]);
		System.out.println(res);
		int ans=solBu(arr);
	System.out.println(ans);
	}

	public static int sol(int arr[], int lo, int hi, int yr, int profit) {
		if (lo == hi) {
			return profit + arr[lo] * yr;
		}
		int frnt = sol(arr, lo + 1, hi, yr + 1, profit + yr * arr[lo]);
		int back = sol(arr, lo, hi - 1, yr + 1, profit + yr * arr[hi]);
		return Math.max(back, frnt);
	}
	public static int solTD(int arr[], int lo, int hi, int yr, int profit,int dp[][]) {
		if (lo == hi) {
			return profit + arr[lo] * yr;
		}
		if(lo>hi)return 0;
		if(dp[lo][hi]!=0)
		{
			return dp[lo][hi]+profit;
		}
		int frnt = solTD(arr, lo + 1, hi, yr + 1, profit + yr * arr[lo],dp);
		int back = solTD(arr, lo, hi - 1, yr + 1, profit + yr * arr[hi],dp);
		int res=Math.max(back, frnt);
	dp[lo][hi]=res-profit;
	return res;
	}
public static int solBu(int arr[])
{
	int dp[][]=new int[arr.length][arr.length];
	for(int row=arr.length-1;row>=0;row--)
	{
		for(int col=0;col<arr.length;col++)
		{
			if(col==row)
			{
				dp[row][col]=arr[row]*arr.length;
			continue;
			}
			//row track rakh rha h low ka 
//			col track rakh rha h h high ka
			if(row>col)
			{
				continue;
			}
			int left=dp[row][col-1]+arr[col]*(row+1);
		int down=dp[row+1][col]+arr[row]*(row+1);
		dp[row][col]=Math.max(left, down);
		}
	}
	return dp[0][arr.length-1];
}
}
