package lec20;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {10,15,18,25,30};
int val=18;
find(arr,val,0);
		
	}
	public static boolean find(int arr[],int val,int idx)
	{
		if(arr[idx]==val)
		{
			return true;
		}
	boolean ans=find(arr,val,idx+1);
		return ans;
		
		
		
		
		
		
		
	}
		
}