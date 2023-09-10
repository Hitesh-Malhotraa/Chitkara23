package Lec23;

public class qstn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ans=sol(5);
	System.out.println(ans);
	}
	public static int sol(int n)
	{
		if(n==1)
		{
			return 1;
		}
		int res=sol(n-1);
	return res*n;
	}

}
