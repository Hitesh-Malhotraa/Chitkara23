package Lec25;

public class NQueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[4][4];
		boolean visited[][] = new boolean[4][4];
		sol(arr, 0, arr.length - 1, 0, arr.length - 1, 4, 0, "", visited);
	}

	public static void sol(int arr[][], int cr, int er, int cc, int ec, int tq, int qpsf, String ans,
			boolean visited[][]) {
		if (tq == qpsf) {
			System.out.println(ans);
			return;
		}
		if (cc > ec) {
			sol(arr, cr + 1, er, 0, ec, tq, qpsf, ans, visited);
			return;
		}
		if (cr > er) {
			return;
		}
		if (isItPossible(cr, cc, visited) == true) {
			visited[cr][cc] = true;
			sol(arr, cr + 1, er, 0, ec, tq, qpsf + 1, ans + cr + " " + cc + " , ", visited);
		visited[cr][cc]=false;
		}
		sol(arr, cr, er, cc + 1, ec, tq, qpsf, ans, visited);
	}
	public static boolean isItPossible(int cr,int cc,boolean visited[][])
	{
		//row;
		for(int i=0;i<cr;i++)
		{
			if(visited[i][cc]==true)
			{
				return false;
			}
			
		}
		
		//col;
		for(int i=0;i<cc;i++)
		{
			if(visited[cr][i]==true)
			{
				return false;
			}
		}
		//diagonalLeft
		int row=cr;
		int col=cc;
		while(row>=0&&col>=0)
		{
			if(visited[row][col]==true)
			{
				return false;
			}
		row--;
		col--;
		}
		row=cr;
		col=cc;
		while(row>=0&&col<visited.length)
		{
			if(visited[row][col]==true)
			{
				return false;
			}
			row--;
			col++;
		}
		return true;
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}