package Queuell;

public class Queue<T> 
{


	private Node<T> front;
	private Node<T> rear;
    private int size;
	public Queue() 
	{

	     front=null;
		 rear=null;
	     size=0;
		
	}
//if queue we go fordward in case of stack backward
	public void enqueue(T data) 
	{
		

		Node<T> newnode=new Node<>(data);
		newnode.next=null;
		
		if(front==null)
		{
			front=newnode;
			rear=newnode;
			size++;


		}else{
		
		size++;
		rear.next=newnode;
		rear=newnode;
		}
		
	}

	public int size() {

		
		return size;
	}

	public boolean isEmpty() {

		if(size==0)
		{
			return true;
		}else{
			return false;
		}
	}

	public T dequeue() throws QueueEmptyException 
	{
		if(size==0)
		{
			QueueEmptyException obj=new QueueEmptyException();
			throw obj;
		}
		
		
		
		T temp=front.data;
		front=front.next;
		if(size==1)
		{
				rear=null;
			
			
		}
		size--;
		
		
		
		return temp;

	}

	public T front() throws QueueEmptyException {

		if(size==0)
		{
			QueueEmptyException obj=new QueueEmptyException();
			throw obj;
		}
		return front.data;
				
		
	}
}