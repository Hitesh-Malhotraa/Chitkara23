package Lec23;

public class qstn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,2,4};
int val=2;
int ans[]=sol(arr,val,0,0);
for(int value:ans)
{
	System.out.println(value);
}
	}
	public static int[] sol(int arr[],int val,int idx,int cnt)
	{
		if(idx==arr.length)
		{
			return new int[cnt];
		}
		if(arr[idx]==val)
		{
			int res[]=sol(arr,val,idx+1,cnt+1);
		res[cnt]=idx;
		return res; 
		}
		else {
			return sol(arr,val,idx+1,cnt);
		}
	}

}
