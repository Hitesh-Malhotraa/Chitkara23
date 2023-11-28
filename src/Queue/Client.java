package Queue;
import java.util.*;
public class Client {

	public static void main(String[] args)throws Exception {

//	QueueDemo q=new QueueDemo();
//	q.enqueue(10);
//	q.enqueue(10);
//	q.enqueue(10);
//	q.enqueue(10);
//	q.enqueue(10);
//	q.enqueue(10);
	print();
	}
	public static void print()throws Exception
	{
		sol();
	}
	public static void sol()throws Exception
	{
		set();
	}
	public static void set() throws Exception
	{
		int val=10;
		try {
		 val=val/0;
		}
		catch(Exception  e)
		{
			val=1;
//			System.out.println("Arthimetic Exception");
		throw new Exception("Zero se divide kr rha h tu");
		}
		finally {
//			System.out.println("Code nhi chla");
//			System.exit(1000);
		}
	System.out.println("Done");
		
	}
}