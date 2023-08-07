package lec13;
import java.util.Scanner;
public class Product {

	public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
int tc=scn.nextInt();
while(tc-->0)
{
	int n=scn.nextInt();
	int a1[]=new int[n];
	for(int i=0;i<a1.length;i++)
	{
		a1[i]=scn.nextInt();
	}
	int m=scn.nextInt();
	int a2[]=new int[m];
	for(int i=0;i<a2.length;i++)
	{
		a2[i]=scn.nextInt();
	}
	int ans=0;
	int multi=1;
	int carry=0;
	int i=a1.length-1;
	int j=a2.length-1;
	while(i>=0&&j>=0)
	{
		int first=a1[i];
		int second=a2[j];
		int sum=first+second+carry;
		ans=((sum%10)*multi)+ans;
		carry=sum/10;
		multi=multi*10;
		i--;j--;
	}
	while(i>=0)
	{
		int sum=a1[i]+carry;
		ans=((sum%10)*multi)+ans;
		carry=sum/10;
		i--;
		multi=multi*10;
	}
	
	while(j>=0)
	{
		int sum=a2[j]+carry;
		ans=(sum%10)*multi+ans;
		carry=sum/10;
		i--;
		multi=multi*10;
	}
	if(carry!=0)
	{
		ans=carry*multi+ans;
	}
	System.out.println(ans);
}

	}
}
