//14. Write a program to find ncr. Hint : ncr = ( n! / ( (n-r)! * r!)


import java.util.Scanner;
public class Ncr {
	static long fact(int n)
	{
		int i;
		long factor=1;
		for(i=1;i<=n;i++)
		{
			  factor *=i;
		}
		return factor;
	}
	
	static long find_ncr(int n,int r) {
		long result;
		result=fact(n)/(fact(r)*fact(n-r));
		return result;
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");	
		int n=sc.nextInt();
		System.out.println("Enter the value of r:");	
		int r=sc.nextInt();
		sc.close();
		System.out.println("ncr=:"+find_ncr(n,r));
	}

}