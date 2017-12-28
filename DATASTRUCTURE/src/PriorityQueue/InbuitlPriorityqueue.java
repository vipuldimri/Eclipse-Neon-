package PriorityQueue;

import java.util.*;

class MinComparator implements Comparator<Integer>
{
	public int compare(Integer o1,Integer o2)
	{
		if(o1 < o2)
		{
			return -1;
		}else if(o1 > o2)
		{
			return 1;
		}
		
		
		return 0;
	}
	
}

class MaxComparator implements Comparator<Integer>
{
	public int compare(Integer o1,Integer o2)
	{
		if(o1 < o2)
		{
			return 1;
		}else if(o1 > o2)
		{
			return -1;
		}
		
		
		return 0;
	}
	
}

class MinStringlenght implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2)
	{
		if(o1.length() < o2.length())
		{
			return -1;
		}else if(o1.length() > o2.length())
		{
			return 1;
		}
		
		else{
		return 0;
		}
	}
	
	
	
}
class MaxStringlenght implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2)
	{
		if(o1.length() < o2.length())
		{
			return 1;
		}else if(o1.length() > o2.length())
		{
			return -1;
		}
		
		else{
		return 0;
		}
	}
	
	
	
}
public class InbuitlPriorityqueue {

	public static void main(String[] args) 
	{
//		
//		MinComparator min=new MinComparator();
//		MaxComparator max=new MaxComparator();
//		PriorityQueue<Integer> qmin=new PriorityQueue<>(min);
//		PriorityQueue<Integer> qmax1=new PriorityQueue<>(max);
//		// max without Comparator
//		PriorityQueue<Integer> qmax2=new 
//				PriorityQueue<>(Collections.reverseOrder());
//		
//		for(int i=0;i< 10;i++)
//		{
//			qmax2.add(i);
//		}
//		
//		for(int i=0;i< 10;i++)
//		{
//			System.out.println(qmax2.remove()+" ");
//		}
		
		//For Strings
		String[] arr={"this","Vipul","v","elephant"};
		
		MinStringlenght mins=new MinStringlenght();
		PriorityQueue<String> qminstring=new PriorityQueue<>(mins);
		
		MaxStringlenght maxs=new MaxStringlenght();
		PriorityQueue<String> qmaxstring=new PriorityQueue<>(maxs);
		
		for(int i=0;i<arr.length;i++)
		{
			qmaxstring.add(arr[i]);
			qminstring.add(arr[i]);
			
		}
		System.out.println("min stringlenght queue");
		while(!qminstring.isEmpty())
		{
			System.out.print(qminstring.remove()+" ");
		}
		System.out.println();
		System.out.println("max stringlenght queue");
		while(!qmaxstring.isEmpty())
		{
			System.out.print(qmaxstring.remove()+" ");
		}

	}

}
