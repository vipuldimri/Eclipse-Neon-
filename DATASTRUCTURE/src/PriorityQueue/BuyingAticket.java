package PriorityQueue;
import java.util.*;
public class BuyingAticket {

	public static int buyTicket(int input[], int k)
	{
	int time=0;
	int k2=k+1;
	Queue<Integer> Line=new LinkedList<>();
	PriorityQueue<Integer> heap=new PriorityQueue<>(Collections.reverseOrder());
	for(int i=0;i<input.length;i++)
	{
		Line.add(input[i]);
		heap.add(input[i]);
		
	}
		
		
	while(true)
	{
		int first=Line.remove();
		int higest=heap.remove();
		if(first == higest)
		{
			time=time+1;
			if(k2==1)
			{
				return time;
			}else{
				k2=k2-1;
			}
		}
		else
		{
			Line.add(first);
			heap.add(higest);
			if(k2==1)
			{
				k2=Line.size();
				
			}else{
				k2=k2-1;
			}
			
		}
	
	}	
		
	
	}
	public static void main(String[] args) 
	{
		
		int arr[]={2,3,2,2,4};
		int k=3;
	int time=buyTicket(arr, k);
		System.out.println("time = "+time);
	}

}
 