
//15. Write a program to find sum of individual digits of given number


import java.util.Scanner;

public class DigitsSum {
		static int sumDig(int num)
		{
		int sum=0,rem;
		while(num>0)
		 {
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
		sc.close();
        System.out.println("Sum of the digit="+sumDig(num));
        }
}

