package Graphs;
import java.util.*;
public class Dijkastra {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//	System.out.println("enter no of vertices");
			int V=sc.nextInt();
		//	System.out.println("enter no of edges");
			int E=sc.nextInt();
			
			
			int arr[][]=new int[V][V];
			for(int i=1;i<=E;i++)
			{
				int s=sc.nextInt();
				int e=sc.nextInt();
				int wei=sc.nextInt();

				arr[s][e]=wei;
				arr[e][s]=wei;		
			}
			
//			for(int i=0;i<V;i++)
//			{
//				for(int j=0;j<V;j++)
//				{
//					System.out.print(arr[i][j]+" ");
//				}
//				System.out.println();
//			}
			
			boolean visited[]=new boolean[V];
			int distance[]=new int[V];
			for(int i=1;i<V;i++)
			{
				distance[i]=Integer.MAX_VALUE;
			}
			
			//start
			while(true)
			{
			int current=getnonvistedMinveter(visited,distance);
			//System.out.println("current = "+current);
			if(current == -1 || current >= V)
			{
				break;
			}
			visited[current]=true;
			for(int i=0;i<V;i++)
			{
				if(arr[current][i]!=0 && !visited[i])
				{
					if(distance[i] > arr[current][i]+distance[current])
					{
						distance[i]=distance[current]+arr[current][i];
						//System.out.println(i+" = "+distance[current]+" + "+arr[current][i]);
					}
					
				}
				
			}
			///
			}	
			
			
			
			for(int i=0;i<distance.length;i++)
			{
				System.out.println(i+" "+distance[i]);
			}
		}
		public static int getnonvistedMinveter(boolean visited[],int distance[])
		{
			int min=-1;
			int minval=Integer.MAX_VALUE;
			for(int i=0;i<visited.length;i++)
			{
				if(!visited[i])
				{
					if(distance[i] < minval)
					{
					min=i;
					minval=distance[i];
						
					}
				}
			}
			
			return min;
			
		}

	}