package Lec11;
import java.util.Scanner;
public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
		int arr[]= {1,3,4,76,89,20};
int n=scn.nextInt();
boolean ans=find(arr,n);
	System.out.println(ans);
	}
	
	public static boolean find(int arr[],int n)
	{
		int i=0;
		while(i<arr.length)
		{
			if(arr[i]==n)
			{
				return true;
			}
			i++;
		}
		return false;
	}

}
