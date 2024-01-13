package Tree;

class node{
	int val;
	node left;
	node right;
}
public class ConstructBst {
int arr[]= {1,3,4,5,67,98,100};
node root;
public ConstructBst()
{
	construct(0,arr.length-1);	
}

public node construct(int lo,int hi)
{
	if(lo>hi)return null;
	if(lo==hi)
	{
		node nn=new node();
		nn.val=arr[lo];
		return nn;
	}
	node nn=new node();
	int mid=(lo+hi)/2;
	nn.val=arr[mid];
	nn.left=construct(lo,mid-1);
	nn.right=construct(mid+1,hi);
	return nn;
}
public void sol(TreeNode root)
{if(root==null)
{
	return ;
}
	if(root.left==null&&root.right!=null)
	{
		System.out.println(root.val);
	}
	if(root.left!=null&&root.right==null)
	{
		System.out.println(root.val);
	}
	sol(root.left);
	sol(root.right);
}
}
