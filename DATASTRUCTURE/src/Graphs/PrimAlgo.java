package Graphs;
import java.util.*;
public class PrimAlgo {

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of vertices");
		int V=sc.nextInt();
		System.out.println("enter no of vertices");
		int E=sc.nextInt();
		
		int arr[][]=new int[V][V];
		for(int i=1;i<=E;i++)
		{
			int s=sc.nextInt();
			int e=sc.nextInt();
			int weight=sc.nextInt();
			
			arr[s][e]=weight;
			arr[e][s]=weight;
		}
		
		boolean visited[]=new boolean[V];
		int weight[]=new int[V];
		for(int i=1;i<weight.length;i++)
		{
			weight[i]=Integer.MAX_VALUE;
		}
		
		int parent[]=new int[V];
		parent[0]=-1;
		
		////////////
		for(int r=1;r<=V;r++)
		{
		int minweightV = Integer.MAX_VALUE;
		int vv=-1;
		for(int i=0;i<V;i++)
		{
			if(!visited[i] )
			{
				if(weight[i] < minweightV)
				{
					minweightV=weight[i];
					vv=i;
				}
			}
			
			
		}
		
		visited[vv]=true;
		
		//System.out.println(vv);
		for(int l=0;l<V;l++)
		{
			if(!visited[l] && arr[vv][l]!=0)
			{
				int wei=arr[vv][l];
				if(weight[l] > wei)
				{
					weight[l]=wei;
					parent[l]=vv;
				}
				
			}
			
		}
		
		/////
		}
		
		
		
		for(int i=0;i<weight.length;i++)
		{
			System.out.print(weight[i]+" ");
		}
		for(int i=0;i<parent.length;i++)
		{
			System.out.print(parent[i]+" ");
		}
		
		for(int i=0;i<V;i++)
		{
		
			if(i > parent[i])
			{
				System.out.println( parent[i]+" "+i+" "+weight[i]);
			}else{
				System.out.println( i+" "+parent[i]+" "+weight[i]);

			}
			
		}
	}

}
