package lec16;

public class koko {
public static void main(String args[]) {
int piles[]= {1,3,7,11};
int h=8;
    int ans= sol(piles,h);
System.out.println(ans);
}
public static int sol(int arr[],int hr)
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
        boolean res=isItPossible(arr,hr,mid);
            if(res==true)
            {ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
return ans;        
}

public  static boolean isItPossible(int arr[],int hr,int mid)
{
    int tt=0;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]<=mid)
        {
            tt=tt+1;
        }
        else{
            if(arr[i]%mid==0)
            {
                tt=tt+arr[i]/mid;
            }
            else{
                tt=tt+(arr[i]/mid)+1;
            }
        }
        if(tt>hr)
        {
            return false;
        }
    }
    return true;
}
}
