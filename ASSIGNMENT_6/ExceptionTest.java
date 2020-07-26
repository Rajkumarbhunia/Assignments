package assignment_6;

public class ExceptionTest {

	public static void main(String[] args) {
		{
			int result=0;
			try
			{
				result=Integer.parseInt(args[0])/Integer.parseInt(args[1]);
			}
			
			catch(NullPointerException e)
			{
				System.out.println("No Input received");
			}
			
			catch(NumberFormatException e)
			{
			       System.out.print("Only integers are allowed");
			}

			
			catch(ArithmeticException e)
			{
				System.out.println("Division with zero is not possible");
			}
			System.out.println(result);
		}
	}
}

