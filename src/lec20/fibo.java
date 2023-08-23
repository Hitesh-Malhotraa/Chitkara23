package lec20;

public class fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	fibo(5);
	}
	public static int fibo(int n)
	{
		if(n==0||n==1)
		{
			return n;
		}
		int fh=fibo(n-1);
		int sh=fibo(n-2);
	int ans=fh+sh;
	return ans;
	}
}
