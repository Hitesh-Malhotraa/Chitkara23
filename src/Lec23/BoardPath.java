package Lec23;
import java.util.Scanner;
public class BoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int dest=scn.nextInt();
		int dice=scn.nextInt();
		int ans=sol(0,dice,dest,"");
		System.out.println(ans);
	}
	public static int sol(int cp,int dice,int dest,String ans)
	{
		if(cp==dest)
		{
			System.out.println(ans);
			return 1;
		}
		if(cp>dest)
		{
			return 0;
		}
		int cnt=0;
		for(int i=1;i<=dice;i++)
		{
			cnt+=sol(cp+i,dice,dest,ans+i+" ");
		}
		return cnt;
	}

}
