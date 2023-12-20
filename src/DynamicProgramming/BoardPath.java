package DynamicProgramming;

public class BoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int res=sol(0,10,6,new int[10]);
	System.out.println(res);
	}
	public static int sol(int cp,int dest,int dice,int dp[])
	{
		if(cp==dest)
		{
			return 1;
		}
		if(cp>dest)
		{
			return 0;
		}
		if(dp[cp]!=0)
		{
			return dp[cp];
		}
		int cnt=0;
		for(int i=1;i<=dice;i++)
		{
			cnt+=sol(cp+i,dest,dice,dp);
		}
		dp[cp]=cnt;
		return cnt;
	}

}
