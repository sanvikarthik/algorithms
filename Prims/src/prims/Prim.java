package prims;
import java.util.*;

public class Prim {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j,k;
		System.out.println("Enter number of vertices");
		n=sc.nextInt();
		int[][] cA=new int[n][n];
		int[] visited=new int[n];
		int[] unvisited=new int[n];
		System.out.println("Enter cost adjacency matrix");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				cA[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter source vertex");
		int sv=sc.nextInt();
		visited[sv-1]=1;
		for(i=0;i<n;i++) {
			if(i!=(sv-1)) {
				unvisited[i]=1;
			}
		}
		int index,source,mincost;
		index=source=mincost=0;
		System.out.println("Edge set:");
		for(i=1;i<n;i++)
		{
			int min=9999;
			for(j=0;j<n;j++)
			{
				if(visited[j]==1)
				{
					for(k=0;k<n;k++)
					{
						if(unvisited[k]==1 && cA[j][k]!=9999)
						{
							if(min>cA[j][k])
							{
							min=cA[j][k];
							source=j;
							index=k;
							}
						}
					}
				}
			}
			visited[index]=1;
			unvisited[index]=0;
			System.out.println("("+(source+1)+","+(index+1)+")");
			mincost+=min;
		}
		System.out.println("\nThe minimum cost of the spanning tree = " + mincost);
	}
}
