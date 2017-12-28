package Binarytree;
import java.util.Scanner;
import java.util.ArrayList;

import java.util.LinkedList;
import java.util.Queue;
public class BinaryTreeUse 
{
	
	public static BinaryTreeNode<Integer> takeinputrecursive(Scanner sc)
	{
		
		System.out.println("enter root no");
		int rootdata=sc.nextInt();
		if(rootdata==-1)
		{
			return null;
		}
		
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootdata);
		root.left=takeinputrecursive(sc);
		root.right=takeinputrecursive(sc);

		
		return root;
	}
	public static void printrecursive(BinaryTreeNode<Integer> root)
	{
		
		if(root ==null)
		{
			return ;
		}
		String s=root.data +" :";
		
		if(root.left!=null)
		{
			s+="L "+root.left.data+", ";
		}
		if(root.right!=null)
		{
			s+="R "+root.right.data+", ";
		}
		System.out.println(s);
		
		
		printrecursive(root.left);
		printrecursive(root.right);
		
		
	}

	
	public static int countnodes(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}
		int count=0;

		count=1; 
		int x1=countnodes(root.left);
		int x2=countnodes(root.left);

		return x1+x2+count;
	}
	public static boolean findnodes(BinaryTreeNode<Integer> root,int x)
	{
		if(root==null)
		{
			return false;
		}
		if(root.data==x)
		{
			return true;
		}

        
	

		return (findnodes(root.left,x)||findnodes(root.left,x));
	}
	public static void preOrder(BinaryTreeNode<Integer> root) 
    {
	
      		if(root==null)
            {
              return ;
            }
            
           System.out.print(root.data+" ");
            
    	   preOrder(root.left);
           preOrder(root.right);
    
		
	}
	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root)
    {
		
	     if(root==null)
         {
           return ;
         }
    
          printNodesWithoutSibling(root.left);
      
      		if(root.right==null && root.left!=null)
            {
              System.out.print(root.left.data+" ");
            }
      		 if(root.left==null && root.right !=null)
             {
               System.out.print(root.right.data+" ");

             }
         printNodesWithoutSibling(root.right);
      
	}
	
	public static void mirror(BinaryTreeNode<Integer> root)
	{
		
		
		
		
		
		

	}
	public static int diameter1(BinaryTreeNode<Integer> root)
	{
		//we have 3 option in this case
		//O(n*h)
		//we are doing same work of findinf heigth and then for diameter ag
		//again findinf height
	
		if(root==null)
		{
			return 0;
		}
		
		int option1=height(root.left) + height(root.right);
		int option2=diameter1(root.left);
		int option3=diameter1(root.right);
		
		
		return Math.max(option1, Math.max(option2, option3));
		
		
	}
	public static Pair<Integer,Integer> heightdiameter(BinaryTreeNode<Integer> root)
	{
		
	
		if(root==null)
		{
			Pair<Integer,Integer> p=new Pair<>();
			p.first=0;
			p.Second=0;
			return p;
		}
		
		
		Pair<Integer,Integer> p1=heightdiameter(root.left);
		Pair<Integer,Integer> p2=heightdiameter(root.right);
		
		int height=1+ Math.max(p1.first,p2.first);
		int option1=p1.first+p2.first;
		int option2=p1.Second;
		int option3=p2.Second;
		
		int diameter=Math.max(option1, Math.max(option2, option3));
		Pair<Integer,Integer> p=new Pair<>();
		p.first=height;
		p.Second=diameter;
		return p;
		
	}
	
	
	
	public static int height(BinaryTreeNode<Integer> root)
	{
		
		if(root==null)
		{
			return 0;
			
		}
		int h=1;
		int x1=height(root.left);
		int x2=height(root.right);
		
		return Math.max(x1, x2)+h;
		
		
	}
	public static BinaryTreeNode<Integer> 
	getTreeFromPreorderAndInorder(int[] pre,int[] in)
	{
		
	
		
		
		return helpergetTreeFromPreorderAndInorder
				(pre,in,0,pre.length-1,0,in.length-1);
		
		
	}
	
	
	
	
	
	
	
	
	
	public static BinaryTreeNode<Integer> 
	helpergetTreeFromPreorderAndInorder
	(int[] pre,int[] in ,int psi,int pei,int insi,int inei)
	{
		
		if(psi >pei || insi >inei)
		{
			return null;
		}
		
		int root=pre[psi];
		BinaryTreeNode<Integer> node=new BinaryTreeNode<Integer>(root);
		int i;
		int leftinlen=0;
		for(i=0;i<in.length;i++)
		{
			if(in[i]==root)
			{
				leftinlen=i;
			}
			
		}
		int rigtinlen=in.length-leftinlen-1;
		
		
		
		node.left=helpergetTreeFromPreorderAndInorder(pre,in,psi+1,leftinlen+1,insi,leftinlen-1);
		node.right=helpergetTreeFromPreorderAndInorder(pre,in,leftinlen+2,pei,leftinlen+1,inei);
		
		
		
	
	
	
	
	
		return node;

	}
	
	
	
	
	
	
	public static boolean checkBalanced(BinaryTreeNode<Integer> root)
    {
		//this is not very efficient 
		// has complexity O(n*h);

	     if(root==null)
        {
          return true;
        }
     
     int x1=height(root.left);
     int x2=height(root.right);
     
     if(x1>=x2)
     {
       int z=x1-x2;
       if(z>1)
       {
         return false;
       }
     }else{
          int z=x2-x1;
       if(z>1)
       {
         return false;
       }
     }
    
    
     return ( checkBalanced(root.left)&& checkBalanced(root.right));
	}
	public static pair2 checkBalancedbetter(BinaryTreeNode<Integer> root)
    {
		
		if(root==null)
		{
			pair2 p=new pair2();
			p.height=0;
			p.isbalance=true;
			return p;
		}
		
		pair2 left=checkBalancedbetter(root.left);
		pair2 right=checkBalancedbetter(root.right);
		
		
		pair2 p=new pair2();
        p.height= 1+Math.max(left.height, right.height);
        
        if(left.isbalance == false || right.isbalance ==false)
        {
        	pair2 p2=new pair2();
		    p2.height=p.height;
		    p2.isbalance=false;
		    return p2;
        }
        
        if( Math.abs(left.height-right.height) >1)
        { 
        	pair2 p2=new pair2();
		    p2.height=p.height;
		    p2.isbalance=false;
		    return p2;
        }
        
        
        p.isbalance=true;
        
        return p;
		
		
	
	
    }
	
	public static void printLevelWise(BinaryTreeNode<Integer> root)
    {
		
		if(root==null)
        {
          return ;
        }
        Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
      	q.add(root);
      	q.add(null);

      
      while(!q.isEmpty())
      {
        BinaryTreeNode<Integer> curr = q.remove();
        
        if(curr==null)
        {
          System.out.println();


        }
        else
        {
          System.out.print(curr.data);
       
          if(curr.left!=null)
        {
          q.add(curr.left);

        }
         if(curr.right!=null)
        {
          q.add(curr.right);

        }
        }
        
        
        
      }
    }
    
	
	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) 
    {
	  ArrayList<Integer> al=new ArrayList<>();
      helper(root,k,al);
	}
   public static void helper(BinaryTreeNode<Integer> root, int k,  ArrayList<Integer> al)
   {
	   if(root==null)
	     {
	       return;
	     }
     if(root.left==null && root.right==null)
     {
       if(k-root.data==0)
       {
         for(Integer kk:al)
         {
           System.out.print(kk+" ");
         }
         
       }
       
       
       
     }
     
     
     
     ArrayList<Integer> al2=new ArrayList<>();
     al2.add(root.data);
         for(Integer kk:al)
         {
                 al2.add(kk);
         }
     
     k=k-root.data;
     
     helper(root.left,k,al2);
     helper(root.right,k,al2);
     
     
     
     
    
   }

      
	public static void main(String[] args) 
	{

		
//		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(10);
//		BinaryTreeNode<Integer> node1=new BinaryTreeNode<Integer>(20);
//		BinaryTreeNode<Integer> node2=new BinaryTreeNode<Integer>(30);
//        root.left=node1;
//		root.right=node2;
		
		Scanner sc =new  Scanner(System.in);
		BinaryTreeNode<Integer> root=takeinputrecursive(sc);
		//printrecursive(root);
	    //System.out.println(countnodes(root));
		
		
	    //preOrder(root);
		//printNodesWithoutSibling(root);
//		Pair<Integer,Integer> ans=heightdiameter(root);
//		System.out.println("height is -" +ans.first);
//		System.out.println("diameter is-"+ans.Second);
		
		printLevelWise(root);

	}

}
