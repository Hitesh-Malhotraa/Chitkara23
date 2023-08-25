package lec21;
import java.util.Scanner;
public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
String str=scn.next();
substring(str);
	}
	public static void substring(String str)
	{
		for(int i=0;i<str.length();i++)
		{			
			for(int j=i+1;j<str.length();j++)
			{
				String s1=str.substring(i,j);
				boolean ans=isPalindrome(s1);
//				System.out.println(s1);
				if(ans==true)
				{
					System.out.println(s1);
				}
				
			}
		}
	}
	public static boolean isPalindrome(String str)
	{
		int i=0;
		int j=str.length()-1;
		while(i<=j)
		{
			char ch1=str.charAt(i);
			char ch2=str.charAt(j);
			if(ch1!=ch2)
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
