package DynamicProgramming;

public class Knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int w=4;
int p[]= {1,2,3,5,4,3,2,3,4,6,7};
int wt[]= {15,4,5,1,5,4,3,2,3,4,6};
int ans=sol(p,wt,0,p.length-1,w);
	System.out.println(ans);
	}
	
public static int sol(int p[],int wt[],int lo,int hi,int rw)
{
	if(lo==hi)
	{
		return 0;
	}
	int ft=0;
	int lt=0;
	if(rw-wt[lo]>=0)
     ft=sol(p,wt,lo+1,hi,rw-wt[lo])+p[lo];
if(rw-wt[hi]>=0)
 lt=sol(p,wt,lo,hi-1,rw-wt[hi])+p[hi];

return Math.max(ft, lt);
}
}
