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
leftView();
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
	public void leftView()
	{
//		System.out.println("Hello");
		leftView(root,true);
	}
	private void leftView(node root,boolean flag)
	{if(root==null)
	{
//		System.out.println("null");
		
		return;
	}
	if(flag==true) {
		System.out.println(root.val);
	}
		
		leftView(root.left,true);
		leftView(root.right,false);
	}
	public void inorder()
	{
		inorder(root);
	}
	private void inorder(node root)
	{
	    if(root==null)
        {
            return;
        }
        
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);

	}
	public void preorder()
	{
		preorder(root);
	}
	private void preorder(node root)
	{
	    if(root==null)
        {
            return;
        }
        
	    System.out.println(root.val);
        preorder(root.left);
        
        preorder(root.right);
		
	}
	public void postorder()
	{
		postorder(root);
	}
	private void postorder(node root)
	{
		   if(root==null)
	        {
	            return;
	        }
	        
		   
	        postorder(root.left);
	        
	        postorder(root.right);
	        System.out.println(root.val);
	}
	public int diameter()
	{
		return diameter(root);
	}
	private int diameter(node root)
	{
		 if(root==null)return 0;
		        int left=diameter(root.left);
		        int right=diameter(root.right);
		        int sd=height(root.left)+height(root.right)+2;
		        return Math.max(left,Math.max(right,sd));
		    }
		    
	
	public boolean isBalanced()
	{
		return isBalanced(root);
	}
	private boolean isBalanced(node root)
	{
		 if(root==null)return true;
	       boolean left=isBalanced(root.left);if(left==false)return false;
	       boolean right=isBalanced(root.right);if(right==false)return false;
	       int bf=height(root.left)-height(root.right);
	       if(bf==0||bf==-1||bf==1)
	           return true;
	       return false;
	}
	public int height()
	{
		return height(root);
	}
	private int height(node root)
	{
		if(root==null)return -1;
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    
	}
	public int size()
	{
		return size(root);
	}
	private int size(node root)
	{
		if(root==null)return 0;
		int left=size(root.left);
		int right=size(root.right);
		return left+right+1;
		
	}
	}
