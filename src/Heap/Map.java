package Heap;
import java.util.Set;
import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,Integer>map=new HashMap();
int arr[]= {1,2,1,1,2,3};
for(int i=0;i<arr.length;i++)
{
	int key=arr[i];
	if(map.containsKey(key)==true)
	{
		int of=map.get(key);
		map.put(key, of+1);
	}
	else {
		map.put(key, 1);
	}
}
Set<Integer>keys=map.keySet();
for(int key:keys)
{
	if(map.get(key)>=2)
	{
		System.out.println(key);
	}
}








//System.out.println(map);
//System.out.println(map.get(4));
//System.out.println(map.remove(3));
//System.out.println(map);
	
	
	
	}

}
