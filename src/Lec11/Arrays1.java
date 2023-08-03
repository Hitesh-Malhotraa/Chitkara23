package Lec11;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr=new int[5];
int i=0;
int initial=10;
while(i<arr.length)
{
	arr[i]=initial;
	initial=initial+10;
	i++;
}
//System.out.println("*********");
//i=0;
//while(i<arr.length)
//{
//	System.out.print(arr[i]+" ");
//	i++;
//}
System.out.println(arr);
	}
	

}
