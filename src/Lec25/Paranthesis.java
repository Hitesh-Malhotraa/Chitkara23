package Lec25;

public class Paranthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sol(3,0,0,"");
}
	public static void sol(int n,int ob,int cb,String ans)
{
		if(ob==cb&&cb==n&&ob==n)
		{
			System.out.println(ans);
			return;
		}
		if(cb>ob||ob>n||cb>n)
		{
			return ;
		}

		sol(n,ob+1,cb,ans+'(');
		sol(n,ob,cb+1,ans+')');
}
}
//["((()))","(()())","(())()","()(())","()()()"]