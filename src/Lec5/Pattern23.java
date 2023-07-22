package Lec5;
import java.util.Scanner;
public class Pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int row=0;
int nst=1;
int nsp=n-1;
int val=1;
while(row<n)
{
	//spaces
	for(int csp=0;csp<nsp;csp++)
	{
		System.out.print(" ");
	}
	//stars
	for(int cst=0;cst<nst;cst++)
	{
		System.out.print(val);
		if(nst/2<=cst)
		{
			val--;
		}
		else {
			val++;
		}
	}
	val=1;
	row++;
	System.out.println();
	nsp-=1;
	nst+=2;
}
	}

}
