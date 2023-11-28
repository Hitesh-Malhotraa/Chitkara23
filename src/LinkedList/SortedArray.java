package LinkedList;

public class SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 15, 25 };
		int b[] = { 1, 5, 20, 30 };
		sol(a, b, 0, 0, -1, true, "");
	}

	public static void sol(int a[], int b[], int idxa, int idxb, int lv, boolean flag, String ans) {
if(flag==true)
{
	System.out.println(ans);
}
		if(flag==true)// A ki turn h
		{
			for(int i=idxa;i<a.length;i++)
			{
				if(a[i]>lv)
				{
					sol(a,b,i+1,idxb,a[i],false,ans+a[i]+" ");
				}
			}
			
		}
		else { //B ki turn h
			for(int i=idxb;i<b.length;i++)
			{
				if(b[i]>lv)
				{
					sol(a,b,idxa,i+1,b[i],true,ans+b[i]+" ");
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
