package DynamicProgramming;
import java.util.*;
public class next {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,3,4,1,2,3,1};
		sol(arr);
	}
	public static List<List<Integer>> sol(int arr[])
    {HashMap<Integer,Integer>map=new HashMap();
        int max=1;
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            max=Math.max(max,map.get(arr[i]));
        }
 List<List<Integer>>res=new ArrayList();
     Set<Integer>keys=map.keySet();
     for(int i=0;i<max;i++)
     {
         ArrayList<Integer>ans=new ArrayList();
         int prev=201;
        
         for(int key:keys)
         {
              if(map.get(key)<=0)
             {
                 prev=key;
                 continue;
             }
           if(prev!=201)
           {
               map.remove(prev);
               prev=201;
           }
            
             ans.add(key);            
                 map.put(key,map.getOrDefault(key,0)-1);
        
         }
         
         res.add(ans);
     }
     return res;
}

}
