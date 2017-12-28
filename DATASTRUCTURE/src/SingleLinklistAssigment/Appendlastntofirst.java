package SingleLinklistAssigment;

import java.util.Scanner;

import SingleLinklist.Node;

public class Appendlastntofirst {

	static Node<Integer> takeinput()
	{
		
		Node<Integer> head=null;
		Node<Integer> tail=null;
		
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		
		while(data !=-1)
		{
			
			Node<Integer>  newnode=new Node<>(data);
			if(head==null)
			{
				head=newnode;
				tail=newnode;
			}else{
				
				
				
				Node<Integer> temp=head;
				//below code is correctr but has n^2 complex
				
//				while(temp.next != null)
//				{
//					temp=temp.next;
//				}

				//below complex is n only
				tail.next=newnode;
				tail=newnode;
			}

			data=sc.nextInt();
		}
		
		return head;
	}
	
	
	static 	Node<Integer> insert(Node<Integer> head,int data,int pos)
	{
		
		Node<Integer> temp=head;
		if(pos==0)
		{
			
			Node<Integer>  node2=new Node<>(data);
			node2.next=head;
		    head=node2;
		    return head;
		}
		
		int count=0;
		while(temp!=null)
		{
			if(count==pos-1)
			{
				break;
			}
			count++;
			temp=temp.next;
		}
		
		Node<Integer>  node2=new Node<>(data);
		node2.next=temp.next;
		temp.next=node2;
		return head;
		
	}
	
	static Node<Integer> delete(Node<Integer> head,int pos)
	{
		
		
		
		Node<Integer> temp=head;
		if(pos==0)
		{
			head=head.next;
			return head;
		}
        int count=0;
		while(temp!=null)
		{
			if(count==pos-1)
			{
				break;
			}
			count++;
			temp=temp.next;
		}
		
		temp.next=temp.next.next;
		return head;
	
	}
	static void listprint(Node<Integer> head)
	{
		Node<Integer> temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
//		Node<Integer>  node1=new Node<>(100);
//		Node<Integer>  node2=new Node<>(200);
//		
//		Node<Integer>  node3=new Node<>(300);
//		Node<Integer>  node4=new Node<>(400);
//		Node<Integer>  node5=new Node<>(500);
//
//
//		node1.next=node2;
//		node2.next=node3;
//		

		Node<Integer>  head = takeinput();
		listprint(head);
		head=insert(head,500,0);
		System.out.println();
		listprint(head);
		System.out.println();
		head=delete(head,0);
		listprint(head);

		
//		Node<String>  node33=new Node<>("Vipul");
//		Node z2=node33; //error
//		Node<Integer> z22=node33;
		
		
	}

}
