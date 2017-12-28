package TREE;
import java.util.Scanner;
import Queuell.Queue;
import Queuell.QueueEmptyException;
public class inputandprit {

	public static TreeNode<Integer> createtree()
	{
	Scanner sc=new Scanner(System.in);	
	System.out.println("enter node data");
	int n=sc.nextInt();
	TreeNode<Integer> root=new TreeNode<Integer>(n);
	
	System.out.println("HOw many childern of "+n);
	int child=sc.nextInt();
	for(int i=0;i<child;i++)
	{
		TreeNode<Integer> smalltree=createtree();
		root.children.add(smalltree);
		
	}
	return root;
		
	}
	static void print(TreeNode<Integer> root)
	{
		
		String s= root.data+" : ";
		for(int i=0;i<root.children.size();i++)
		{
			
			s=s+ root.children.get(i).data+", ";
		}
		System.out.println(s);
		for(int i=0;i<root.children.size();i++)
		{
			
			print( root.children.get(i)); 
		}
		
		
	}


	public static TreeNode<Integer> createlvlwise()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter root data");
	int rootdata=sc.nextInt();
	Queue<TreeNode<Integer>> queuependingnodes=new Queue<>();
	
	TreeNode<Integer> root=new TreeNode<Integer>(rootdata);
	queuependingnodes.enqueue(root);
	while(!queuependingnodes.isEmpty())
	{
		
		try {
			TreeNode<Integer> front=queuependingnodes.dequeue();
			System.out.println("enter no of childern for "+front.data);
			int nochild=sc.nextInt();
			for(int i=0;i<nochild;i++)
			{
				System.out.println("enter "+(i+1)+"th" +" child of "+front.data);
				int child=sc.nextInt();
				TreeNode<Integer> childnode=new TreeNode<Integer>(child);

				front.children.add(childnode);
				queuependingnodes.enqueue(childnode);

				
			}
			
		   } 
		catch (QueueEmptyException e)
		{
			//should not come here as we are already checking
			//if empty of noy in entery
			System.out.println("em[ty");
		}
		
	}
	
	return root;
	
	}

	public static void printlvlwise(TreeNode<Integer> root) throws QueueEmptyException
	{
		
		Queue<TreeNode<Integer>> queue =new Queue<>();
		queue.enqueue(root);
		System.out.println(root.data);
		
		while(!queue.isEmpty())
		{
		
		TreeNode<Integer> front=queue.dequeue();
		String s="";
		for(int i=0;i<front.children.size();i++)
		{
			
		System.out.print(front.children.get(i).data+" ");
			queue.enqueue(front.children.get(i));
        }

	}
		
		
	}

	
	public static int count (TreeNode<Integer> root)
	{
		int c=1;
		
		
		for(int i=0;i<root.children.size();i++)
		{
			 c+=count(root.children.get(i));
			
		}
		
		
		
		return c;
	}
	
	public static int sumofallnods(TreeNode<Integer> root)
	{
		int c=root.data;
		
		
		for(int i=0;i<root.children.size();i++)
		{
			 c+=sumofallnods(root.children.get(i));
			
		}
		
		
		
		return c;
	}

	public static int largestnodedata(TreeNode<Integer> root)
	{
		int largest=root.data;
		
		
		for(int i=0;i<root.children.size();i++)
		{
		    int smalltreelargest=largestnodedata(root.children.get(i));
			if(smalltreelargest>largest)
			{
				largest=smalltreelargest;
			}
		}
		
		
		
		return largest;
	}
	
	public static int noofnodesgreaterthenx(TreeNode<Integer> root,int x)
	{
		int c=0;
		if(root.data>x)
		{
			c=1;
		}
		
		
		for(int i=0;i<root.children.size();i++)
		{
		    c+=noofnodesgreaterthenx(root.children.get(i),x);
			
		}
		
		
		
		return c;
	}
	public static  int height(TreeNode<Integer> root)
	{
		int height=1;
		int s=0;
		for(int i=0;i<root.children.size();i++)
		{

		int smalltreeheight=height(root.children.get(i));
		if(smalltreeheight>s)
		{	
		s=smalltreeheight;
		}
			
		}
		
		
		return height+s;
		
	}
	
	public static void printatdepthK(TreeNode<Integer> root,int k)
	{
		if(k<0)
		{
			return;
		}
		if(k==0)
		{
			System.out.println(root.data);
			return ;
		}
		for(int i=0;i<root.children.size();i++)
		{
			printatdepthK(root.children.get(i),k-1);
		}
		
		
	}

	public static  int noofleaf(TreeNode<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}
		if(root.children.size()==0)
		{
			return 1;
		}
		
		int ans=0;
		for(int i=0;i<root.children.size();i++)
		{
			ans+=noofleaf(root.children.get(i));
		}
		
		return ans;
	}
	
	public static void preeorder(TreeNode<Integer> root)
	{
		
		if(root==null)
		{
			return ;
		}
		System.err.print(root.data+" ");
		for(int i=0;i<root.children.size();i++)
		{
			preeorder(root.children.get(i));
					
		}
		
		
		
	}

	public static void postorder(TreeNode<Integer> root)
	{
		
		if(root.children.size()==0)
		{
			System.out.print(root.data+" ");
		}
		for(int i=0;i<root.children.size();i++)
		{
			
			postorder(root.children.get(i));
		}
		
		System.out.print(root.data+" ");

	}
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root)
    {

		//max node of =node+its child
	  TreeNode<Integer> ans=root;
      int sum=root.data;
      
      for(int i=0;i<root.children.size();i++)
      {
    	  sum=sum+root.children.get(i).data;
      }
      
      for(int i=0;i<root.children.size();i++)
      {
        
    	TreeNode<Integer> smallans=maxSumNode(root.children.get(i));
    	int smallsum=smallans.data;  
    	for(int i2=0;i2<smallans.children.size();i2++)
          {
        	  smallsum=smallsum+smallans.children.get(i2).data;
          }
        
    	if(smallsum>sum)
    	{
    		sum=smallsum;
    		ans=smallans;
    	}
        
      }
      
      return ans;
      
    }
	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2)
    {
      	boolean ans=true;
			if(root1==null && root2==null )
            {
              return false;
            }
      if(root1.data !=root2.data)
      {
        return  false;
      }
      
      if(root1.children.size() !=root2.children.size())
      {
        return false;
      }
      
      
      for(int i=0;i<root1.children.size();i++)
      {
        
        
        ans=checkIdentical(root1.children.get(i),root2.children.get(i));
        if(ans==false)
        {
          return false;
        }
        
      }
    	  
         return ans;
	
      
 

    
    }
      public static TreeNode<Integer> 
      findNextLargerNode(TreeNode<Integer> root, int n)
      {
    	TreeNode<Integer>   ans=null;
    	if(root.data>n)
		{
			ans=root;
		}
    	  
    	  TreeNode<Integer>  smallans=null;
    	  for(int i2=0;i2<root.children.size();i2++)
          {
          smallans=findNextLargerNode(root.children.get(i2),n);
        	if(ans==null)
        	{
        		ans=smallans;
        	}
        	else if(smallans.data < ans.data)
        	{
        		ans=smallans;
        	}
          }
    	  
    	  
    	  return smallans;

	}
      public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){


    	  	return null;
  	}
	public static void main(String[] args) throws QueueEmptyException 
	{
		//TreeNode<Integer> root=createtree();
		//print(root);

		TreeNode<Integer> root=createlvlwise();
		printlvlwise(root);
//		int sum=sumofallnods(root);
//		System.out.println();
//		System.out.println("sum is "+sum);
//		System.out.println("largest is"+largestnodedata(root));
//		System.out.println(noofnodesgreaterthenx(root,3));
//		System.out.println(height(root));
		//preeorder(root);
		//postorder(root);
		
		
		//System.out.println(count(root));
	
		System.out.println("ans from here ");
		System.out.println(	maxSumNode(root).data);
		

	}

}
