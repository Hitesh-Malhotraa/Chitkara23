package Lec10;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int cnt=countOfDigits(n);
boolean ans=isArmstrong(n,cnt);
System.out.println(ans);
//cnt=3;
	}
	public static int countOfDigits(int n)
	{
		int cnt=0;
		while(n>0)
		{
			cnt+=1;
			n=n/10;
		}
		return cnt;
	}
public static boolean isArmstrong(int n,int cnt)
{int temp=n;
	int sum=0;
	while(n>0)
	{
		int rem=n%10;
		int value=(int)Math.pow(rem, cnt);
		sum=sum+value;
		n=n/10;
	}
	if(sum==temp) {
		return true;
	}
	else {
		return false;
	}
}
}
