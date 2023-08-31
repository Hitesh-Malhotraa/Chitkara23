package lec20;

public class fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int ans=fibo(5);
	System.out.println(ans);
	}
	public static int fibo(int n)
	{
		if(n==0||n==1)
		{
			return n;
		}
		int fh=fibo(n-1);
		int sh=fibo(n-2);
	return fh+sh;
	}
}
