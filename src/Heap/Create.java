package Heap;
import java.util.HashMap;
import java.util.Set;
public class Create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,2,1,2,3,4,5,4,3};
		HashMap<Integer,Integer>map=new HashMap();
	for(int i=0;i<arr.length;i++)
	{
		int key=arr[i];
		if(map.containsKey(key)==true)
		{
			int temp=map.get(key);
			map.put(key, temp+1);
		}
		else {
			map.put(key, 1);
		}
		
	}
	System.out.println(map);
//	System.out.println(map.remove(1));
//	System.out.println(map.containsKey(1));
	Set<Integer> keys=map.keySet();
	for(int key:keys)
	{
		if(map.get(key)>=3)
		{
			System.out.println(key);
		}
	}
	}

}
