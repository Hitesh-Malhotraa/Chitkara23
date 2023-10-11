package Stack;
import java.util.Stack;
public class NextGreater {

	public static void main(String[] args) {

		int arr[]= {1,2,3,2,1,4,5,6};
		sol(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void sol(int arr[])
	{
	
		Stack<Integer>s=new Stack();
		for(int i=0;i<arr.length;i++)
		{
			while(s.isEmpty()==false&&arr[s.peek()]<arr[i])
			{
				int idx=s.pop();
				arr[idx]=arr[i];
			}
			s.push(i);
		}
		while(s.isEmpty()==false)
		{
			arr[s.pop()]=-1;
		}
	}
}