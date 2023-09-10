package Lec23;

public class Mazepath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][]=new int[3][3];
int ans=sol(0,arr.length-1,0,arr[0].length-1,"");
	System.out.println(ans);
	}
	public static int sol(int cr,int er,int cc,int ec,String ans)
	{
		if(cr==er&&cc==ec)
		{System.out.println(ans);
			return 1;
		}
		if(cr>er||cc>ec)
		{
			return 0;
		}
		int cnt=0;
		//row;
		cnt=cnt+sol(cr+1,er,cc,ec,ans+"V ");
		cnt=cnt+sol(cr,er,cc+1,ec,ans+"H ");
	return cnt;
	}
}