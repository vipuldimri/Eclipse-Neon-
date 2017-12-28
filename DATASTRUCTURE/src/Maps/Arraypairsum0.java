package Maps;
import java.util.*;
public class Arraypairsum0 
{

	public static void PairSum(int[] input, int size) 
    {
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<size;i++)
		{
			map.put(input[i], input[i]);
		}
		
	
		
		for(int i=0;i<size;i++)
		{
				int x=map.get(input[i]);
				for(int ii=0;ii<size;ii++)
				{

					if(x==map.get(input[ii]))
					{
						continue;
					}
						if(x +map.get(input[ii])==0 || x -map.get(input[ii])==0)
						{
							System.out.println(x + " "+ map.get(input[ii]));
						}
					
				}
				
		
		
		}
		
		
		
		
		
		
	}
	public static void main(String[] args) 
	{

		int arr[]={2,1,-2,2,3};
		PairSum(arr,arr.length);
	}

}
