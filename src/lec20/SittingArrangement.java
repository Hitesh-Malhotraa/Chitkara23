package lec20;

public class SittingArrangement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {0,0,0,0,0,0,0,0,1,0,0,1,0,0};
sol(arr,0,0);
	}
	public static int sol(int arr[],int idx,int cnt)
	{
		if(arr[idx]==1)
		{
			sol(arr,idx+1,cnt);
		}

		else {
			if(idx==0)
			{
				if(idx+2<arr.length)
				{
					if(arr[idx+1]!=1&&arr[idx+2]!=1)
					{
						arr[idx]=1;
						int incl=sol(arr,idx+3,cnt+1);
						arr[idx]=0;
						int excl=sol(arr,idx+1,cnt);
					return Math.max(incl, excl);
					}
				}
			}
			
		}
	}

}
