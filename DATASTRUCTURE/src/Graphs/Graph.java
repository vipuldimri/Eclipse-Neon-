package Graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Graph {

	public static void printhelper
	(int[][] edges,int sv,boolean[] visited)
	{
		System.out.println(sv);
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
	public static void print(int[][] edges)
    {
		//DFS traversal
		boolean[] visited=new boolean[edges.length];
		
		for(int i=0;i<visited.length;i++)
		{
			if(!visited[i])
		    printhelper(edges,i,visited);
		}

		
	}
	
	public static void printBFS(int[][] matrix)
	{
		
		//similar to lvl order of tree
		boolean[] visited=new boolean[matrix.length];
		Queue<Integer> queue=new LinkedList<>();

		
		for(int i=0;i<visited.length;i++)
		{
			if(!visited[i])
			{
			printBSFhelper(matrix,i,visited,queue);
			}
		}
		
		
	}
	public static void printBSFhelper
	(int[][] matrix,int sv,boolean[] visited,Queue<Integer> queue)
	{
		
		queue.add(sv);
		visited[sv]=true;
		
		while(!queue.isEmpty())
		{
			int first=queue.remove();
			System.out.print(first+" ");
			
			for(int i=0;i<matrix.length;i++)
			{
				if(matrix[first][i]==1 && !visited[i])
				{
					queue.add(i);
					visited[i]=true;

					
				}
				
			}
			
			
		}
		
	}
	
	public static boolean haspath(int[][] matrix,int si,int ei)
	{
		boolean[] visited=new boolean[matrix.length];

		return haspathhelper(matrix,si,ei,visited);
	}
	public static boolean haspathhelper(int[][] matrix,int si,int ei,boolean[] visited)
	{
	
		visited[si]=true;
		if(si == ei)
		{
			return true;
		}
		
		boolean smallans=false;
		for(int i=0;i<matrix.length;i++)
		{
			if(matrix[si][i] ==1 && !visited[i])
			{
			smallans=haspathhelper(matrix,i,ei,visited);
			if(smallans==true)
			{
				return true;
	
			}
			
			}
			
			
		}
		
		
		return false;
		
	}
	

	public static ArrayList<Integer> getpathDFS(int[][] matrix,int si,int ei)
	{
		boolean[] visited=new boolean[matrix.length];

		return getpathDFSHelper(matrix,si,ei,visited);
	}
	public static ArrayList<Integer> getpathDFSHelper(int[][] matrix,int si,int ei,boolean[] visited)
	{
		
		visited[si]=true;
		if(si==ei)
		{
			ArrayList<Integer> al=new ArrayList<>();
			al.add(ei);
					
			return al;
		}
		ArrayList<Integer> smalans=null;
		for(int i=0;i<matrix.length;i++)
		{
			if(matrix[si][i]==1 && !visited[i])
			{

			smalans=getpathDFSHelper(matrix,i,ei,visited);
			if(smalans!=null)
			{
				smalans.add(si);
				break;
			}
			}
		}
		
		return smalans;
		
	}
	
    public static void  getpathBSF(int[][] matrix,int si,int ei)
    {
    	Queue<Integer> queue=new LinkedList<>();
    	boolean visited[]=new boolean[matrix.length];
        HashMap<Integer, Integer> path=getpathBSFhelper(matrix,si,ei,queue,visited);
    	if(path==null)
    	{
    		System.out.println("no path exits");
    	}else
    	{
    		
    		Set<Integer> s=path.keySet();
    		for(Integer k:s)
    		{
    			
    			if(k==ei)
    			{
    				while(true)
    				{
    				System.out.print(k+" ");
    				k = path.get(k);
    				if(k==si)
    				{
    					System.out.print(k);
    					break;
    				}

    				}
    			}
    			
    		}
    		
    	}
    	
    	
    }
    public static HashMap<Integer, Integer> 
    getpathBSFhelper
    (int[][] matrix,int si,int ei,
    		Queue<Integer> queue,boolean[] visited)
    {
    	HashMap<Integer, Integer> map=new HashMap<>();
    	queue.add(si);
    	visited[si]=true;
    	
    	while(!queue.isEmpty())
    	{
    		int front=queue.remove();
    	
    		if(front == ei)
    		{
    			System.out.println("Size is "+ map.size());
    			return map;
    		}
    		for(int i=0;i<matrix.length;i++)
    		{
    			if(matrix[front][i] == 1 && !visited[i])
    			{
    				map.put(i, front);
    				queue.add(i);
    				visited[i]=true;
    				
    				
    			}
    			
    		}
    		
    		
    		
    		
    	}
    
    	
    return null;	
    }
	
	
	public static ArrayList<ArrayList<Integer>> allconnectedComponents(int[][] matrix)
	{
		ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
		boolean[] visited=new boolean[matrix.length];
		for(int i=0;i<matrix.length;i++)
		{
			if(!visited[i])
			{
	    ArrayList<Integer> a=new ArrayList<>();
		ArrayList<Integer> smallans=allconnectedComponentshelper(a,matrix,i,visited);
			ans.add(smallans);
			}			
			
		}
		
		return ans;
		
	}
	public static ArrayList<Integer> allconnectedComponentshelper
	(ArrayList<Integer> a,int[][] matrix,int si,boolean[] visited)
	{
	 	//System.out.print(si+" ");
		a.add(si);
		visited[si]=true;
		for(int i=0;i<matrix.length;i++)
		{
			if(matrix[si][i] ==1 && !visited[i])
			{
			allconnectedComponentshelper(a,matrix,i,visited);
		
			}
		}
		
		
		
		
		return a;
	}
	
	
	
	
	
	
	public static void main(String[] args) 
	{

		
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no vertices");
		int v=sc.nextInt();
		System.out.println("enter no of edges");
		int e=sc.nextInt();
		
		int[][] edges=new int[v][v];
		for(int i=0;i<e;i++)
		{
			int fv=sc.nextInt();
			int sv=sc.nextInt();
			
			edges[fv][sv]=1;
			edges[sv][fv]=1;
		}
		
		//print(edges);

		
		//printBFS(edges);
		
		
		//System.out.println(haspath(edges, 8, 6));
		
		ArrayList<Integer> path=getpathDFS(edges, 0, 6);

		if(path==null)
		{
			System.out.println("No path exists");
		}
		else{		for(Integer k:path)
		{
			System.out.print(k+" ");
		}
		}
		
		//getpathBSF(edges,1,3);
		
//		ArrayList<ArrayList<Integer>> ans=allconnectedComponents(edges);
//	    for(ArrayList<Integer> k:ans)
//	    {
//	    	
//	        Collections.sort(k);
//	    	for(Integer kk: k)
//	    	{
//	    		
//	    		System.out.print(kk+" ");
//	    		
//	    	}
//	    	System.out.println();
//	    	
//	    }
	
	
	}

	
}
