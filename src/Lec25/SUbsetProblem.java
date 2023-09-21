package Lec25;

public class SUbsetProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,4,5};
int trgt=10;
sol(arr,0,0,trgt,"");



	}
	public static void sol(int arr[],int idx,int sum,int trgt,String ans)
	{
		
		if(sum==trgt)
		{
			System.out.println(ans);
			return;
		}
		if(idx==arr.length||trgt<sum)
		{
			return;
		}
		
		
		//include;
		sol(arr,idx+1,sum+arr[idx],trgt,ans+arr[idx]);
		sol(arr,idx+1,sum,trgt,ans);
	}
}
