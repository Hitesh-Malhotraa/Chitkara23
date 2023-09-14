package Lec25;

public class permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		boolean visited[] = new boolean[str.length()];
		sol(str, visited, "");
	}

	public static void sol(String str, boolean visited[], String ans) {
		if (ans.length() == str.length()) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			if (visited[i] == false) {
				visited[i] = true;
				sol(str, visited, ans + str.charAt(i));
				visited[i]=false;nv
			}
		}
	}
}
