package lec21;
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
String str="afiurgjireogiewjwedeooro";
String pat="oorop";
boolean ans=sol(str,pat);
System.out.println(ans);
	}
	public static boolean sol(String str,String pat)
	{
		int i=0;
		int j=0;
		while(i<str.length())
		{
			char ch1=str.charAt(i);
			char ch2=pat.charAt(j);
			if(ch1==ch2)
			{
				i++;
				j++;
				
			}
			else if(ch1!=ch2)
			{
				j=0;
				i++;
			}
			if(j==pat.length())
			{
				return true;
			}
		}
		return false;
	}

}
