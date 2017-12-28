package Maps;

import java.util.HashMap;
import java.util.Set;

public class Maxfrequencyno {

	public static int maxFrequencyNumber(int[] arr)
	{
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			
			if(map.containsKey((Integer)arr[i]))
			{
				int x = map.get(arr[i]);
				map.put(arr[i], x+1);
				
			}
			else{
				map.put(arr[i], 1);
			}
				
		}
		
		int max=Integer.MIN_VALUE;
		int ans=0;
		Set<Integer> set=map.keySet();
		for(Integer key :set)
		{
			System.out.println(map.get(key));
			if(map.get(key) > max)
			{
				max=map.get(key);
				ans=key;
			}
			
		}
		return ans;
		
	}
	public static void main(String[] args) 
	{
		int arr[]={1,2,1,3,2,3,2};
		
		System.out.println("ans = "+maxFrequencyNumber(arr));
		
		
	

	}

}
