package LinkedList;
import java.util.*;
public class LinkedListClient {

	public static void main(String args[])
	{
	LinkedListDemo ll=new LinkedListDemo();
	ll.addLast(10);
	ll.addLast(20);
	ll.addLast(30);
	ll.addLast(40);
	ll.addLast(50);
//	ll.display();
//	ll.removeFirst();
	ll.rotate2();
	ll.display();
	}
}