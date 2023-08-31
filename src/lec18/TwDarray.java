package lec18;
import java.util.Scanner;
public class TwDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// user ki demand aaye ek 4*4 ka 2d array bna do;
//		4 rows or 4 he colm ho;
		Scanner scn=new Scanner(System.in);
		
		int arr[][]=new int[4][4];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				arr[i][j]=scn.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
