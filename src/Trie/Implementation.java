package Trie;

import java.util.HashMap;

public class Implementation {
	class node {
		char ch = '*';
		boolean flag;
		HashMap<Character, node> map = new HashMap();
	}

	node root;

	public Implementation(String arr[]) {
		node nn = new node();
		root = nn;
		for (int i = 0; i < arr.length; i++) {
			String str = arr[i];
			construct(root, str);
		}
//		System.out.println(root.map);
//	display(root);
	}

	public void construct(node root, String str) {
if(str.length()==0)
{
	root.flag=true;
	return;
}
		char ch=str.charAt(0);
		if(root.map.containsKey(ch))
		{
			construct(root.map.get(ch),str.substring(1));
		}
		else {
			node nn=new node();
			nn.ch=ch;
			root.map.put(ch, nn);
			construct(nn,str.substring(1));
		}
		
		
		
		
	}
}