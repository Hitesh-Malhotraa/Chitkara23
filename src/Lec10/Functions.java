package Lec10;

public class Functions {
//int a=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=20;
System.out.println("1");
add(a,b);
System.out.println("2");
sub(a,b);

multi(a,b);
System.out.println("3");
divide(a,b);
System.out.println("4");
	}
	
	public static void add(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	public static void sub(int a,int b)
	{
		int sum=a-b;
		System.out.println(sum);
	}
	public static void multi(int a,int b)
	{
		int sum=a*b;
		System.out.println(sum);
	}
	public static void divide(int a,int b)
	{
		int sum=a/b;
		System.out.println(sum);
	}
	



}
