package ArrayList;

import java.net.Socket;
import java.util.ArrayList;

public class First 
{

	public static void main(String[] args) 
	{

		//default capacity is 10
		//and if fill new will be 1.5 times
		
		
		ArrayList<Integer> list1 =new ArrayList<>();//default capacity 10
		ArrayList<Integer> list2 =new ArrayList<>(5);//capacity is 0
		
		//no default values are given
		//if we print we get error not default valuer
		
		System.out.println("default size of list1 "+list1.size());
		System.out.println("default size of list2 "+list2.size());

		//add at the end of the list
		list1.add(10);
        list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list1.add(60);
		System.out.println("size list 1 after add "+list1.size());


		
		int as=list1.get(1);
		System.out.println(as);
		for(int k:list1)
		{
			System.out.println(k);
		}
		
		System.out.println("**********");
		System.out.println(list1.get(0));
		list1.add(0, 199);// all will shift to right
		list1.remove(0);//remove at index and all shift left
		list1.set(4, 99);//replace element witrh index 4
		for(int k:list1)
		{
			System.out.println(k);
		}
		
		
		
//		System.out.println("list 2");
//		for(int k:list2)
//		{
//			System.out.println(k);
//		}
 	}

}
