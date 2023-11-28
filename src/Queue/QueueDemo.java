package Queue;

public class QueueDemo {

	int arr[]=new int[5];
	int last=0;
	int front=0;
	public void enqueue(int value)throws Exception
	{
		if(last==arr.length)
		{
			throw new Exception("Queue is full");
		}
		arr[last]=value;
	last++;
	}
	public void dequeue()
	{
		arr[front]=0;
		front++;
		
	}
	public int poll()
	{
		return arr[front];
	}
	
	public void display()
	{
		for(int i=front;i<last;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
}
