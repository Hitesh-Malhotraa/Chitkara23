package Lec24;
import java.util.Scanner;
public class Keypad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
String str=scn.next();
sol(str,"");
	}
	public static void sol(String str,String ans)
	{
		if(str.length()==0)
		{
			System.out.println(ans);
			return ;
		}
		char ch=str.charAt(0);
		String s=getString(ch);
		for(int i=0;i<s.length();i++)
		{
			sol(str.substring(1),ans+s.charAt(i));
		}
	
	}
public static String getString(char ch)
{
	if(ch=='2')
	{
		return "abc";
	}
	if(ch=='3')
	{
		return "def";
	}
	if(ch=='4')
	{
		return "ghi";
	}
	if(ch=='5')
	{
		return "jkl";
	}
	if(ch=='6')
	{
		return "mno";
	}
	if(ch=='7')
	{
		return "pors";
	}
	if(ch=='8')
	{
		return "tuv";
	}
	if(ch=='9')
	{
		return "wxyz";
	}
	return null;
}
}
