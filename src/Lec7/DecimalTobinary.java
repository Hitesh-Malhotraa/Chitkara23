package Lec7;
import java.util.Scanner;
public class DecimalTobinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int cb=scn.nextInt();
int eb=scn.nextInt();
int val=scn.nextInt();
int ans=convert(val,cb,eb);
System.out.println(ans);
	}
	public static int convert(int val,int cb,int eb)
	{
		int sum=0;
		int multi=1;
		int n=val;
		while(n>0)
		{
			int rem=n%eb;
			sum=sum+rem*multi;
			multi=multi*cb;
			n=n/eb;
		}
		return sum;
	}

}
