package lec21;
import java.util.Scanner;
public class StringCompression {
	   public static void main(String args[]) {
		   Scanner scn=new Scanner(System.in);
		   String str=scn.next();
		   int i=0;
		   String ans="";
		       while(i<str.length())
		       {int cnt=1;
		         while(i+1<str.length()&&str.charAt(i)==str.charAt(i+1))
		         {
		             i++;
		             cnt++;
		         }
		         ans+=str.charAt(i)+""+cnt;
		       i++;
		       }
		       System.out.println(ans);
		       }
		   }


