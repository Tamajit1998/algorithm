import java.util.*;
import java.io.*;

public class StressTest{
	static long MaxpairwiseproductsNaive(long[] numbers){
		int max_product = 0;
		int n= numbers.length;
		for(int i = 0; i<n ;i++)
		{
			for(int j = i+1; j< n; j++ )
			{
				max_product =(int) Math.max(max_product,numbers[i]*numbers[j]);
			}
		}
		return max_product;
	}
	static long MaxpairwiseproductsFast(long[] numbers){
		int maxindex1=0;
		int n = numbers.length;
		for(int l=0;l<n;l++)
		{
			if(numbers[l]>numbers[maxindex1])
			{
				maxindex1=l;
			}
		}
		int maxindex2=0;
		for(int m=0;m<n;m++)
		{
			if(numbers[m]!= numbers[maxindex1] && numbers[m]>numbers[maxindex2])
			{
				maxindex2=m;
			}
		}
		return (numbers[maxindex1]*numbers[maxindex2]);

	}
	public static void main(String[] args) {
		
		Scanner scanner =  new Scanner(System.in);
		int n =scanner.nextInt();
		long[] numbers = new long[n];
		for(int k=0;k<n;k++)
		{
			numbers[k]=scanner.nextInt();
		}
		System.out.println(MaxpairwiseproductsNaive(numbers));
		System.out.println(MaxpairwiseproductsFast(numbers));
	}

}