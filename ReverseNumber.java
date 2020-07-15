//11. Write a program to get reverse of given number

import java.util.Scanner;

public class ReverseNumber {
		static int reverseNo(int num)
		{
			int rev=0,rem;
			while(num>0)
			{
				rem=num%10;
				rev=rev*10;
				rev +=rem;
				num=num/10;			
			}
			return rev;
		}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		sc.close();
		System.out.println("Reverse of the number is="+reverseNo(num));
	}

}