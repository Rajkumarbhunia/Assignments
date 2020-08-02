 package assignment_6;

import java.util.Collections;
import java.util.LinkedList;

public class ScoreAnalyzer {
	private LinkedList<Integer> runsData=new LinkedList<>();

	public ScoreAnalyzer(LinkedList<Integer> runsData) {
		super();
		this.runsData = runsData;
	}
	public ScoreAnalyzer() {
	}
	public void addRunsToList(int run) {
		runsData.add(run);
	}
	public double calcRunRate()
	{
		int totalRuns=0;
		for(int i=0;i<runsData.size();i++)
		{
			totalRuns+=runsData.get(i);
		}
		return((double)totalRuns/(double)50);
	}
	public int lowestRunsScored()
	{
		return(Collections.min(runsData));
	}
	public void displayRuns() {
		System.out.print("Runs Scored:");
		for(int i=0;i<runsData.size();i++)
		{
			System.out.print(i+1+"-"+runsData.get(i)+" ");
		}
		
	}

}
