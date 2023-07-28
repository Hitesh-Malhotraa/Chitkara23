package Lec9;
import java.util.Scanner;
public class Pattern32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int nor=(2*n)-1;
int row=0;
int nst=1;
int val=1;
while(row<nor)
{
	for(int cst=0;cst<nst;cst++)
	{
		if(cst+1==nst)
		{
			System.out.print(val+" ");
		}
		else {
		System.out.print(val+" "+"*"+" ");
	}
	}
	row++;
	if(row<n)
	{
		nst+=2;
		val++;
	}
	else {
		nst-=2;
		val--;
	}
	System.out.println();
//	row++;
}
	}

}
