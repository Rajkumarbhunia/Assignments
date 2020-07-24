package assignment_5;
import java.util.Scanner;

public class CricketTest {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Target Runs:"); 
		 int targetRuns=sc.nextInt();
		 System.out.println("Enter Current Over:"); 
		 int currentOver=sc.nextInt();
		 System.out.println("Enter Current Score:"); 
		 int currentScore=sc.nextInt();
		 sc.close();
		 OneDayCricket ond=new OneDayCricket(targetRuns);
		 ond.setCurrentScore(currentScore);
		 ond.setCurrentOver(currentOver);
		 System.out.println("Current Run Rate: "+ond.calcCurrentRunrate()); 
		 System.out.println("Required Run Rate: "+ond.calcReqdRunrate()); 

	}	 }