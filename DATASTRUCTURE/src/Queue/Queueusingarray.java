package Queue;

public class Queueusingarray 
{
	
	
	int arr[];
	int front;//front of the queue index
	int rear;//rear of the queue index 
	int size;//size of the queue index
	
	
	Queueusingarray()//creating the queue of size 10
	{
		arr=new int[10];
		front=-1;
		rear=-1;
		size=0;
	}
	
	Queueusingarray(int capacity)//creating the queue of size 10
	{
		arr=new int[capacity];
		front=-1;
		rear=-1;
		size=0;
	}
	//now functions complex O(1)
	int size()
	{
		return size;
	}
	boolean isempty()
	{
		
	if(size==0)
	{
		return true;
	}
	else{
		return false;
	}

	
	}
	
	int frontelement()throws QueueEmptyException
	{
		if(size==0)
		{
			QueueEmptyException obj=new QueueEmptyException();
			throw obj;
			//System.out.println("kya hua");
		}
		
		return arr[front];
	}

	
	void enqueue(int element)throws Queuefullexception
	{
		
		if(size==arr.length)
		{
			Queuefullexception obj=new Queuefullexception();
			throw obj;
		}
		if(front==-1)
		{
			front++;
		}
		rear=rear+1;
		if(rear==arr.length)
		{
			rear=0;
		}
		
		arr[rear]=element;
		size=size+1;
		
	}

	int dequeue ()throws QueueEmptyException
	{
		
		if(size==0)
		{
			QueueEmptyException obj=new QueueEmptyException();
			throw obj;
			//System.out.println("kya hua");
		}
		int temp=arr[front];
		front++;
		if(front==arr.length)
		{
			front=0;
		}
		size--;
		if(size==0)//if after operation queue
			//becomes empty
		{
			front=-1;
			rear=-1;
		}
		
		
		return temp;
	}
	
	void doublesize(int arr[])
	{
		
		
	
		
		int temp[]=arr;
		arr=new int[2*temp.length];
		
		
		
		
		
	}

}
