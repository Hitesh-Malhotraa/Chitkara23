package Lec22;
import java.util.Scanner;
public class HelpRamu {
	public static void main(String args[])
	{
	    Scanner scn=new Scanner(System.in);
	    int tc=scn.nextInt();
	    while(tc-->0)
	    {
	        int tickets[]=new int[4];
	        for(int i=0;i<tickets.length;i++)
	        {
	            tickets[i]=scn.nextInt();
	        }
	        int n=scn.nextInt();
	        int m=scn.nextInt();
	        int rickshaw[]=new int[n];
	        int cab[]=new int[m];

	  for(int i=0;i<rickshaw.length;i++)
	{
		rickshaw[i]=scn.nextInt();
	}
	for(int i=0;i<cab.length;i++)
	{
		cab[i]=scn.nextInt();
	}
	int ans=0;
	for(int i=0;i<rickshaw.length;i++)
	{
		int val=rickshaw[i]*tickets[0];
		ans+=Math.min(val, tickets[1]);
	}
	ans=Math.min(ans, tickets[2]);
	int res=0;
	for(int i=0;i<cab.length;i++)
	{
		int val=cab[i]*tickets[0];
		res+=Math.min(val, tickets[1]);
	}
	res=Math.min(res, tickets[2]);
	ans=ans+res;
	ans=Math.min(ans, tickets[3]);

	System.out.println(ans);
		}
	}

}
