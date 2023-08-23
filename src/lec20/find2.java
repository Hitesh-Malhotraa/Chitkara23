package lec20;

public class find2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,43,78};
int val=34;
System.out.print(find(arr,val,0));

	}
	public static int find(int arr[],int val,int idx)
	{
		if(idx==arr.length)
		{
			return -1;
		}
		if(arr[idx]==val)
		{
			return idx;
		}
		int res=find(arr,val,idx+1);
	return res;
	}

}
