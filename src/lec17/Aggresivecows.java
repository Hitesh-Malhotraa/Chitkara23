package lec17;
import java.util.*;
public class Aggresivecows {
	    public static void main(String args[]) {
	    Scanner scn=new Scanner(System.in);
	    int n=scn.nextInt();
	    //noc no of cows
	    int noc=scn.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<arr.length;i++)
	    {
	        arr[i]=scn.nextInt();
	    } 
	    Arrays.sort(arr);
	    int lo=arr[0];
	    int hi=arr[arr.length-1];
	    int ans=0;
	    while(lo<=hi)
	    {
	int mid=(lo+hi)/2;
	boolean res=isItPossible(arr,noc,mid);
	if(res==true)
	{ans=mid;
	    lo=mid+1;
	}
	else{
	    hi=mid-1;
	}

	    }
	    System.out.println(ans);

	    }
	    public static boolean isItPossible(int arr[],int noc,int mid)
	    {
	int lp=arr[0];
	int cpsf=1;
	for(int i=1;i<arr.length;i++)
	{
	    int dist=arr[i]-lp;
	    if(dist>=mid)
	    {
	     cpsf+=1;
	     lp=arr[i];   
	    }
	}
	if(cpsf>=noc)
	{
	    return true;
	}
	else{
	    return false;
	}
	    }
	}


