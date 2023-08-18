package lec16;

public class Badversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol(5);
}
	public static int sol(int n)
    {int ans=-1;
        int lo=1;
        int hi=n;
        while(lo<=hi)
        {
            int mid=(lo+hi)/2;
            if(isBadVersion(mid)==true)
            {
                ans=mid;
                hi=mid-1;
            }
            lo=mid+1;
            }
        
     return ans;
    }
}