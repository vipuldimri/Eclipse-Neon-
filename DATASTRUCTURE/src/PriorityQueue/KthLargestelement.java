package PriorityQueue;
import java.util.*;
public class KthLargestelement 
{

	
	public static int kthLargest(int arr[], int k) 
	{
		PriorityQueue<Integer> queue=new PriorityQueue<>();
		int i=0;
		for(; i<k;i++)
		{
			queue.add(arr[i]);
		}
		for(; i<arr.length;i++)
		{
			int min=queue.remove();
			if( arr[i] > min)
			{
				queue.add(arr[i]);
			}else{
				queue.add(min);
			}
		}
		
		
		return queue.remove();
		
		
		
		
	}
	public static void main(String[] args)
	{
		int arr[]={6,4,8,7,11,3};
		int k=2;
	
		System.out.println(kthLargest(arr,2));

	}

}
