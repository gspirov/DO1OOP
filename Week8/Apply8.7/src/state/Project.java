package state;

public class Project {
	private final String projectName;
	private ProjectPhase currentPhase = new Plan();

	public Project(String projectName)
    {
		this.projectName = projectName;
	}

	public void goToNextPhase()
    {
		this.currentPhase = this.currentPhase.goToNextPhase();
	}

	public String toString()
    {
		return this.projectName + " (current phase: " + this.currentPhase + ")";
	}
}
