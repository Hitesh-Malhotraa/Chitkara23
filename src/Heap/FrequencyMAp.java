package Heap;
import java.util.*;
public class FrequencyMAp {

class node implements Comparable<node>{
	int val=0;
	int freq;
	@Override
//	public int compareTo(node o) {
//		// TODO Auto-generated method stub
//		return o.v1-this.v1;
//	}
//	public String toString()
//	{
//		return "v1"+ " - > "+v1+" v2"+" -> "+" "+v2+" ";
////	return "adi";
//	}
	
}
public void sol()
{
	int arr[]= {1,2,3,2,1,2,3,4,6};
	Arrays.sort(arr);
	ArrayList<node>list=new ArrayList();
	for(int i=0;i<arr.length;i++)
	{
		int freq=1;
		int idx=i
		while(i+1<arr.length&&arr[idx]==arr[i+1])
		{
			freq++;
			i++;
		}
		node nn=new node();
		nn.val=arr[i];
		nn.freq=freq;
	}
	
	int arr[]= {1,2,3,3,3,3,3,4,4};
	
}

public static void main(String args[])
{
	FrequencyMAp temp=new FrequencyMAp();
	temp.sol();
}
}