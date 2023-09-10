package Lec24;

public class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int arr[]= {0,1,2,3,4,8};
		canCross(new int[]{0,1,2,3,4,8});
	}
	public static boolean canCross(int[] stones) {
        return sol(stones,0,1,stones[0]);
    }
    public static boolean sol(int arr[],int idx,int lj,int cp)
    {
        if(idx>=arr.length)return true;
        if(arr[idx]>cp)
        {
            return false;
        }
        if(idx==arr.length)return true;
        if(idx==0)
        {
            return sol(arr,idx+1,1,cp+lj);
        }
        else{
           boolean fj=sol(arr,idx+1,lj,cp+lj);
            if(fj)return true;
            boolean sj=sol(arr,idx+1,lj+1,cp+lj+1);
            if(sj)return true;
            boolean tj=sol(arr,idx+1,lj-1,cp+lj-1);
        if(tj)return true;
        }
        return false;
    }
    

}
