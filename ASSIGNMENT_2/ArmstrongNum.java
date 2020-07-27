
//4. Write a program to find whether a given 3 digit number is an Armstrong number or not.

package assignment;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number=");
		int n=sc.nextInt();
		sc.close();
		int temp=n;
		int rem,s=0;
		while(n>0)
		{
			rem=n%10;
			s+=rem*rem*rem;
			n=n/10;
		}
	
	if(s==temp)
	{
		System.out.println("The number is a Armstrong number");
	}
	else
		System.out.println("The number is not  a Armstrong number");	
	
}	
}