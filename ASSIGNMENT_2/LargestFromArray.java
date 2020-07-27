//3. Write a function to get largest number in the given array.

package assignment;

import java.util.Scanner;

public class LargestFromArray {
	static int largestNo(int[] arr)
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
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

		System.out.println("Greatest number is="+largestNo(arr));
		
	}

}
