package Maps;
import java.util.*;
public class Intersection {

	public static void intersection(int[] arr1, int[] arr2)
	{
		HashMap<Integer, Integer>map=new HashMap<>();
		
		for(int i=0;i<arr1.length;i++)
		{
			
			if(map.containsKey(arr1[i]))
			{
				int x = map.get(arr1[i]);
				map.put(arr1[i], x+1);	
			}else{
			map.put(arr1[i], 1);
			}
			
		}
	
		
		for(int i=0;i<arr2.length;i++)
		{
			if(map.containsKey(arr2[i]))
			{
				
				int x = map.get(arr2[i]);
				if(x==0)
				{
					continue;
				}
				map.put(arr2[i], x-1);	
				
				System.out.println(arr2[i]);
			
				
				
			}
			
		}
		
		

	

	}
	public static void main(String[] args) 
	{
	
		int arr1[]={2,6,1,2};
		int arr2[]={1,2,3,4,2};
		
		intersection(arr1,arr2);
		
		
	}

}
