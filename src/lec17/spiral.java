package lec17;

public class spiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
	int total=arr.length*arr[0].length;
	int maxcol=arr[0].length-1;
	int maxrow=arr.length-1;
	int minrow=0;
	int mincol=0;
	for(int col=mincol;col<=maxcol;col++)
	{
		System.out.print(arr[minrow][col]+" ");
	}
	minrow++;
	for(int row=minrow;row<=maxrow;row++)
	{
		System.out.print(arr[row][maxcol]+" ");
	}
	maxcol--;
	for(int col=maxcol;col>=mincol;col--)
	{
		System.out.print(arr[maxrow][col]+" ");
	}
	maxrow--;
	for(int row=maxrow;row>=minrow;row--)
	{
		System.out.print(arr[row][mincol]);
	}
	mincol++;
	}

}
