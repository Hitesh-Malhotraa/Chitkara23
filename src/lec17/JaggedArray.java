package lec17;
import java.util.Scanner;
public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
int arr[][]=new int[4][];
for(int i=0;i<arr.length;i++)
{//noc=number of colm;
	System.out.println("enter the number of colms at row number "+i);
	int noc=scn.nextInt();
	arr[i]=new int[noc];
}
for(int i=0;i<arr.length;i++)
{
	for(int j=0;j<arr[i].length;j++)
	{
		System.out.print(arr[i][j]+" ");
	}
	System.out.println();
}
	}

}
