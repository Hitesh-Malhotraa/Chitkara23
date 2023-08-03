package Lec11;
import java.util.Scanner;
public class LastOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,2,3,4,5,6,7,7,5,4,3,3,2,1};
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int ans=find(arr,n);
System.out.println(ans);
	}
	public static int find(int arr[],int n)
	{
		int temp=-1;
		int i=0;
		while(i<arr.length)
		{
			if(arr[i]==n)
			{
				temp=i;
			}
			i++;
		}
		return temp;
	}

}
