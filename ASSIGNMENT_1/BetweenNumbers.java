//7. Write a program to print numbers between the range ( say 10 to 100 OR 100 to 200 etc.,)


import java.util.Scanner;

public class BetweenNumbers {

	public static void main(String[] args) {
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter starting number:");	
		int start=sc.nextInt();
		System.out.print("Enter last number:");
		int end=sc.nextInt();
		System.out.println("The numbers from"+start+ " to "+end+" are =");
		sc.close();
		for(i=start;i<=end;i++)
		{
			System.out.println(i);
		}


	}

}
