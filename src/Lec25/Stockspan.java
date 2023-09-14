package Lec25;

import java.util.Stack;
public class Stockspan {

	class pair{
		int idx=0;
		int cnt=0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {100,80,60,70,60,75,85};
Stockspan s=new Stockspan();
Stack<pair>s1=new Stack();
sol(arr);
	}
	public void sol(int arr[])
	{
	
		int res[]=new int [arr.length];
		for(int i=0;i<arr.length;i++)
		{
			int cnt=1;
			for(int j=i-1;j>=0;j--)
			{
				if(arr[i]<arr[j])
				{
					break;
				}
				cnt++;
			}
			res[i]=cnt;
		}
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
	}

}
