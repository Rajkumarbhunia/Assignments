/*  
7. The Goal is
to print the given pattern as follows based on the number of lines as input.
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1 					*/

package assignment;

public class Pattern1 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=6-i;j++)
			{
				System.out.print(""+j);	
			}
			System.out.println("");
		
		}
	}

}
