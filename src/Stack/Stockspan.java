package Stack;

import java.util.Stack;
class Stockspan{
class Box{
	int b1;
	int b2;
}
public static void main(String args[])
{
	int arr[]= {2,4,5,76,8,5,4,30};
Stockspan st=new Stockspan();
st.sol(arr);
}
public void sol(int arr[])
{
	Stack<Box>s=new Stack();
	for(int i=0;i<arr.length;i++)
	{int cnt=1;
		while(s.isEmpty()==false&&s.peek().b1<arr[i])
		{
			Box temp=s.pop();
			cnt+=temp.b2;
		}
		Box b=new Box();
		b.b1=arr[i];
		b.b2=cnt;
		s.push(b);
	System.out.println(b.b2);
	}
	
	
}
}
