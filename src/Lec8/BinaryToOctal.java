package Lec8;
import java.util.Scanner;
public class BinaryToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int cb=scn.nextInt();
int eb=scn.nextInt();
int value=scn.nextInt();
//code for binary to decimal
int res=binaryToDecimal(value,cb,10);
int ans=decimalToOctal(res,10,8);
System.out.println(ans);
	}
	public static int binaryToDecimal(int value,int cb,int eb)
	{
		int sum=0;
		int multi=1;
		int n=value;
		while(n>0)
		{
			int rem=n%eb;
			sum=sum+rem*multi;
		multi=multi*2;
		n=n/eb;
		}
		return sum;
	}
	public static int decimalToOctal(int value,int cb,int eb)
	{
		int sum=0;
		int n=value;
		int multi=1;
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
