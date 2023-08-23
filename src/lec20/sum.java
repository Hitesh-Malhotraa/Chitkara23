package lec20;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=20;
sum(a,b,0);
	}
	public static void sum(int a,int b,int idx)
	{
		if(idx>=2)
		{
			return;
		}
		int sum=a+b;
		System.out.println(sum);
		sum(sum,b,idx+1);
		System.out.println("hello");
		sum(a,b,idx+1);
	}

}
