package St2;

public class PatternMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abababababab";
		String pat = "ab";
//		sol(str, pat);
		factor(12);
		
	}

	public static void sol(String str, String pat) {
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			int j = 0;
			int temp = i;
			while (j < pat.length() && temp < str.length()) {
				if (str.charAt(temp) == pat.charAt(j)) {
					j++;
					temp++;
				} else {
					break;
				}
				if (j == pat.length()) {
					cnt++;
				}

			}
		}
		System.out.println(cnt);
	}
	public static void print()
	{
		System.out.println("Hello");
	}
public static void factor(int n)
{
	int sum=0;
	int i=2;
	while(n!=1)
	{
//		System.out.println(n);
	if(n%i==0)
		{
			n=n/i;
			sum+=i;
		}
		else {
			i++;
		}
		
	}
	System.out.println(sum);
}
}
