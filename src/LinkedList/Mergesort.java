package LinkedList;

public class Mergesort {

	public static void main(String[] args) {
int arr[]= {1,3,2,2,2,2,2,5,6,4,13,67};
 int res[]=sol(arr,0,arr.length-1);
	for(int i=0;i<res.length;i++)
	{
		System.out.print(res[i]+" ");
	}
	}
	public static int[] sol(int arr[],int lo,int hi)
	{
		if(lo==hi)
		{int res[]=new int[1];
		res[0]=arr[lo];
			return res;
		}
		int mid=(lo+hi)/2;
		int left[]=sol(arr,lo,mid);
		int right[]=sol(arr,mid+1,hi);
	return sort(left,right);
	}
	public static int[] sort(int left[],int right[])
	{
		int res[]=new int[left.length+right.length];
		int i=0;
		int j=0;
		int k=0;
		//i for left
		//j for right;
		//k for res;
		while(i<left.length&&j<right.length)
		{
			if(left[i]>right[j])
			{
				res[k]=right[j];
				j++;
			}
			else {
				res[k]=left[i];
				i++;
			}
			k++;
		}
		while(i<left.length)
		{
			res[k]=left[i];
			i++;
			k++;
		}
		while(j<right.length)
		{
			res[k]=right[j];
			j++;
			k++;
		}
		return res;
	}
}