package BinarySearchTree;

public class BSTclass 
{
	
	 TreeNode<Integer> root;
	
	
	public boolean hasdata(int data)
	{
		return hasdatahelper(root,data);
		
	}
	private  boolean hasdatahelper(TreeNode<Integer> root,int data)
	{
		
		if(root==null)
		{
			return false;
		}
		if(root.data==data)
		{
			return true;
		}
		
		if(root.data < data)
		{
		return	hasdatahelper(root.Right,data);
		}
		else
		{
		return 	hasdatahelper(root.left,data);
		}
		
			
	}

	public  void insert(int data)
	{
		
		
	    root= inserthelper(root, data);
		
	}
	private TreeNode<Integer> inserthelper(TreeNode<Integer> root,int data)
	{
		if(root==null)
		{
			TreeNode<Integer> newnode=new TreeNode<>(data);
			return newnode;
		}
	
		if(data < root.data)
		{
			root.left=inserthelper(root.left,data);
		}
		else
		{
			root.Right=inserthelper(root.Right,data);
	
		}
		
	return root;
	}
	
	public  void delete(int data)
	{
		deletehelper(root,data);
	}
	private TreeNode<Integer> deletehelper(TreeNode<Integer> root,int data)
	{
		if(root==null)
		{
			return null;
		}
		
		if(root.data==data)
		{
			if(root.left ==null && root.Right==null)
			{
				return null;
			}
			else if(root.left !=null && root.Right != null)
			{
			
				root.data=minelement(root.Right);
				root.Right=deletemin(root.Right);

				
				
				
			}
			else{
				if(root.left == null)
				{
					root.data=root.Right.data;
					root.Right=null;
					
				}else{
					root.data=root.left.data;
					root.left=null;
				}
				
				
				
			}
			
			
			
		}
		else if(root.data > data)
		{
		root.left=deletehelper(root.left,data);
		}
		else{
		root.Right=deletehelper(root.Right,data);

		}
		
		
		
		
		return root;
		
		
	}
	public int minelement(TreeNode<Integer> root)
	{
		
		if(root==null)
		{
			return Integer.MAX_VALUE;
		}

		if(root.left==null)
		{
			return root.data;
		}else{
			return minelement(root.left);
		}
		
		
		
		
	}
    public TreeNode<Integer> deletemin(TreeNode<Integer> root)
    {
    	if(root==null)
		{
			return null;
		}

		if(root.left==null)
		{
			
			
			 if(root.Right==null)
	           {
	             	return null ;
	           }
	          
	          root=root.Right;
	          return root;
		}else{
		 root.left=deletemin(root.left);
		}
		return root;
    }
    
    public void printTree(TreeNode<Integer> root)
    {
    	if(root==null)
    	{
    		return ;
    	}
    	
    	String s=""+root.data;
    	if(root.left!=null)
    	{
    		s=s+":L:"+root.left.data;
    		
    	}
    	if(root.Right!=null)
    	{
    		s=s+",R:"+root.Right.data;
    		
    	}
    	System.out.println(s);
    	printTree(root.left);
    	printTree(root.Right);
    	
    	
    	
    	
    }
}
