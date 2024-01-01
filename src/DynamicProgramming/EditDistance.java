package DynamicProgramming;
import java.util.Scanner;
public class EditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
String s1=scn.next();
String s2=scn.next();
int res=sol(s1,s2);
	System.out.println(res);
	}
public static int sol(String s1,String s2)
{if(s1.length()==0&&s2.length()==0)
{
	return 0;
}
if(s1.length()==0&&s2.length()!=0)
{
	return s2.length();
}
if(s1.length()!=0&&s2.length()==0)
		{
	return s1.length();
		}
	if(s1.charAt(0)==s2.charAt(0))
	{
	return	sol(s1.substring(1),s2.substring(1));
	}
	int del=sol(s1.substring(1),s2);
	int insert=sol(s1,s2.substring(1));
	int replace=sol(s1.substring(1),s2.substring(1));
	return Math.min(insert, Math.min(replace, del))+1;
}
}