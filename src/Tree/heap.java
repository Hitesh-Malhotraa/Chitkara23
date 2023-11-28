package Tree;
import java.util.*;
public class heap {

ArrayList<Integer>list=new ArrayList();
public void add(int val)
{
	list.add(val);
	heapify(list,list.size()-1);
}
public void display()
{
	System.out.println(list);
}
private void heapify(ArrayList<Integer>list,int idx)
{double d=idx/2;
//System.out.println(d);
	int parent=(int)(Math.ceil(d));
	if(parent<0)
	{
		return;
	}
	if(list.get(parent)>list.get(idx))
	{
//		System.out.println(parent);
		int temp=list.get(parent);
	list.set(parent, list.get(idx));
	list.set(idx, temp);
//		swap;
		heapify(list,parent);
		
	}
}
}
