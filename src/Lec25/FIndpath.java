package Lec25;

public class FIndpath {

	public static void main(String[] args) {
		int arr[][] = new int[4][4];
		sol(arr, 0, arr.length - 1, 0, arr.length - 1, "", new boolean[4][4]);
	}

	public static void sol(int arr[][], int cr, int er, int cc, int ec, String ans, boolean visited[][]) {
		if (cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}
		if (cr < 0 || cc < 0 || cr > er || cc > ec || visited[cr][cc] == true) {
			return;
		}
		visited[cr][cc] = true;
		// up;
		sol(arr, cr - 1, er, cc, ec, ans + "U ", visited);
		// down;
		sol(arr, cr + 1, er, cc, ec, ans + "D ", visited);
		// right;
		sol(arr, cr, er, cc + 1, ec, ans + "R ", visited);
		// left;
		sol(arr, cr, er, cc - 1, ec, ans + "L ", visited);
		visited[cr][cc] = false;
	}
}