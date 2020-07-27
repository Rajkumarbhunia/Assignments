//6. Write a program to generate the first n prime numbers in the series  2,3,5,7,9,11,..., 17

package assignment;

import java.util.Scanner;

public class PrimeSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nth term=");
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++)
		{
			if(i==1 || i==0)
				continue;
			int flag=1;
		   for(int j=2;j<=i/2;++j)
		   {
			   if(i%j==0)
			   {
				   flag=0;
				   break;
			   }
		   }
		   if(flag==1)
		   {
				System.out.println(i);
		   }

		}
	}

}
