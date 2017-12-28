package PriorityQueue;
import java.util.*;
public class KlargestElemets {

	
	public static ArrayList<Integer> 
	kLargest(int input[], int k)
	{
	
		PriorityQueue<Integer> queue=new PriorityQueue<>();
		ArrayList<Integer> ans=new ArrayList<>();
		int i=0;
		for( ; i<k ;i++)
		{
			queue.add(input[i]);
		}
		
		for( ; i <input.length;i++)
		{
			int min= queue.remove();
			if(input[i] > min)
			{
				queue.add(input[i]);
				
			}else{
				queue.add(min);
			}
			
			
		}
		
		for(int q=0;q<k;q++)
		{
			ans.add(queue.remove());
			
		}
		
		
		
		
		return ans;
		
	}
	public static void main(String[] args) 
	{	
		int arr[]={2 ,12, 9 ,16 ,10 ,5 ,3 ,20 ,25 ,11 ,1 ,8 ,6};
		int k=4;
		ArrayList<Integer> ans=kLargest(arr, k);
		for(Integer k1: ans)
		{
			System.out.println(k1);
		}
	
	}

}
