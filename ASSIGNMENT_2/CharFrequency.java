//2. Write a program to count how many numbers of times each character appears/present in the given string.

package assignment;
import java.util.Scanner;

public class CharFrequency {

	public static void main(String[] args) {
		int a[]=new int[26];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String=");
		String str=sc.nextLine();
		sc.close();
		for(int i=0;i<str.length();i++)
		{
			if (str.charAt(i)>=65 && str.charAt(i)<=90)
			{
				a[str.charAt(i)-65]++;
			}
			else if (str.charAt(i)>=97 && str.charAt(i)<=122)
				{
					a[str.charAt(i)-97]++;
				}
		}
		for(int j=0;j<26;j++)
		{
			if(a[j]>0)
			{
				System.out.println((char)(j+97) +""+a[j]);	
			}
		}
	}

}
