package Heap;
import java.util.*;
import java.util.Arrays;

public class Check
{
class node implements Comparable<node>{
	int v1=0;
	int v2=0;
	@Override
	public int compareTo(node o) {
		// TODO Auto-generated method stub
		return this.v2-o.v2;
	}

	
	
}
public static void main(String args[])
{
	Check c=new Check();
	c.sol();
}
public void sol()
{
	node arr[]=new node[5];
	for(int i=0;i<arr.length;i++)
	{
		node nn=new node();
		arr[i]=nn;
		
	}
	arr[0].v1=9;
	arr[0].v2=10;
	arr[1].v1=100;
	arr[1].v2=5;
	arr[2].v1=0;
	arr[2].v2=9;
	arr[3].v1=18;
	arr[3].v2=7;
	arr[4].v1=-8;
	arr[4].v2=4;
	Arrays.sort(arr);
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i].v1+" "+arr[i].v2+"  ");
	}
	
}
}