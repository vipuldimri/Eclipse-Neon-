package SingleLinklist;

import java.util.Scanner;

import org.omg.CORBA.Current;

public class Proper {

	
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

		Node<Integer>  head1 = takeinput();
	    //	listprint(head1);
		//System.out.println();
		//Node<Integer>  head2 = takeinput();
		//findmiddle(head1);
		//listprint(head2);
		
		
	
		  Node<Integer> result=reverseK(head1, 3);
	      listprint(result);
	      
	
		
		//sort end
		
		//Node<Integer>  sort=mergesortlist(head1);
		//Node<Integer>  reverse=mergesortlist(head1);
		
//		Node<Integer>  reverse=ReverseRecurrsive(head1);
		
		//Node<Integer>  reverse=reverseiterative(head1);
		
		//Node<Integer>  result=insertat(head1,3,5);
		
		//Node<Integer>  result=evenafterodd(head1);
		//listprint(result);
		

		//Node<Integer>  result2=delat(head1,2);
		//listprint(result2);
		
		
//		Node<Integer> result=removeDuplicates(head1);
//		listprint(result);
//		
//		Node<Integer> result=append(head1, 3);
//		listprint(result);
		
//		Node<Integer> result=bubbleSort(head1);
//		listprint(result);
		//Node<Integer> result=swap_nodes(head1, 2, 5);
		//listprint(result);
//		Node<Integer> result=skipMdeleteN(head1, 2, 3);
//	System.out.println();
//		listprint(result);
		
		//Node<Integer> result=evenafterodd(head1);
	   // listprint(result);
		
//		Node<Integer> result=removeconsame(head1);
//	    listprint(result);
//	    
//	    Node<Integer> result=sortEvenOdd(head1);
//	    listprint(result);
//	    
		
	
	    
	    
		//isPalindrome_2(head1);
		
		//Node<Integer> result=ReverseRecurrsive(head1);
	//	listprint(result);
		
		//sort end
	//	Node<Integer>  result=mergertwosortedLL(head1,head2);
		//listprint(result);

		
		
		//listprint(head);
		//head=insert(head,500,0);
		//System.out.println();
		//listprint(head);
		//System.out.println();
		//head=delete(head,0);
		//listprint(head);
		
		//System.out.println("88888888888");
		//printReverseRecursive(head);
		//System.out.println("duplicate");
		//head= removeDuplicates(head);
		//listprint(head);


		
//		Node<String>  node33=new Node<>("Vipul");
//		Node z2=node33; //error
//		Node<Integer> z22=node33;
		
		
	}
	
	static Node<Integer> reverseK(Node<Integer> head,int k)
	{
		
		
		
		
		int count=0;
		Node<Integer> current=head;
		Node<Integer> t=head;
		Node<Integer> temp=null;
		returndouble<Integer> ans;

		while(count<k)
		{
			if(t.next==null)
			{
				 ans=reversell(current);
				 return ans.head;
			}
			count++;
			
			
			t=t.next;
			if(count==k-1)
			{
				temp=t;
			}
		}
		
		
		
		
		 Node<Integer> smallans=reverseK(t,k);
		 temp.next=null;
		 ans=reversell(current);
		 ans.tail.next=smallans;
		
		return ans.head;
	}
	static returndouble<Integer> reversell(Node<Integer> head)
	{
		Node<Integer> current=head;

		if(current.next==null)
		{
			returndouble<Integer> obj=new returndouble<>();
			obj.head=current;
			obj.tail=current;
			return obj;
		
			
		}
		Node<Integer> temp=current.next;
		returndouble<Integer> smallans=reversell(current.next);
		
		temp.next=current;
		current.next=null;
		
		
		returndouble<Integer> obj=new returndouble<>();
		obj.head=smallans.head;
		obj.tail=current;
		
		
		return obj;
		
	}
	
	static Node<Integer> removeconsame(Node<Integer> head)
	{
		
		Node<Integer> current =head;
		Node<Integer> t1=head;
		Node<Integer> t2=head;
		
		while(current.next!= null)
		{
			
			if(current.data.equals(current.next.data))
			{
				
				t2=t2.next;
				if(current.next.next==null)
				{
					t1.next=null;
				}
			}
			else{

					t2=t2.next;
					t1.next=t2;
					t1=t2;
			}
			
			if(t1.next==null)
			{
				current=t1;
			}else{
				current=current.next;
			}
		}
		
		return head;
	}
	public static Node<Integer> sortEvenOdd(Node<Integer> head) {

		
		Node<Integer> headeven=null;
		Node<Integer> headodd=null;
		Node<Integer> taileven=null;
		Node<Integer> tailodd=null;
		Node<Integer> Current=head;
		
	
		while(Current!=null)
		{

			if((Current.data % 2)==0 )//even
			{
					if(headeven==null)
					{
					Node<Integer> newnode=new Node<>(Current.data);
					headeven=newnode;
					newnode.next=null;
					taileven=newnode;

					}else{
					Node<Integer> newnode=new Node<>(Current.data);
					taileven.next=newnode;
					newnode.next=null;
					taileven=newnode;
					
					}
					
			}
			else{
				if(headodd==null)
				{
				Node<Integer> newnode=new Node<>(Current.data);
				headodd=newnode;
				newnode.next=null;
				tailodd=newnode;

				}else{
				Node<Integer> newnode=new Node<>(Current.data);
				tailodd.next=newnode;
				newnode.next=null;
				tailodd=newnode;

				
				}
				
				
			}
			Current=Current.next;
			
		}
		
		listprint(headeven);
		System.out.println();
        listprint(headodd);	
		System.out.println();
       
		
		tailodd.next=headeven;
        
        
        
       
		return headodd;
	}
	//helper of above
	
	//helper ends
	
	public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {

		
		Node <Integer> current=head;
		Node <Integer> temp=null;

		int no=1;
		while(current!=null)
		{
			if(no<=M)
			{
				if(no==M)
				{
					temp=current;
				}
			no++;
			System.out.print(current.data +" ");
		
			current=current.next;

			}else
			{
				
				boolean flag=false;
				if(current.next==null)
				{
					flag=true;
					temp.next=null;
					break;
				}
				int k=0;
				while(k<N)
				{
					if(current.next==null)
					{
						flag=true;
						break;
					}
				current=current.next;
				
				k++;
				}
				no=1;
				//temp.next=null;
				if(flag==true)
				{
					temp.next=null;

				}else{
				temp.next=current;
				}
				
			}
		}
		
		return head;
	}
public static  Node<Integer> swap_nodes(Node<Integer>head,int i,int j)
{
		
	Node<Integer> current =head;
	
	
	Node<Integer> temp1 =null ;
	Node<Integer> temp2 =null ;
//	Node<Integer> temp3 =null ;
//	Node<Integer> temp4 =null ;
	int a1=0;
	int a2=0;
	while(current!=null)
	{
		if(a1==i)
		{
			temp1=current;
		}
		if(a2==j)
		{
			temp2=current;

		}
		a1++;
		a2++;
		current=current.next;
	}
int swap;
swap=temp1.data;
temp1.data=temp2.data;
temp2.data=swap;

	
	return head;
	}
	public static Node<Integer> bubbleSort(Node<Integer> head )
	{

		Node<Integer> current=head;
		int size=0;
		while(current!=null)
		{
			
			size++;
			current=current.next;
		}
		current=head;
		//System.out.println(size);
		
		for(int i=1;i<size;i++)
		{
			
			while(current.next!=null)
			{
				
				if(current.data > current.next.data)
				{
					int swap;
					swap=current.data;
					current.data=current.next.data;
					current.next.data=swap;
					
				}
				current=current.next;

			}
			current=head;
			
			
		}
		
		
	
	return head;
	}
	public static Node<Integer> append(Node<Integer> head, int n) 
    {
      
		Node<Integer> current=head;
		Node<Integer> tail=null;
		Node<Integer> temp=null;
		int count=0;
		while(current!=null)
		{
			
			count++;
			tail=current;
            current=current.next;
			
		}
		current=head;
		
	
			int c=1;
			while(current!=null)
			{
				if(c== count-n)
				{
					temp=current;
					break;
				}
				c++;
				current=current.next;
			}

      
			Node<Integer> head2=temp.next;
			temp.next=null;
			tail.next=head;
         return head2;
      
    }
	public static boolean isPalindrome_2(Node<Integer> head) 
    {
      
		Node<Integer> slow=head;
		Node<Integer> fast=head;
		boolean flageven=false;
		Node<Integer> current=head;
		while(fast.next!=null)
		{
			if(fast.next.next == null)
			{				
				flageven=true;

				break;
			}
			slow=slow.next;
			fast=fast.next.next;
			
		}
		
		System.out.println(slow.data);
		boolean flag=false;
		Node<Integer> head2=slow.next;
		slow.next=null;
		Node<Integer> reverse=ReverseRecurrsive(head2);
		
		listprint(reverse);
		System.out.println();
		listprint(head);

		if(flageven)
		{
			while(reverse !=null || current !=null)
			{
				
				if(reverse.data.equals(current.data))
				{
					flag=true;
				}else{
					flag=false;
				}
				
				reverse=reverse.next;
				current =current.next;
			}
		}
		else{
		while(reverse !=null || current.next !=null)
		{
			
			if(reverse.data.equals(current.data))
			{
				flag=true;
			}else{
				flag=false;
			}
			
			reverse=reverse.next;
			current =current.next;
		}
		}
      System.out.println(flag);
     return flag; 
    }
	
	//exercise vale
	//print reverse
	public static void printReverseRecursive(Node<Integer> root) 
    {
      
      if(root==null)
      {
             return;    
      }
      
      printReverseRecursive(root.next);
      System.out.println(root.data);
    
    }

	public static Node<Integer> removeDuplicates(Node<Integer> head)
	{
		
		if(head==null)
		{
			return head;
		}
		if(head.next==null)
		{
			return head;
		}
		
		
		Node<Integer> smallans=removeDuplicates(head.next);
		if(smallans.data==head.data)
		{
			head.next=smallans.next;
			
		}
		
		return head;
	}
	
	
	static int findmiddle(Node<Integer> head)
	{
		//only for even length
		//move slow one and fast twice
		// when fast is at last means slow is at middle 
		Node<Integer> slow=head;
		Node<Integer> fast=head;
		while(fast.next!=null)
		{
			//if case for only even case 
			if(fast.next.next==null)
			{
				break;
			}
			slow=slow.next;

			fast=fast.next.next;
		}
		
		//System.out.println(slow.data);
		return slow.data;
		
	}
	
	static Node<Integer> mergesortlist(Node<Integer> head)
	{
		
		
		
		
		if(head.next== null || head ==null)
		{
			return head;
		}
		
		
		
		int mid=findmiddle(head);
		Node<Integer> temp=head;
		while(temp.data!=mid)
		{
			
			
			temp=temp.next;
			
		}
		Node<Integer> temp2=temp.next;

		temp.next=null;
		//;
		
		
		
		 return mergertwosortedLL
				 (mergesortlist(head), 
				  mergesortlist(temp2));
		
		
		
	}
	static Node<Integer> mergertwosortedLL(Node<Integer> head1,Node<Integer> head2)
	
	{
		
		Node<Integer> t1=head1;
		Node<Integer> t2=head2;
		Node<Integer> head;
		Node<Integer> tail;
		
		if(t1.data <=t2.data)
		{
			head=t1;
			tail=t1;
			t1=t1.next;
		}else{
			head=t2;
			tail=t2;
			t2=t2.next;
		}
		
		
		
		while(t1!=null && t2!=null)
		{
			
			if(t1.data <= t2.data)
			{
				
				tail.next=t1;
				tail=t1;
				t1=t1.next;
				
			}
			else{
				
				
				tail.next=t2;
				tail=t2;
				t2=t2.next;
			}
			
			
			//t1=t1.next;
			//t2=t2.next;
		}
		
		
		if(t1==null)
		{
			tail.next=t2;
		}else if(t2==null)
		{
			tail.next=t1;
		}
		
		
		return head;
		
	}
	
	static Node<Integer> ReverseRecurrsive( Node<Integer> head)
	{
		///complexity is n2
		if(head ==null || head.next==null)
		{
			return head;
		}
		
		Node<Integer> tail=head.next;
		Node<Integer> smallans=ReverseRecurrsive(head.next);
//		while(temp.next!=null)
//		{
//			
//			temp=temp.next;
//			
//		}
		//above code to traverse to last of small ans
		
		//temp.next=head;
		//head.next=null;
		
		
		//below better code to need ro traverse to last  AS 
		//head.next part has the address of last node of the 
		//smlaa ans that is reversed list
		tail.next=head;
		head.next=null;
		
		return smallans;
		
	}
	
	static Node<Integer> reverseiterative(Node<Integer> head)
	{
		
		Node<Integer> pre=null;
		Node<Integer> current=head;
		Node<Integer> next=null;
		
		while(current !=null)
		{
			next=current.next;
			current.next=pre;
			pre=current;
			current=next;
		}
		
		
		
		return pre;
	}

	
	static Node<Integer> insertat(Node<Integer> head,int pos, int element)
	{
		
		
		if(pos==0)
		{
			
			Node<Integer>  newnode=new Node<>(element);
			
			newnode.next=head;
			return newnode;

		}
		
		
		if(head==null) 
			//case if pos is greater then 
			//that of linklist
		{
			return head;
		}

		
		Node<Integer> smallans=insertat(head.next,pos-1,element);
		head.next=smallans;
		return head;
	}
	static Node<Integer> delat(Node<Integer> head,int pos)
	{
		
		
		if(pos==0)
		{
			head=head.next;
			return head;
		}
		
		if(head.next==null) //case if pos is greater then 
		{
			return head;
		}
		Node<Integer> smallans=delat(head.next,pos-1);
		head.next=smallans;
		return head;
	}

	static Node<Integer> evenafterodd(Node<Integer> head)
	{

		
		
		Node<Integer> temp=head;
		Node<Integer> current=head;
		
		
		while(current != null)
		{
			
			if(current.data % 2 !=0 || current.data ==1)
			{
				int swap;
				swap=current.data;
				current.data=temp.data;
				temp.data=swap;
				temp=current.next;
				current=current.next;

				
			}
			else if(current.data % 2 ==0 || current.data ==0)
			{
				current=current.next;

			}
			
			
		}
		return head;
		
	}

}
