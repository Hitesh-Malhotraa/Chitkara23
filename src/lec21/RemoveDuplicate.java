package lec21;
import java.util.Scanner;
public class RemoveDuplicate {

	   public static void main(String args[]) {
	        // Your Code Here
	    Scanner scn=new Scanner(System.in);
	    String str=scn.next();
	    String ans="";
	    int i=0;
	    while(i<str.length())
	    {
	        while(i+1<str.length()&&str.charAt(i)==str.charAt(i+1))
	        {
	            i++;
	        }
	        ans+=str.charAt(i);
	        i++;
	    }
	    System.out.println(ans);
	    }
	}

