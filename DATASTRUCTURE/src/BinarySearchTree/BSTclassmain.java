package BinarySearchTree;

public class BSTclassmain {

	public static void main(String[] args) 
	{
		
		BSTclass bst=new BSTclass();
		bst.insert(10);
		
		bst.insert(5);
		bst.insert(6);
		bst.insert(2);

	
		
	    bst.printTree(bst.root);
	    
	   
	    System.out.println( bst.hasdata(5));
	    System.out.println( bst.hasdata(11));
	    
	    
	  //  System.out.println("min +"+ bst.minelement(bst.root));
	    bst.delete(5);
	    
	    
	    bst.printTree(bst.root);


	    
	}

}
