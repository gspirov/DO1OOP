package state;

public class Plan implements ProjectPhase
{
	public ProjectPhase goToNextPhase()
    {
		return new Apply();
	}

    @Override
    public String toString()
    {
		return "Plan";
	}
}