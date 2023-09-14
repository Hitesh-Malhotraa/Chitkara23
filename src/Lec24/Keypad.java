package Lec24;
import java.util.ArrayList;
import java.util.Scanner;
public class Keypad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
String str=scn.next();
ArrayList<String>ans=sol(str,"");
	System.out.println(ans);
	}
	public static ArrayList<String> sol(String str,String ans)
	{
		if(str.length()==0)
		{
//			System.out.println(ans);
			ArrayList<String>list=new ArrayList();
			list.add(ans);
			return list;
		}
		ArrayList<String>mr=new ArrayList();
		char ch=str.charAt(0);
		String s=getString(ch);
		for(int i=0;i<s.length();i++)
		{
		ArrayList<String>res=sol(str.substring(1),ans+s.charAt(i));
		for(int j=0;j<res.size();j++)
		{
			mr.add(res.get(j));
		}
		}
		return mr;
		
	
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
