//8. Write a program to print mathematical table of given number


import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A number:");	
		int num=sc.nextInt();
		sc.close();
		int i,val=0;
		System.out.println("*****Table of "+num+" ***** ");
		for(i=1;i<=20;i++)
		 {
			val=num*i;
			System.out.println(num+" * "+i+ "  = "+val);	
	}

}
}
