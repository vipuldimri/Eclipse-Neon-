package StackQueueAssi;

import java.io.IOException;

import Queuell.Queue;
import Queuell.QueueEmptyException;

public class ReverseQueue 
{
	public static void reverseQueue(Queue<Integer> q) throws QueueEmptyException 
    {
		
		if(q.size()==1)
		{
			return;
		}
		
		int front=q.front();
		q.dequeue();
		reverseQueue(q);
		
		q.enqueue(front);
		
		

	}
	public static void main(String... S)throws QueueEmptyException
	{
		
		Queue<Integer> q=new Queue<>();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		reverseQueue(q);
	}

}
