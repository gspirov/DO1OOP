package race;

public class Runner {
	private final String runnerID;
	private final double finishTime;

	public Runner(String runnerID, double finishTime) {
		this.runnerID = runnerID;
		this.finishTime = finishTime;
	}
	
	public String getRunnerID() {
		return this.runnerID;
	}
	
	public double getFinishTime() {
		return this.finishTime;
	}
	
	public String toString() {
		return this.runnerID + " (" + this.finishTime + ")";
	}
}