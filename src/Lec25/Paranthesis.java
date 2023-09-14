package Lec25;

public class Paranthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol(2, 0, 0, "");
	}

	public static void sol(int n, int ob, int cb, String ans) {

		if (ob > n || cb > n || cb > ob) {
			return;
		}
		if (ob + cb == 2 * n) {
			System.out.println(ans);
			return;
		}
		

		sol(n, ob + 1, cb, ans + '(');
		sol(n, ob, cb + 1, ans + ')');
	}
	
	
	
	
	
	
	
}