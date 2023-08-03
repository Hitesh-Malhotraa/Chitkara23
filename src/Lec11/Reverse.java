package Lec11;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int arr[]= {1,2,3,4,5,6};
int a=10;
int b=20;
int c=30;
Object arr[]=new Object[5];
arr[0]=110;
arr[1]="String";
arr[2]='c';
arr[3]=true;
arr[4]=10.0;
//arr=reverse(arr);
//System.out.println();
//int i=0;
//int j=arr.length-1;
//while(i<j)
//{
//	int temp=arr[i];
//	arr[i]=arr[j];
//	arr[j]=temp;
//	i++;
//	j--;
//}
for(int k=0;k<arr.length;k++)
{

	System.out.print(arr[k]+" ");
}
	}
	public static int[] reverse(int arr[])
	{
		int i=0;
		int idx=arr.length-1;
		int res[]=new int[arr.length];
		while(idx>=0)
		{
			res[i]=arr[idx];
			i++;
			idx--;
		}
		arr=res;
		
		print(arr);
	return arr;
	}
	public static void print(int arr[])
	{
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]+" ");
		}
		
	}











}


