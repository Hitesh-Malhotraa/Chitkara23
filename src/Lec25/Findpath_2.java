package Lec25;

public class Findpath_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[4][4];
		sol(arr, 0, arr.length - 1, 0, arr.length - 1, "", new boolean[arr.length][arr.length]);
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
		// left
		sol(arr, cr, er, cc - 1, ec, ans + "L ", visited);
		// right
		sol(arr, cr, er, cc + 1, ec, ans + "R ", visited);
		visited[cr][cc] = false;

	}

}
