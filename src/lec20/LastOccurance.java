package lec20;

public class LastOccurance {

	public static void main(String[] args) {
	int arr[]= {1,2,1,1,1,1};
	int val=1;
	int indx=0;
	int res=find(arr,val,indx);
	System.out.println(res);
	}
	public static int find(int arr[],int val,int idx)
	{
		if(arr.length==idx)
		{
			return -1;
		}
		
		int res=find(arr,val,idx+1);
		if(res==-1&&arr[idx]==val)
		{
			res=idx;
			return res;
		}
		return res;

		
		
		
		
	}
	
}
