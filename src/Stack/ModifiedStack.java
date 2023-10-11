package Stack;

public class ModifiedStack extends StackDemo {
	@Override
public void push(int val)
{
	tos++;
	
	if(isFull())
	{
		int res[]=new int[arr.length*2];
		int strt=tos-1;
		while(strt>=0)
		{
			res[strt]=arr[strt];
			strt--;
		}
		arr=res;
	}
	arr[tos]=val;
}
}