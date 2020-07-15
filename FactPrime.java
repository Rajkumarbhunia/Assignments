//2. Write a program to display the factorial of numbers from 1 to the input number?Take input using scanner? Also display if the factorial is a prime number or not?



import java.util.Scanner;

public class FactPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A number:");	
		int num=sc.nextInt();
		sc.close();
		int i,factor=1,n,s=0,p;
		for(n=1;n<=num;n++)
		 {
		   for(i=1;i<=n;i++)
	     	{
			  factor *=i;
		    }
		   for(p=1;p<=factor;p++)
		   {
			   if(factor%p==0)
			   {
				   s++;
			   }
		   }
		   if(s==2)
		   {
				System.out.println("Factor of "+n+" is =" +factor +"-prime number");
		   }
		   else
			   System.out.println("Factor of "+n+" is =" +factor +"-not prime");
		factor=1;

	}

}
}