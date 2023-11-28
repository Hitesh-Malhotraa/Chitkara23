package Lec24;
import java.util.Scanner;
public class countPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
	String str=scn.next();
int ans=sol(str)-1;	
	System.out.println(ans);
	}
	public static int sol(String str)
	{
		if(str.length()==0)
		{
			return 0;
		}
		int cnt=0;
		for(int i=1;i<=str.length();i++)
		{
			String sub=str.substring(0,i);
			String rem=str.substring(i);
			if(isPalindrome(sub))
			{
				cnt+=1;
				cnt+=sol(rem);
			}
			
			
			
		}
		return cnt;
	}
	public static boolean isPalindrome(String str)
	{
		int i=0;
		int j=str.length()-1;
		while(i<j)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
