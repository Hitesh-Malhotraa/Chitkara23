package LinkedList;
import java.util.*;
public class Check {
public static void main(String args[])
{
//	int ar[]= {1,2,3};
	int arr[][]= {{1,2,7},{3,6,7}};
	numBusesToDestination(arr,1,6);
}
public static int numBusesToDestination(int[][] routes, int source, int target) {
HashMap<Integer,HashSet<Integer>>map=fill(routes);
       int res= sol(map,source,target,0,new HashSet());
   if(res==Integer.MAX_VALUE)return -1;
   return res;
   }
   public static int sol(HashMap<Integer,HashSet<Integer>>map,int src,int trgt,int cnt,HashSet<Integer>set)
   {
       if(src==trgt)
       {
           return cnt;
       }
       if(set.contains(src))
       {
           return Integer.MAX_VALUE;
       }
       int res=Integer.MAX_VALUE;
       set.add(src);
       if(map.get(src).contains(trgt))
       {
           return cnt+1;
       }
           for(int ns:map.get(src))
           {
               System.out.println(ns);
               int ans=sol(map,ns,trgt,cnt,set);
               // if(ans!=Integer.MAX_VALUE)
               
                   ans=Math.min(ans,res);
               System.out.println(ans+"-> "+"ans");
               
           }
           if(res!=Integer.MAX_VALUE)
           {
               return res+1;
           }
           return res;
       
   }
   public static HashMap<Integer,HashSet<Integer>> fill(int arr[][])
   {
       HashMap<Integer,HashSet<Integer>>map=new HashMap();
       for(int i=0;i<arr.length;i++)
       {
           for(int j=0;j<arr[i].length;j++){
               int key=arr[i][j];
               HashSet<Integer>set=new HashSet();
               for(int k=j+1;k<arr[i].length+arr.length;k++)
               {
                   int idx=k%arr[i].length;
                   if(idx==j)
                   {
                       break;
                   }
                   else{
                       set.add(arr[i][idx]);
                   }
               }
               if(map.containsKey(key)==false)
               {
                   map.put(key,set);
               }
               else{
                   HashSet<Integer>set2=map.get(key);
                   for(int val:set)
                   {
                       set2.add(val);
                   }
                   map.put(key,set2);
               }
           }
       }
       System.out.println(map);
       return map;
   }
}