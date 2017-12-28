package Maps;

import java.util.HashMap;
import java.util.Set;

public class Mapuse {

	public static void main(String[] args) 
	{
		
		//in array indext is of int fixed here not
		//hashmap uses hash table all opertion are 
		//O(1) except value vale direct O(n)
		//hash tree used bst and has logn complexity 
		//if we use linklist then O(n) complexity
		//key is unique to duplicate
		// TODO Auto-generated method stub
		HashMap<String, Integer> map=new HashMap<>();
		//insert
		map.put("abc",1);
		map.put("wer", 23);
		map.put("abcd",1);

		map.put("werd", 23);
		map.put("werd", 203);
		//above we are just updating data
		
		 System.out.println(map.size());
		
		if(map.containsKey("abc"))
		{
			System.out.println("yes");
		}
		
		
		int x=map.get("wer");//return null is not present 
		System.out.println(x);
		
		
		int delval=map.remove("abc");//retun value
		System.out.println(delval);
		
		
		
		map.containsValue(23);
		map.remove("abc");
		
		//traversal
		Set<String> keys= map.keySet();//return all the keys
		for(String str:keys)
		{
			System.out.println(str);
		}
		//we also have function keyvalue
		
		

	}

}
