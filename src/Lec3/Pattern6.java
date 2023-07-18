package Lec3;
import java.util.Scanner;
public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int row=0;
int nst=n;
int nsp=0;
while(row<n)
{
	//space
	for(int csp=0;csp<nsp;csp++)
	{
		System.out.print("  ");
	}
	//stars
	for(int cst=0;cst<nst;cst++)
	{
		System.out.print("* ");
	}
	System.out.println();
	nst-=1;
	nsp+=2;
row++;
}
	}

}
