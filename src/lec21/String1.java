package lec21;
import lec20 .fibo;
import java.lang.String;
public class String1 {

	public static void main(String[] args) {
	String str="ababaa";
	boolean ans=isPalindrome(str);
	System.out.println(ans);
	}
	public static boolean isPalindrome(String str)
	{
		int j=str.length()-1;
		int i=0;
		while(i<j)
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
