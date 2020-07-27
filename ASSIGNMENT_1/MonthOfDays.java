//3. Write a program to display number of days in a month? Month Name(String) and  year should be taken as input? Leap year should be considered?



import java.util.Scanner;

public class MonthOfDays {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Write the name of the month: ");
		String month=sc.next();
		System.out.println("Year:  ");
		int year=sc.nextInt();
		sc.close();
		if(!month.equals("february"))
		{
		if(month.equals("april") || month.equals("june") || month.equals("september") || month.equals("november"))
		{
			System.out.println("30 days");
		}
		else
			System.out.println("31 days");
			
	}
		else if(month.equals("february") && year%400==0 || year%4==0)
{
			System.out.println("29 days");
}
		
		else if(month.equals("february"))
		{
			System.out.println("28 days");
		}
		else
		{
		
		}
	}
}
