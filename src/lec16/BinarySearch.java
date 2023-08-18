package lec16;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,4,7,9,10};
int val=9;
int lo=0;
int hi=arr.length-1;
int idx=-1;
while(lo<=hi)
{
	int mid=(lo+hi)/2;
	if(arr[mid]==val)
	{
		idx=mid;
		break;
	}
	else if(val>arr[mid])
	{
		lo=mid+1;
	}
	else {
		hi=mid-1;
	}
	
}
System.out.println(idx);
	}

}
