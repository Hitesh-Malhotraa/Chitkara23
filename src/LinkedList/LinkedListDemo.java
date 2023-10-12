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
	public node getAt(int idx)
	{
		node temp=head;
		int cnt=0;
		while(cnt<idx)
		{
			temp=temp.next;
			cnt++;
		}
		return temp;
	}
//	public void removeFirst()
//	{
//		if(head==null)
//		{
//			return;
//		}
//	head=head.next;
//	size--;
//	}
	public void removeLast()
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
	public void removeAt(int idx)
	{
	if(idx==0)
	{
		removeFirst();
		return;
	}
	if(idx==size-1)
	{
		removeLast();
	}
	if(idx<0||idx>=size)
	{
		return;
	}
	node temp=getAt(idx-1);
	node next=temp.next;
//	temp.next=temp.next.next;
	temp.next=next.next;
	}
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
		head=head.next;
		
	}
	
}
