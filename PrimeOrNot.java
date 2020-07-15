//9. Write a program to find whether the given number is prime or not.


import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		sc.close();
		int i,s=0;
		   for(i=1;i<=num;i++)
		   {
			   if(num%i==0)
			   {
				   s++;
			   }
		   }
		   if(s==2)
		   {
				System.out.println(num+"is a prime number");
		   }
		   else
			   System.out.println(num+ " is not prime");

	}

}