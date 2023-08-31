package greedy_knapsack;
import java.util.*;
public class Greed {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n,m;
		System.out.println("Enter number of objects");
		n=sc.nextInt();
		System.out.println("Enter capacity of the knapsack");
		m=sc.nextInt();
		double[] w=new double[n];
		double[] p=new double[n];
		System.out.println("Enter weights");
		for(i=0;i<n;i++) {
			w[i]=sc.nextDouble();
		}
		System.out.println("Enter profits");
		for(i=0;i<n;i++) {
			p[i]=sc.nextDouble();
		}
		compute(n,m,w,p);
	}
	public static void compute(int n,int m,double[] w,double[] p)
	{
		double[] y=new double[n];
		double[] res=new double[n];
		double u;
		double sum=0;
		for(int i=0;i<n;i++)
		{
			y[i]=p[i]/w[i];
			res[i]=0;
		}
		u=m;
		int k,large=0;
		for(k=0;k<n;k++)
		{
			large=max(y,n);
			if(w[large]>u)
			{
				break;
			}
			res[large]=1;
			u=u-w[large];
		}
		if(k<=n)
		{
			res[large]=u/w[large];
		}
		System.out.println("The solution vector is");
		for(int i=0;i<n;i++)
		{
			System.out.println(res[i]+"");
			sum=sum+res[i]*p[i];
		}
	}
	public static int max(double[] y,int n)
	{
		int large=0;
		for(int i=0;i<n;i++)
		{
			if(y[i]>y[large])
			{
				large=i;
			}
		}
		y[large]=0;
		return large;
	}
}
