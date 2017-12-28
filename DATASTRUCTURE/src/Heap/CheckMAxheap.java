package Heap;
import java.util.*;
public class CheckMAxheap {
	public static boolean checkMaxHeap(int arr[]) 
    {
      
      Queue<Integer> queue=new LinkedList<>();
    
      queue.add(0);
      
      
      while(!queue.isEmpty())
      {
       int par=queue.remove(); 
       int childL=(2*par)+1;
       int childR=(2*par)+2;
     
       if(childL < arr.length)
       {
    	   
         if(arr[par] < arr[childL])
           return false;
          queue.add(childL);
       }
        
       if(childR < arr.length)
       {
         
         if(arr[par] < arr[childR])
           return false;
            queue.add(childR);
       }
      
      
      
      }
      
      
		return true;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
int arr[]={94032 ,91513, 83822 ,86096 ,77055, 65181, 59534, 63999 ,84904, 35945, 21525, 44579, 45064 ,36554, 51655, 9737, 548, 53228 ,26519 ,17196 
 };
		System.out.println(checkMaxHeap(arr));
	}

}
