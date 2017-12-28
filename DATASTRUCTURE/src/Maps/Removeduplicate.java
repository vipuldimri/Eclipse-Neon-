package Maps;

import java.util.ArrayList;
import java.util.HashMap;

public class Removeduplicate {

	public static ArrayList<Integer> remove(int arr[])
	{
		ArrayList<Integer> ans=new ArrayList<>();
		HashMap<Integer, Boolean> map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				continue;
			}
			map.put(arr[i], true);
			ans.add(arr[i]);
			
		}
		return ans;
		
	}
	public static void main(String[] args) 
	{
		int arr[]={1,1,2,23,4,3,12,1,3,4233,12,3,23};
		ArrayList<Integer> ans=remove(arr);
		for(int i=0;i<ans.size();i++)
		{
			System.out.println(ans.get(i));
		}

	}

}
