package state;

public class Review implements ProjectPhase
{
	public ProjectPhase goToNextPhase()
    {
		return new Plan();
	}

    @Override
	public String toString()
    {
		return "Review";
	}
}