package Maps;
import java.util.*;
public class RemoveDuplicateStriing 
{

	
	public static String uniqueChar(String str)
    {
		HashMap<Character, Integer> map=new HashMap<>();
		for(int i=0;i<str.length();i++)
		{
			
			
			
			if(map.containsKey(str.charAt(i)))
			{
					
				int x=map.get(str.charAt(i));
				map.put(str.charAt(i), x+1);
					continue;
			}
			
			map.put(str.charAt(i), 1);
			
		}
		
		String s="";
		Set<Character> m=map.keySet();
		for(Character c: m)
		{
			System.out.println(c);
			s=s+c;
		}
      
      
return s;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str="cbngsgacvbkluioiutyufcnb";
          System.out.println(uniqueChar(str));
	}

}
