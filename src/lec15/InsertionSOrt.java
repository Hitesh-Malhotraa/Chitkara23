package lec15;

public class InsertionSOrt {
public static void main(String args[])
{
	int arr[]= {2,8,10,0,12};
	for(int i=1;i<arr.length;i++)
	{
		int j=i-1;
		int temp=arr[i];
		while(j>=0)
		{
			
			if(temp<arr[j])
			{
//			
				arr[j+1]=arr[j];
			
			}
			else {
				break;
			}
			j--;
		}
		arr[j+1]=temp;
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
}
}
