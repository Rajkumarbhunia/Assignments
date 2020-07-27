import java.util.Scanner;
//17. Write a program to find whether the given number is palindrome or not.


public class PalindromeNumber {
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
	int temp=num;
	if(temp==reverseNo(num))
	{
		System.out.println(""+temp+ " is a palindrome number");
	}
	else
		System.out.println(""+temp+ " is not a palindrome number");
		
}

}