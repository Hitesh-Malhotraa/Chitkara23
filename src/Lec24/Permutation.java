package Lec24;

import java.util.ArrayList;

public class Permutation {

	public static void main(String[] args) {
	ArrayList<String>ans=sol("abc","");
	System.out.println(ans);
	}
	public static ArrayList<String> sol(String str,String ans)
	{
		if(str.length()==0)
		{
//			System.out.println(ans);
			ArrayList<String>list=new ArrayList();
			list.add(ans);
			
			return  list;
		}
		ArrayList<String>mr=new ArrayList();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			String rem=
					str.substring(0,i)+str.substring(i+1);
			ArrayList<String>res=sol(rem,ans+ch);
			for(int j=0;j<res.size();j++)
			{
				String val=res.get(j);
				mr.add(val);
			}
		}
		return mr;
	}
}