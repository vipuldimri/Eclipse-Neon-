package Graphs;
import java.util.*;
public class IsLand 
{
	  public static int solve(int n,int m,int U[],int V[]) 
	  {
			int arr[][]=new int[n][n];
			for(int i=1;i<=m;i++)
			{
				
				arr[U[i-1]-1][V[i-1]-1] = 1;
				arr[V[i-1]-1][U[i-1]-1] = 1;
			}
			
			
			return print(arr);
			
			
	  }
		public static void printhelper
		(int[][] edges,int sv,boolean[] visited)
		{
			//System.out.println(sv);
			visited[sv]=true;
			int n=edges.length;
			for(int i=0;i<n;i++)
			{
				if(edges[sv][i]==1 && !visited[i])
				{
					printhelper(edges,i,visited);
				}
				
				
			}
			
		}
		public static int print(int[][] edges)
	    {
			int count=0;
			boolean[] visited=new boolean[edges.length];
			
			for(int i=0;i<visited.length;i++)
			{
				if(!visited[i])
				{
			    printhelper(edges,i,visited);
				count++;
				}
			}

			return count;
		 }

	public static void main(String[] args)
	{
		System.out.println("we have to find island components");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of island");
		int N=sc.nextInt();
		
		int M=sc.nextInt();
		int u[]=new int[M];
		for(int i=0;i<u.length;i++)
		{
			u[i]=sc.nextInt();
		}
		int v[]=new int[M];
		for(int i=0;i<u.length;i++)
		{
			v[i]=sc.nextInt();
		}
		
		System.out.println(solve(N,M,u,v));
	}

}
