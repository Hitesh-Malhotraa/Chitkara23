package Tree;

import java.util.Scanner;

public class TreeConstruction {
	class node {
//	int val;
//	node left;
//	node right;
		int val = 0;
		node left = null;
		node right = null;

	}

	Scanner scn;
	String str = "10 true 20 true 40 false false true 50 false false true 30 true 60 false false true 70 false false ";
	node root = null;

//node root;
	public static void main(String args[]) {
		TreeConstruction tc = new TreeConstruction();

		tc.check();

	}

	public void check() {
		scn = new Scanner(str);
root=construct(null, false);
display(root);
	}

	public node construct(node root, boolean flag) {

		if (root == null) {
			System.out.println("enter the value for root node");
		} else {
			if (flag == true) // left child k liye
			{
				System.out.println("enter the value for left child of " + root.val);
			} else { // right child k liye
				System.out.println("enter the value for right child of " + root.val);
			}
		}
		node nn = new node();
		nn.val = scn.nextInt();
		System.out.println(nn.val + " has left child ?");
		boolean hlc = scn.nextBoolean();
		if (hlc == true) {
			nn.left = construct(nn, true);
		}
		System.out.println(nn.val + " has right child ?");
		boolean hrc = scn.nextBoolean();
		if (hrc == true) {
			nn.right = construct(nn, false);
		}
		return nn;
	}
	public void display(node root)
	{
	
		if(root==null)
		{
			return;
		}
//		String str=root.left.val+" <- "+root.val+" -> "+root.right.val;
String str="";
if(root.left!=null)
{
	str+=root.left.val+" <- "+root.val+" -> ";
}
else {
	str+="."+" <- "+root.val+" -> ";
}
if(root.right!=null)
{
	str+=root.right.val;
}
else {
	str+=".";
}

		System.out.println(str);
display(root.left);
display(root.right);
	}
	}
