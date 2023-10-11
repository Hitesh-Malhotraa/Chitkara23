package Stack;

class StackDemo {

int arr[];

int tos=-1;


public StackDemo()
{
	this(10);
	System.out.println("Khtm");
}
public StackDemo(int size)
{
	arr=new int[size];
}

public StackDemo(int val1,int val2,String msg)
{
	System.out.println(msg);
}


public void push(int val)
{
	tos++;
//	System.out.println("Hello");
	if(isFull()==true)
	{
		System.out.println("Stack is Full");
		return;
	}
	arr[tos]=val;
	
}
public void pop()
{

	if(isEmpty()==true)
	{
		System.out.println("Stack is Empty");
	return;
	}
	
	arr[tos]=0;
tos--;
}
public void peek()
{
//	tos--;
	if(isEmpty()==true)
	{
		System.out.println("Stack is Empty");
		return;
		
	}
	System.out.println(arr[tos]);
//	System.out.println(arr[tos]);
//	tos++;
	
}
public void display()
{
	for(int strt=tos;strt>=0;strt--)
	{
		System.out.println(arr[strt]);
	}
}
public boolean isFull()
{
return tos>arr.length;	
}
public boolean isEmpty()
{
	return tos<0;
}
public void check()
{
//	int tos=10;
	System.out.println(tos);
}

}
