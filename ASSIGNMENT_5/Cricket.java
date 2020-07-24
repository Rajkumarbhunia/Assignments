package assignment_5;

public abstract class Cricket {
private int maxOvers;
private int targetScore;
private int currentOver;
private int currentScore;

public abstract double calcCurrentRunrate();
public abstract double calcReqdRunrate();

public int getMaxOvers() {
	return maxOvers;
}
public int getTargetScore() {
	return targetScore;
}
public int getCurrentOver() {
	return currentOver;
}
public void setCurrentOver(int currentOver) {
	this.currentOver = currentOver;
}
public int getCurrentScore() {
	return currentScore;
}
public void setCurrentScore(int currentScore) {
	this.currentScore = currentScore;
}
public Cricket(int targetRuns, int maxOvers) {
	this.targetScore=targetRuns;
	this.maxOvers=maxOvers;
	
}

}
