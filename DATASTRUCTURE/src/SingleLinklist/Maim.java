package SingleLinklist;

public class Maim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node<Integer>  node1=new Node<>(100);
		System.out.println(node1.data);
		System.out.println(node1.next);
		
	//	Node<String>  node2=new Node<>("vipul");
		Node<Integer>  node2=new Node<>(200);
		node1.next=node2;
//		
//		System.out.println(node2.data);
//		Node z=node1;
//	while(z!=null)
//	{
//		System.out.println(z.data);
//		z=z.next;
//	}
		
	}

}
