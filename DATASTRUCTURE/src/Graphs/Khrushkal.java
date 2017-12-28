package Graphs;
import java.util.*;
public class Khrushkal 
{

	public static boolean checkcycle(Krushal_Edgeclass current,int arr[])
	{
		
		int start=current.Start;
		int end=current.End;
		
		int pstart=getparent(arr,start);
		int pend =getparent(arr,end);	
		
		System.out.println("AAAa "+ pstart+"  "+pend);
		arr[pstart]= pend;
		if(pend == pstart)
			return true;
		
		return false;
		
		
	}
	public static int getparent(int arr[],int no)
	{
		if(arr[no] == no)
		{
			return no;
		}
		int x= getparent(arr,arr[no]);
		return x;
	}
	
	public static void main(String[] args) 
	{
		
		//Union find Algo for cycylic check is EV
		//sorting ElogE
		// therefore total is sum 
		
		/*
		 * but we can import union-check
		 * by using union rank & path compression
		 * whose complecity is Elogv
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Vertices");
		int V=sc.nextInt();

		System.out.println("Enter No of Edges");
		int E=sc.nextInt();
	
		Krushal_Edgeclass edges[]=new Krushal_Edgeclass[E];
		Krushal_Edgeclass MST[]=new Krushal_Edgeclass[V-1];
			
		for(int i=0;i<E;i++)
		{
			int s=sc.nextInt();
			int e=sc.nextInt();
			int w=sc.nextInt();
			
			Krushal_Edgeclass obj=new Krushal_Edgeclass(s,e,w);
			edges[i]=obj;
		}
		
		//Step One Completed
		
		Mincompa minedgescom=new Mincompa();
		Arrays.sort(edges,minedgescom);
		
		
	
		
		//Step two Completed
		int count=0;
		int parentarray[]=new int[V];
		for(int i=0;i<V;i++)
		{
			parentarray[i]=i;
		}
		
		int index=0;
		
			for(int i=0;i<edges.length;i++)
			{
		        Krushal_Edgeclass current= edges[i];
		        boolean iscycle =checkcycle(current,parentarray);
				
		       if(iscycle == false)
				{
		    	   //System.out.println(current.Weight);
		    	  // System.out.println("index "+index +"count"+count);
		    	   if(count == V-1)
		    	   {
		    		   break;
		    	   }
					MST[index++]=current;
					count++;
				}
				
				
			}
			
			
			
			
		

		
		System.out.println("Final MST IS");
		for(int i=0;i<MST.length;i++)
		{
			
			System.out.println(MST[i].Start+"  "+MST[i].End+" "+MST[i].Weight);
			
		}
		
		
		
	
	}

}
