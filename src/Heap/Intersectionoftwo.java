package Heap;

import java.util.*;

public class Intersectionoftwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a1[] = new int[n];
		for (int i = 0; i < a1.length; i++) {
			a1[i] = scn.nextInt();
		}
		int m = scn.nextInt();
		int a2[] = new int[m];
		for (int i = 0; i < a2.length; i++) {
			a2[i] = scn.nextInt();
		}
		HashMap<Integer, Integer> map = new HashMap();
		for (int i = 0; i < a1.length; i++) {
			map.put(a1[i], map.getOrDefault(a1[i], 0) + 1);
		}
		for (int i = 0; i < a2.length; i++) {
			if (map.containsKey(a2[i]) && map.get(a2[i]) >= 1) {
				System.out.println(a2[i]);
				map.put(a2[i], map.getOrDefault(a2[i], 0) - 1);
			}
		}

	}

}
