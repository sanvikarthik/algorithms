package warshall;

import java.util.Scanner;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0;
		int k=0;
		int j=0;
		System.out.println("Enter the number of vertices");
		int n = sc.nextInt();
		int[][] cAM = new int[n+1][n+1];
		System.out.println("Enter the boolean matrix");
		for(i=1;i<=n;i++)
		{
		    for(j=1;j<=n;j++)
		    {
		        cAM[i][j] = sc.nextInt();
		    }
		}
		for(k=1;k<=n;k++)
		{
		    for(i=1;i<=n;i++)
		    {
		        for(j=1;j<=n;j++)
		        {
		            cAM[i][j] = (cAM[i][j]|(cAM[i][k]&cAM[k][j]));
		        }
		    }
		}
		System.out.println("The path matrix is:");
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print(cAM[i][j]+"\t");
            }
           System.out.print("\n");
        }
		
	}
}
