package lec20;

public class Findindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,8,7};
int ans=find(arr,7,0);
System.out.println(ans);
	}
	public static int find(int arr[],int val,int idx)
	{if(idx==arr.length)
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
