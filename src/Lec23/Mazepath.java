package Lec23;

public class Mazepath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][]=new int[2][2];
System.out.println(paths(0,arr.length,0,arr[0].length-1));
	}

	public static int paths(int cr, int er, int cc, int ec) {
		if (cr == er && cc == ec) {
			return 1;
		}

		if (cc > ec) {
			return paths(cr + 1, er, 0, ec);
		}
		if (cr > er) {
			return 0;
		}
		int cnt = 0;
		cnt += paths(cr + 1, er, cc, ec);
		cnt += paths(cr, er, cc + 1, ec);
		return cnt;
	}

}
