package PriorityQueue;
import java.util.PriorityQueue;
public class KSortedArraySorting {

	
	public static void sorting(int[] arr,int k)
	{
		
		PriorityQueue<Integer> queue=new PriorityQueue<>();
		int i=0;
		for( ; i<k;i++)
		{
			queue.add(arr[i]);
			
		}
		
		for( ; i<arr.length;i++)
		{
		   arr[i-k]=queue.remove();
		   queue.add(arr[i]);
	
		}
		 
		for(int j=i-k ;j<arr.length ; j++)
		{
			arr[j]=queue.remove();
		}
		
		
	}
	
	public static void main(String[] args) 
	{
		int k=3;
		int arr[]={2,4,1,9,4,8,23,5,78,10
				};
		sorting(arr, k);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		

	}

}
