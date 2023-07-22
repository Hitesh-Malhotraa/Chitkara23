package Lec5;

import java.util.Scanner;

public class Pattern33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int row=0;
int nst=1;
int nsp=n-1;
int val=0;
while(row<n)
{
	val=n-row;
	//spaces;
	for(int csp=0;csp<nsp;csp++)
	{
		System.out.print(" ");
	}
	for(int cst=0;cst<nst;cst++)
	{
		
		if(nst/2==cst)
		{
			System.out.print(0);
			val=n-row;
		}
		
		else if(nst/2<cst){
			System.out.print(val);
		val++;
		}
		else {
			System.out.print(val);
			val--;
		}
		}
	System.out.println();
	row++;
	nst+=2;
	nsp-=1;
}
	}

}
