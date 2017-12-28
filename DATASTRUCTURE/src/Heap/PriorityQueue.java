package Heap;
import java.util.*;
public class PriorityQueue 
{
	
	 ArrayList<Integer> heap;
	PriorityQueue()
	{
		heap=new ArrayList<>();
	}

	void  insert(int data)//up=heapify
	{
		
		heap.add(data);
		int childindex=heap.size()-1;
		int index=(childindex-1)/2; //parent index
		
		
		while( childindex >0)
		{
		if(heap.get(index) > data)
		{
			int swap=heap.get(childindex);
			heap.set(childindex, heap.get(index));
			heap.set(index, swap);
			
			childindex=index;
			 index=(childindex-1)/2;
			
		}
		else{   //if no need for up-heapify 
			return ;
		    }
		}
		
		
		
	}
	int remove()
	{
		int min=heap.get(0);
		int last=heap.size()-1;
		int lastelement=heap.get(last);
		heap.remove(last);
		heap.set(0, lastelement);
		
		int parent=0;
		int left=(2*parent)+1;
		int right=(2*parent)+2;
		
		
		while(left < heap.size())
		{
			if(right >=heap.size())
			{
			int swap=heap.get(parent);
			heap.set(parent, heap.get(left));
			heap.set(left, swap);
			return min;
			
				
			}
        if(heap.get(parent) > heap.get(left) ||heap.get(parent) > heap.get(right) )
		{
			
			
        	if(heap.get(left) < heap.get(right))
			{

				int swap=heap.get(parent);
				heap.set(parent, heap.get(left));
				heap.set(left, swap);
				
				parent=left;
				left=(2*parent)+1;
				right=(2*parent)+2;
			

				
			}
			else if(heap.get(right) < heap.get(left))
			{

				int swap=heap.get(parent);
				heap.set(parent, heap.get(right));
				heap.set(right, swap);
				parent=right;
				left=(2*parent)+1;
				right=(2*parent)+2;

			}
			
			
			
		}
		}
		
		return min;
	}
	
	
	boolean isEmpty()
	{
		return heap.size()==0;
	}
	int size()
	{
		return heap.size();
	}
	
	int getmin()throws HeapEmptyException
	{
		if(heap.isEmpty())
		{
			throw new HeapEmptyException();
		}
		return heap.get(0);
	}
	

}
