package lec12;

public class Subarray {

	public static void main(String[] args) {
int arr[]= {1,2,-10};
int ans=Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++)
{
	int sum=0;
	for(int j=i;j<arr.length;j++)
	{
		sum+=arr[j];
		ans=Math.max(ans,sum);	
	}
	
}
System.out.println(ans);
	}
}