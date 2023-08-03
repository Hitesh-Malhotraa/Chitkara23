package Lec11;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,4,5,6,7,8};
swap(arr);
for(int i=0;i<arr.length;i++)
{
	System.out.print(arr[i]+" ");
}
	}
	public static void swap(int arr[])
	{
		int i=0;
		while(i<arr.length)
		{
			if(i%2==0) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
//		i+1;
			}
			i=i+1;
			//i=i+2;
		}
	}

}
