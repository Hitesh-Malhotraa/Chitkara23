package LinkedList;

import java.util.Stack;

public class LinkedListDemo {
class node{
	int val;
	node next;
}
node head=null;
node tail=null;
int size=0;
public void addFirst(int value)
{
	node nn=new node();
	nn.val=value;
	if(head==null)
	{
		head=nn;
		tail=nn;
	}
	else {
		nn.next=head;
		head=nn;
	}
	size++;
}
public void addLast(int value)
{
	node nn=new node();
	if(head==null)
	{nn.val=value;
		head=nn;
		tail=nn;
	}
	else {
	nn.val=value;
	tail.next=nn;
	tail=nn;
	
	}
	size++;
}
	public void display()
	{
		node temp=head;
		
		while(temp!=null)
		{
			System.out.println(temp.val);
		temp=temp.next;
		}
}
	public void addAt(int idx,int value)
	{
		if(idx==0)
		{
			addFirst(value);
		return;
		}
		if(idx==size)
		{
			addLast(value);
		return;
		}
		if(idx>size||idx<0)
		{
			return;
		}
		node temp=getAt(idx-1);
		node nn=new node();
				nn.val=value;
		node temp2=temp.next;
		temp.next=nn;
		nn.next=temp2;
		size++;
	}
//	public node getAt(int idx)
//	{
//		node temp=head;
//		int cnt=0;
//		while(cnt<idx)
//		{
//			temp=temp.next;
//			cnt++;
//		}
//		return temp;
//	}
//	public void removeFirst()
//	{
//		if(head==null)
//		{
//			return;
//		}
//	head=head.next;
//	size--;
//	}
	public void removeLast2()
	{
		if(head==null)
		{
			return;
		}
		node temp=getAt(size-2);
		temp.next=null;
		tail=temp;
	size--;
	}
//	public void removeAt(int idx)
//	{
//	if(idx==0)
//	{
//		removeFirst();
//		return;
//	}
//	if(idx==size-1)
//	{
//		removeLast();
//	}
//	if(idx<0||idx>=size)
//	{
//		return;
//	}
//	node temp=getAt(idx-1);
//	node next=temp.next;
////	temp.next=temp.next.next;
//	temp.next=next.next;
//	}
	public void rotate1()
	{
		int i=0;
		int j=size-1;
		while(i<j)
		{
			node first=getAt(i);
			node end=getAt(j);
			int temp=end.val;
			end.val=first.val;
			first.val=temp;
			i++;
			j--;
		}
	}
	public void rotate2()
	{
		Stack<node>s=new Stack();
	node temp=head;
	while(temp!=null)
	{
		s.push(temp);
		temp=temp.next;
	}
	temp=head;
	int cnt=0;
	while(cnt<size/2)
	{
		node pop=s.pop();
		int val=pop.val;
		pop.val=temp.val;
		temp.val=val;
		temp=temp.next;
	cnt++;
	}
	}
//	g25
	public void removeFirst()
	{
		if(head==null)
		{
			return ;
		}
		head=head.next;
		size--;
	}
	public void removeLast()
	{
		node temp=getAt(size-2);
	temp.next=null;
	tail=temp;
			
	}
	public node getAt(int idx)
	{
		if(idx>=size||idx<0)
		{
			
			return null;
		}
		int cnt=0;
		node temp=head;
		while(cnt<idx)
		{
			cnt++;
			temp=temp.next;
			
		}
		return temp;
	}
	public void removeAt(int idx)
	{
		if(idx==0)
		{
			//removeFirst ki baat ho rhe h
			removeFirst();
			return;
		}
		if(idx==size-1)
		{
			//removeLast ki baat ho rhe h
			removeLast();
			return;
		}
		if(idx<0||idx>=size)
		{
			return;
		}
		//iska mtlb yeh h ki size jo h vo 0 >&& size<size-1;
	node temp=getAt(idx-1);
	node next=temp.next;
	temp.next=next.next;
	}
	public void rotate()
	{
		Stack<node>s=new Stack();
		node temp=head;
		while(temp!=null)
		{
			s.push(temp);
			temp=temp.next;
		}
		temp=head;//temp=1k;
		//top of stack h 5k;
		int cnt=0;
		while(cnt<size/2)
		{
			node next=s.pop();//5k
			int val=temp.val;
			temp.val=next.val;
			next.val=val;
			
			cnt++;
		}
	}
		public node rotate5(node cur,int cnt)
		{
			if(cur==null)
			{
				return head;
			}
			node prev=rotate5(cur.next,cnt+1);
		//swap;
			if(cnt<size/2)
			{
			int val=prev.val;
			prev.val=cur.val;
			cur.val=val;
			return prev.next;
			}
			}
		
	}
}
