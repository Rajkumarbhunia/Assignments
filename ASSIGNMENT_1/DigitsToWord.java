//18. Write a program to convert given digit into the word format.  a. If i/p is 1 -> output : One  b. If i/p is 2 -> output : Two etc.,


import java.util.Scanner;

public class DigitsToWord {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number=");
		int num=sc.nextInt();
		sc.close();
		String[] single_digits = new String[]{ "zero", "one", "two", "three", "four", "five", "six", "seven",  "eight", "nine"};	
		System.out.println("Your digits in word="+single_digits[num]);
			  


}
}