package assignment_6;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
public class ScoreCard {

	public static void main(String[] args) {
		HashMap<String,Integer> runsScored=new HashMap<>();
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<5;i++) {
			String b=sc.next();
			Integer a=sc.nextInt();
			runsScored.put(b, a);
		}
		sc.close();
		System.out.println("Players who batted");
		for(Map.Entry m:runsScored.entrySet())
		{
			System.out.println(m.getKey());
		}
		System.out.println("Scores by players");
		int highestScore = 0, totalScore = 0;

		for (Map.Entry<String, Integer> cms : runsScored.entrySet()) {
			System.out.print(cms.getKey() + ":");
			System.out.println(cms.getValue());
			if (highestScore < cms.getValue()) {
				highestScore = cms.getValue();
			}
			totalScore = totalScore + cms.getValue();
		}
		System.out.println("Total score: "+totalScore);
		System.out.println("Highest score: "+highestScore);
		System.out.println("Name of the Highest Scorer:"+runsScored.get(highestScore));
		System.out.println("Run scores by Dhoni:"+runsScored.get("Dhoni"));
}
}
