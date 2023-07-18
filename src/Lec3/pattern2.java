package Lec3;
import java.util.Scanner;
//import lec1.Helloworld;
public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		
int n=scn.nextInt();
int row=0;
int nst=1;
for(;row<n;row++)
{
	for(int cst=0;cst<nst;cst++)
	{
		System.out.print("* ");
	}
	System.out.println();
	nst++;
}
	}

}
