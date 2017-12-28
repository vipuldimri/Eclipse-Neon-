package TREE;
import java.util.Scanner;
public class TreeUse {

	
	public static TreeNode<Integer> createtree()
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter next node");
		n=sc.nextInt();
		TreeNode<Integer> root=new TreeNode<Integer>(n);
		System.out.println("Enter how many childern for "+ n );
		int childrencount=sc.nextInt();
		for(int i=0;i<childrencount;i++)
		{
			TreeNode<Integer> smalltress=createtree();
			root.children.add(smalltress);
		
			
		}
		return root;
		
		
	}
	
	public static void print(TreeNode<Integer> root)
	{
		
		String s=root.data + ":";
		for(int i=0;i<root.children.size();i++)
		{
			
				s = s+ root.children.get(i).data+" , ";			
		}
		System.out.println(s);
		for(int i=0;i<root.children.size();i++)
		{
			
				print(root.children.get(i));;			
		}
		
		
		
		
	}
	
	public static void main(String[] args) 
	{
		
		
//		TreeNode<Integer> root=new TreeNode<Integer>(10);
//		TreeNode<Integer> node1=new TreeNode<Integer>(100);
//		TreeNode<Integer> node2=new TreeNode<Integer>(200);
//		TreeNode<Integer> node3=new TreeNode<Integer>(300);
//		TreeNode<Integer> node4=new TreeNode<Integer>(400);
//
//		root.children.add(node1);
//		root.children.add(node2);
//		root.children.add(node3);
//		node2.children.add(node4);
//		System.out.println("hello");
//		System.out.println("stop before this");
		
		
		TreeNode<Integer> root=createtree();
		print(root);

	}

}
