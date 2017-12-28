package Binarytree;

public class BSTclass
{
	
	BinaryTreeNode<Integer> root;
	
	
	public boolean hasdata(int x)
	{
	
		return helperhasdata(root,x);
		
		
	}
	private boolean helperhasdata(BinaryTreeNode<Integer> root,int x)
	{
	
		if(root==null)
			return false;
		if(root.data==x)
		return true;
		
		if(x < root.data)
		{
			 return helperhasdata(root.left,x);

		}else
		{
			return helperhasdata(root.right,x);
		}
 
		
	}

	public static void main(String[] args) 
	{

	}

}
