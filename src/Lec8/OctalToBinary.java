package Lec8;
import java.util.Scanner;
public class OctalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int cb=scn.nextInt();
int eb=scn.nextInt();
int value=scn.nextInt();
//cb=8;
//eb=2;
//if(cb==2&&eb==8)
//if(cb==8&&eb==2)
//int sol=binaryToAny(value,cb,eb);
int res=octalToDecimal(value,cb,10);
int ans=decimalToBinary(res,10,2);
	System.out.println(ans);
	}
	static int octalToDecimal(int value,int cb,int eb)
	{
		int sum=0;
		int multi=1;
		int n=value;
		while(n>0)
		{
			int rem=n%eb;
			sum=sum+rem*multi;
			multi=multi*cb;
			n=n/eb;
		}
		return sum;
	}
	public static int decimalToBinary(int value,int cb,int eb)
	{
		int sum=0;
		int multi=1;
		int n=value;
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
