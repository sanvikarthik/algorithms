
//7. From a given vertex in a weighted connected graph, find shortest paths to other vertices using Dijkstra's algorithm. Write the program in Java.

import java.util.*;

public class dijkstra 
{
	static int infinity = 999;
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		// read the number of vertices 
		System.out.println("Enter the number of vertices");
		int n = scan.nextInt();
		int adj[][] = new int[n + 1][n + 1];
		// read the adjacency matrix
		System.out.println("Enter the adjacency matrix(Let 999 represent the value infinity)");
		for(int i = 1; i <= n; i++)
			for(int j = 1; j <= n; j++)
				adj[i][j] = scan.nextInt();
		// read the source vertex
		System.out.println("Enter the source vertex");
		int src = scan.nextInt();
		int dist[] = new int[n + 1];
		dijkstra_algo(n, adj, src, dist);
		display(src, n, dist);
	}
	
	static void display(int src, int n, int dist[])
	{
		System.out.println("The shortest path from "+src+" to all other vertices is:");
		for(int i = 1; i <= n; i++)
System.out.println("Shortest distance from "+src+" to "+(i)+" is "+dist[i]);
		return;
	}
	
	static void dijkstra_algo(int n, int adj[][], int src, int dist[])
	{
		int visited[] = new int[n + 1];
		int min_dist, unvis = 0;
		// initialization steps 
		for(int i = 1; i <= n; i++)
		{
			dist[i] = adj[src][i];
			visited[i] = 0;
		}
		// make source vertex as visited one 
		visited[src] = 1;
		for(int i = 2; i <= n; i++)
		{
			min_dist = infinity;
			for(int j = 1; j <= n; j++)
			{
				if(visited[j] == 0)
				{
					if(dist[j] < min_dist)
					{
						min_dist = dist[j];
						unvis = j;
					}
				}
			}
			visited[unvis] = 1;
			for(int v = 1; v <= n; v++)
			{
				if(visited[v] == 0)
				{
					if((dist[unvis] + adj[unvis][v]) < dist[v])
						dist[v] = dist[unvis] + adj[unvis][v];
				}
			}
		}
		return;
	}
}

/* SAMPLE OUTPUT
Enter the number of vertices
5
Enter the adjacency matrix(Let 999 represent the value infinity)
0 3 999 7 999
3 0 4 2 999
999 4 0 5 6
7 2 5 0 4
999 999 6 4 0
Enter the source vertex
1
The shortest path from 1 to all other vertices is:
Shortest distance from 1 to 1 is 0
Shortest distance from 1 to 2 is 3
Shortest distance from 1 to 3 is 7
Shortest distance from 1 to 4 is 5
Shortest distance from 1 to 5 is 9 
*/
