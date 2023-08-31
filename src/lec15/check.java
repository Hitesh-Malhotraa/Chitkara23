package lec15;
import java.util.Scanner;
public class check {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
		}
		int trgt=scn.nextInt();
	int res[]=sol(arr,trgt,0,0);
	for(int i=0;i<res.length;i++)
	{
		System.out.print(res[i]+" ");
	}
	}
	public static int[] sol(int arr[],int trgt,int idx,int cnt)
	{if(idx>=arr.length)
	{
		int res[]=new int[cnt];
		return res;
	}
		if(arr[idx]==trgt)
		{
			int res[]=sol(arr,trgt,idx+1,cnt+1);
		res[cnt]=idx;
		return res;
		}
		else {
			int res[]=sol(arr,trgt,idx+1,cnt);
		return res;
		}
	}
	
}
