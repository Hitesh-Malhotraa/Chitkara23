package Lec25;

import java.util.*;

public class Subsequence {

	public static void main(String[] args) {
	int arr[]= {1,2,3};
	sol(arr,0,"");
	}
	public static void sol(int arr[],int idx,String ans)
	{
		if(idx==arr.length)
		{
			System.out.println(ans);
			return;
		}
		//include;
		sol(arr,idx+1,ans+arr[idx]);
		//exclude;
		sol(arr,idx+1,ans);
		
	}
}
