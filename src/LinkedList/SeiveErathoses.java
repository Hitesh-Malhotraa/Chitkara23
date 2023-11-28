package LinkedList;

import java.util.Scanner;

public class SeiveErathoses {

	public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
boolean arr[]=new boolean [n+1];
sol(arr,n);
for(int i=2;i<arr.length;i++)
{
	if(arr[i]==false)
	{
		System.out.print(i+" ");
	}
}
	}
	public static void sol(boolean arr[],int n)
	{
		for(int i=2;i*i<=n;i++)
		{
			if(arr[i]==true)
			{
				continue;
			}
			int j=2;
			while(i*j<=n)
			{
				arr[i*j]=true;
				j++;
			}
		}
	}
}