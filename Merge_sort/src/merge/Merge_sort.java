package merge;
import java.util.*;

public class Merge_sort {

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
		low=0;
		high=n-1;
		Merge_sortt(A,low,high);
		
		System.out.println("The sorted array is");
		for(i=0;i<n;i++)
		{
			System.out.println(""+A[i]);
		}
	}
	public static void Merge_sortt(int[] A,int low,int high)
	{
		int mid;
		if(low<high) {
		mid = (low+high)/2;
		Merge_sortt(A,low,mid);
		Merge_sortt(A,mid+1,high);
		Merge(A,low,mid,high);
		}
	}
	public static void Merge(int[] A,int low,int mid,int high) {
		int i,j,h,k;
		int[] B=new int[100]; 
		i=h=low;
		j=mid+1;
		while((h<=mid)&&(j<=high))
		{
			if(A[h]<A[j])
			{
				B[i]=A[h];
				h=h+1;
			}
			else
			{
				B[i]=A[j];
				j=j+1;
			}
			i=i+1;
		}
		if(j>high)
		{
			for(;h<=mid;h++) {
				B[i]=A[h];
				i=i+1;
			}
		}
		else
		{
			for(;j<=high;j++) {
				B[i]=A[j];
				i=i+1;
			}
		}
		
		for(k=low;k<=high;k++)
		{
			A[k]=B[k];
			
		}
		
	}
}
