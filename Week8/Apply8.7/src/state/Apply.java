package state;

public class Apply implements ProjectPhase
{
	public ProjectPhase goToNextPhase()
    {
		return new Test();
	}

    @Override
    public String toString()
    {
		return "Apply";
	}	
}