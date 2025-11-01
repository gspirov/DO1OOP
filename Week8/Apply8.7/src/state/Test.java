package state;

public class Test implements ProjectPhase
{
    public ProjectPhase goToNextPhase()
    {
        return new Review();
    }

    @Override
    public String toString() {
        return "Test";
    }
}
