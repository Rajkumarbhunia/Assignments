//1. Write a program to remove duplicate elements from the array of integers.


package assignment;
import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elements=");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements=");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
	    for(int i = 0; i < n; i++)
	    {
	        for(int j = i+1; j < n; j++)
	        {
	            if(arr[j] == arr[i])
	            {
	                for(int k = j; k < n-1; k++)
	                {
	                    arr[k] = arr[k+1];
	                }
	                n--;
	                j--;
	        }
	    }
	 }
			System.out.println("After removing duplicate elements=");
			{
				for(int t=0;t<n;t++)
				{
					System.out.println(arr[t]);	
				}
			}
		
	}
	}

