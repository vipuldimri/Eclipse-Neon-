package BinarySearchTree;

public class BinaryTree 
{
	

	public static TreeNode<Integer> 
	searchInBST(BinaryTreeNode<Integer> root , int k)
    {
      if(root==null)
      {
        return null;
      }
      if(root.data==k)
      {
        return root;
      }
	
      TreeNode<Integer> ans;
      
      if(root.data>k)
      {
            ans=   searchInBST(root.left,k); 
      }else{
        
               searchInBST(root.right,k); 

      }
      
    }
	
	
	public static void main(String... S)
	{
		
	}

}
