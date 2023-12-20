package Heap;

import java.util.*;

public class Assigment {

	public static void main(String args[])
	{
		System.out.println(sol(50));
	}
	 public static  int sol(int  n)
	    {
	        if(n==0||n==1)
	        {
	            return n;
	        }
	        int fh=sol(n-1);
	        int sh=sol(n-2);
	        return fh+sh;
	    }
}

