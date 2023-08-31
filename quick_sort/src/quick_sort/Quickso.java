package quick_sort;
import java.util.*;
public class Quickso {
	public static void main(String args[])
	{
		int i,n,low,high;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements");
		n=sc.nextInt();
		int[] A=new int[n];
		System.out.println("Enter array elements");
		for(i=0;i<n;i++) {
			A[i]=sc.nextInt();
		}
		low=0;
		high=n-1;
		Quick_sort(A,low,high);
		System.out.println("The sorted array is");
		for(i=0;i<n;i++) {
			System.out.println(""+A[i]);
		}
	}
	public static void Quick_sort(int[] A,int low, int high)
	{
		int j;
		if(low<high)
		{
			j=Partition(A,low,high);
			Quick_sort(A,low,j-1);
			Quick_sort(A,j+1,high);
		}
	}
	public static int Partition(int[] A, int low, int high) {
	    int pivot = A[low];
	    int i = low + 1;
	    int j = high;
	    while (i <= j) {
	        while (i <= j && A[i] < pivot) {
	            i++;
	        }
	        while (i <= j && A[j] > pivot) {
	            j--;
	        }
	        if (i < j) {
	            exchange(A, i, j);
	            i++;
	            j--;
	        }
	    }
	    exchange(A, low, j);
	    return j;
	}
	public static void exchange(int[] A,int a,int b)
	{
		int temp;
		temp=A[a];
		A[a]=A[b];
		A[b]=temp;
	}
}
