package DynamicProgramming;
import java.util.Scanner;
public class EditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
String s1=scn.next();
String s2=scn.next();
int res=sol(s1,s2);
int ans=solTD(s1,s2,new int[s1.length()+1][s2.length()+1]);
	System.out.println(res);
	System.out.println(ans);
	}
	public static int sol(String s1,String s2)
	{
		if(s1.length()==0&&s2.length()==0)
		{
			return 0;
		}
		if(s1.length()!=0&&s2.length()==0)
		{
			return s1.length();
		}
		if(s1.length()==0&&s2.length()!=0) {
			return s2.length();
		}
		char ch1=s1.charAt(0);
		char ch2=s2.charAt(0);
		if(ch1==ch2)
		{
			return sol(s1.substring(1),s2.substring(1));
		}
		int del=sol(s1.substring(1),s2);
				int inset=sol(s1,s2.substring(1));
				int repl=sol(s1.substring(1),s2.substring(1));
	int min=Math.min(del, Math.min(inset, repl));
	return min+1;
	}
	
	
	
	public static int solTD(String s1,String s2,int dp[][])
	{
		if(s1.length()==0&&s2.length()==0)
		{
			return 0;
		}
		if(s1.length()!=0&&s2.length()==0)
		{
			return s1.length();
		}
		if(s1.length()==0&&s2.length()!=0) {
			return s2.length();
		}
		if(dp[s1.length()][s2.length()]!=0)
		{
			return dp[s1.length()][s2.length()];
		}
		char ch1=s1.charAt(0);
		char ch2=s2.charAt(0);
		if(ch1==ch2)
		{
			int res=sol(s1.substring(1),s2.substring(1));
		dp[s1.length()][s2.length()]=res;
		return res;
		}
		int del=sol(s1.substring(1),s2);
				int inset=sol(s1,s2.substring(1));
				int repl=sol(s1.substring(1),s2.substring(1));
	int min=Math.min(del, Math.min(inset, repl));
	dp[s1.length()][s2.length()]=min+1;
	return min+1;
	}
	

}
