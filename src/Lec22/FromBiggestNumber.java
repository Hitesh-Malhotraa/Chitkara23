package Lec22;

public class FromBiggestNumber {

	public static void main(String args[])
	{
	    java.util.Scanner scn=new java.util.Scanner(System.in);
	int tc=scn.nextInt();
	while(tc-->0)
	{
	    int n=scn.nextInt();
	    String arr[]=new String[n];
	    for(int i=0;i<arr.length;i++)
	    {
	        arr[i]=scn.nextInt()+"";
	    }
	    sol(arr);

	}
	}
	public static void sol(String arr[])
	{
	 for(int i=0;i<arr.length;i++)
	 {
	     for(int j=0;j<arr.length-1;j++)
	     {
	         int res=check(arr[j],arr[j+1]);
	         if(res==0)
	         {
	             String temp=arr[j];
	             arr[j]=arr[j+1];
	             arr[j+1]=temp;
	         }
	     
	     }
	 }
	     for(int i=0;i<arr.length;i++)
	     {
	         System.out.print(arr[i]);
	     }
	     System.out.println();
	   
	}
	public static int check(String s1,String s2)
	{
	    String str1=s1+s2;
	    String str2=s2+s1;
	    long val1=Long.parseLong(str1);
	    long val2=Long.parseLong(str2);
	    if(val1>val2)
	    {
	        return 1;

	    }
	    return 0;
	}

}
