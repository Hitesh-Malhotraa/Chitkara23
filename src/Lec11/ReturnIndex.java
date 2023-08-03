package Lec11;
import java.util.Scanner;
public class ReturnIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int arr[]= {1,3,4,3,2,2,3,4,5,5,78,65,4,43};
int ans=find(arr,n);
System.out.println(ans);
	}
	public static int find(int arr[],int n)
	{
		int i=0;
		while(i<arr.length)
		{
			if(arr[i]==n)
			{
				return i;
			}
			i++;
		}
		return -1;
	}

}
