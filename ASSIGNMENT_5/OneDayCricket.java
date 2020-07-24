package assignment_5;

public class OneDayCricket extends Cricket {
	private static int maxOvers=50;

	public OneDayCricket(int targetRuns) {
	super(targetRuns,maxOvers);	
	}

	public double calcCurrentRunrate() {
		
		return (getCurrentScore()/getCurrentOver());
	}

	public double calcReqdRunrate() {
	return((getTargetScore()-getCurrentScore())/(maxOvers-getCurrentOver()));
	}
	}
	


