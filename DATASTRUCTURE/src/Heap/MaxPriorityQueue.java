package Heap;

import java.util.ArrayList;

public class MaxPriorityQueue 
{
	
	ArrayList<Integer> queue;
	
	MaxPriorityQueue()
	{
		queue=new ArrayList<>();
	}

	public int getSize()
	{
		return queue.size();
	}
	public boolean isEmpty()
	{
		return queue.size()==0;
	}

	public int getMax()throws HeapEmptyException
	{
		
		if(queue.size()==0)
		{
			throw new HeapEmptyException();
		}
		return queue.get(0);
	}

	
	public void insert(int element)
	{
		
		queue.add(element);
		int  childindex=queue.size()-1;
		int parentindex= (childindex-1)/2;
		
		while( childindex > 0)
		{
		     			
			if(queue.get(childindex) > queue.get(parentindex))
			{
			
			int swap=queue.get(childindex);
			queue.set(childindex, queue.get(parentindex));
			queue.set(parentindex, swap);
			childindex=parentindex;
			parentindex=(childindex-1)/2;
		
			}
			else{
				return ;
			}
		}
				
	}

	public int remove()throws HeapEmptyException
	{
		if(queue.size()==0)
		{
			throw new HeapEmptyException();
		}
		
		int max=queue.get(0);
		
		
		queue.set(0, queue.get(queue.size()-1));
		queue.remove(queue.size()-1);
		int parentindex=0;
		int left=(2*parentindex)+1;
		int right=(2*parentindex)+2;
		
		while(left < queue.size())
		{
		
		
			
			if(right >= queue.size())
			{
				
				if(queue.get(left) > queue.get(parentindex))
				{
				int swap=queue.get(parentindex);
				queue.set(parentindex, queue.get(left));
				queue.set(left, swap);
				return max;
				}
				else{
					return max;
				}
				
			}
			
		if(queue.get(parentindex) < queue.get(left) || queue.get(parentindex) < queue.get(right) )
		{
			
			if(queue.get(left) > queue.get(right))
			{
				
				int swap=queue.get(parentindex);
				queue.set(parentindex, queue.get(left));
				queue.set(left, swap);
				
				parentindex=left;
				left=(2*parentindex)+1;
				right=(2*parentindex)+2;
				
				
			
			
			}
			else if(queue.get(left) < queue.get(right))
			{
				
				int swap=queue.get(parentindex);
				queue.set(parentindex, queue.get(right));
				queue.set(right, swap);
				
				 parentindex=right;
				 left=(2*parentindex)+1;
				 right=(2*parentindex)+2;
			
			}
			
			
			
			
			
			
		}
		
		}
		return max;
		
	}

}
