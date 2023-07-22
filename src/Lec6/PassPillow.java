package Lec6;
import java.util.Scanner;
public class PassPillow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int t=scn.nextInt();
	int res=sol(n,t);
	System.out.println(res);
	}
public static int sol(int n,int time)
{
	int fp=-1;
while(time>0)
{
	
	for(int pos=1;pos<n&&time>0;pos++)
	{fp=pos;
		time--;
	}
	for(int pos=n;pos>1&&time>0;pos--)
	{fp=pos;
		time--;
	}
}
	return fp;
	
}
}
