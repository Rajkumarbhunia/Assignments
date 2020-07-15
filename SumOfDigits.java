//1. Write a program to take a integer as input ,Print the sum of digits of the number?  ex 9999 - 36 - 9



import java.util.Scanner;

public class SumOfDigits
{

	static int digiSum(int num)
	{
			int rem;
			int sum=0;
			while(num>0 || sum>9)
			 {
			  if(num==0)
			   {
			     num=sum;
			     sum=0;
			   }
			rem=num%10;
			sum=sum+rem;
			num=num/10;
			  }
			return sum;
	}

	public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number=");
			int num=sc.nextInt();
	                System.out.println("Sum of the digit="+digiSum(num));
	        }
}