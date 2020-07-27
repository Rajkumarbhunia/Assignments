//5. Write a program to generate the first n terms in the series  1, 8, 27, 64, 125

package assignment;

import java.util.Scanner;

public class SeriesCube {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nth term=");
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++)
		{
			System.out.print(" "+i*i*i);
		}
	}

}
