package lec21;

public class Leetcode1870 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,3,2};
sol(arr,2.7);
	}
	   public static int sol(int arr[],double hr)
	    {
	        int lo=1;
	        int hi=-1;
	        for(int i=0;i<arr.length;i++)
	        {
	            hi=Math.max(arr[i],hi);
	        }
	        int ans=0;
	        while(lo<=hi)
	        {
	            int mid=(lo+hi)/2;
	            if(isItPossible(arr,hr,mid))
	            { ans=mid;
	                hi=mid-1;
	            }
	            else{
	                lo=mid+1;
	            }
	            
	        }
	        return ans;
	        
	    }
	    public static boolean isItPossible(int arr[],double hr,int mid)
	    {double time=0;
	        int i=0;
	        while(i<arr.length)
	        {
	            if(arr[i]<=mid)
	            {
	                time+=1;
	            }
	            else{
	                if(arr[i]%mid==0)
	                {
	                    time=time+arr[i]/mid;
	                }
	                else{
	                    if(i+1==arr.length)
	                    {
	                        time=time+arr[i]/mid;
	                    }
	                    else{
	                        time=time+(arr[i]/mid)+1;
	                    }
	                }
	            }
	            if(time>hr)
	            {
	                return false;
	            }
	            i++;
	        }
	        return true;
	    }
	}


