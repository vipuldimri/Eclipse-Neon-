package Heap;
import java.util.*;
public class main {

	public static void main(String[] args) 
	{

		
		
		
		PriorityQueue queue=new PriorityQueue();
		queue.insert(4);
		queue.insert(10);
		queue.insert(5);
		queue.insert(15);
		queue.insert(20);
		queue.insert(35);
		queue.insert(8);
		
		for(Integer k:queue.heap)
		{
			System.out.print(k+" ");
		}
		System.out.println();
		System.out.println("remove "+queue.remove());
		
		for(Integer k:queue.heap)
		{
			System.out.print(k+" ");
		}
		
		System.out.println();
		System.out.println("remove "+queue.remove());
		
		for(Integer k:queue.heap)
		{
			System.out.print(k+" ");
		}
		
		

	}

}
