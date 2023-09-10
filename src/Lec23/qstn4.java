package Lec23;

public class qstn4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = sol(5, 0);
		System.out.println(cnt);
	}

	public static int sol(int dest, int cp) {
		if (cp == dest) {
			return 1;
		}
		if (cp > dest) {
			return 0;
		}
		int cnt = 0;
		System.out.println(cp);
		if (cp % 2 == 0) {
			cnt += sol(dest, cp + 1);
			cnt += sol(dest, cp + 2);
		} else {
			cnt += sol(dest, cp + 3);
			cnt += sol(dest, cp + 5);
		}
		return cnt;

	}
}
