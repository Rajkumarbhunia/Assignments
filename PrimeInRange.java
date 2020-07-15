//10. Write a program to print prime numbers between 2 to 100


public class PrimeInRange {

	public static void main(String[] args) {
		int i,j,flag=1;
		System.out.println("Prime numbers between 2 to 100 are:");
		
		for(i=2;i<=100;i++)
		{
			if(i==1 || i==0)
				continue;
			flag=1;
		   for(j=2;j<=i/2;++j)
		   {
			   if(i%j==0)
			   {
				   flag=0;
				   break;
			   }
		   }
		   if(flag==1)
		   {
				System.out.println(i);
		   }

		}


	}
}
