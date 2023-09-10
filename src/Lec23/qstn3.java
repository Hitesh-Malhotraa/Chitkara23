package Lec23;

public class qstn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sol(0);
	}
	public static void sol(int val)
	{
		if(val>1000)
		{
			return;
		}
		System.out.println(val);
		if(val==0)
		{
			sol(1);
		}
		else {
			sol(val*10);
		}
	}

}
