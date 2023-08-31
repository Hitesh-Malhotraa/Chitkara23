package lec17;

public class Waveprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][]= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
//	no of rows=4 and no of colms h 5;
for(int i=0;i<arr.length;i++)
{
	if(i%2==0)
	{
	for(int j=0;j<arr[0].length;j++)
	{
		System.out.print(arr[i][j]+" ");
	}
	}
	else {
		for(int j=arr[0].length-1;j>=0;j--)
		{
			System.out.print(arr[i][j]+" ");
		}
	}
	System.out.println();
}
	}

}
