package selection_sort;
import java.util.*;
public class Ssssss {

	public static void main(String[] args) {
		int i,n,low,high;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements");
		n=sc.nextInt();
		int[] A=new int[n];
		System.out.println("Enter array elements");
		for(i=0;i<n;i++) {
			A[i]=sc.nextInt();
		}
		Sort(A,n);
		System.out.println("The sorted array is");
		for(i=0;i<n;i++) {
			System.out.println(""+A[i]);
		}
	}
	public static void Sort(int[] A,int n)
	{
		int i,min,j;
		for(i=0;i<n-1;i++)
		{
			min=i;
			for(j=i+1;j<n;j++)
			{
				if(A[j]<A[min])
				{
					min=j;
				}
			}
			if(min!=i)
			{
				Swap(A,min,i);
			}
		}
	}
	public static void Swap(int[] A,int i,int j)
	{
		int temp;
		temp=A[i];
		A[i]=A[j];
		A[j]=temp;
	}

}
