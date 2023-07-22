package Lec5;
import java.util.Scanner;
public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int a=scn.nextInt();
int b=scn.nextInt();
int res=gcd(a,b);
System.out.println(res);
	}
	public static int gcd(int val1,int val2)
	{//a=25;
//		b=4
		int a=val1;int b=val2;
	while(b>0) {
		int res=a%b;
		a=b;
		b=res;
	}
	return a;
	}

}
