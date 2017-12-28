package PriorityQueue;
import java.util.*;
public class KSortedArrays {

	public static ArrayList<Integer>
	mergeKSortedArrays(ArrayList<ArrayList<Integer>> input) 
    {
      PriorityQueue<Integer> queue=new PriorityQueue<>();
      int size=input.size();
      for(int i=0;i<size;i++)
      {
    	  
    	  ArrayList<Integer> current=input.get(i);
    	  for(Integer k:current )
    	  {
    		  queue.add(k);
    	  }
    	  
    	  
    	  
      }
		ArrayList<Integer> ans=new ArrayList<>();
      while(!queue.isEmpty())
      {
    	  ans.add(queue.remove());
      }
      return ans;
		
	}
	public static void main(String[] args)
	{
	
		ArrayList<Integer> arr1=new ArrayList<>();
		ArrayList<Integer> arr2=new ArrayList<>();
			
		arr1.add(1);
		arr1.add(5);
		arr1.add(9);
		arr2.add(8);
		arr2.add(10);
		arr2.add(45);
		arr2.add(90);
		
		
		
		ArrayList<ArrayList<Integer>> argu=new ArrayList<>();
		argu.add(arr1);
		argu.add(arr2);
		mergeKSortedArrays(argu);
		
		
	}

}
