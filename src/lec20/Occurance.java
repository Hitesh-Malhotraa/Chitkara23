package lec20;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,1,1,1};
int val=1;
int ans=count(arr,val,0,0);
	System.out.println(ans);
	}
	public static int count(int arr[],int val,int idx,int cnt)
	{
		if(idx==arr.length)
		{
			return cnt;
		}
		if(arr[idx]==val)
		{
			return count(arr,val,idx+1,cnt+1);
		}
		else {
			return count(arr,val,idx+1,cnt);
		}
	}

}
