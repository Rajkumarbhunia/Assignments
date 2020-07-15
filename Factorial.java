//13. Write a program to find factorial of given number



import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A number:");	
		int num=sc.nextInt();
		sc.close();
		int i,factor=1;
		for(i=1;i<=num;i++)
{
			  factor *=i;
		    }
		System.out.println("Factorial of the number is:"+factor);
}
}