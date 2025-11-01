package state;

public class Main {
    public static void main(String[] args)
    {
        // plan phase
        Project project = new Project("Mobile App");
        System.out.println(project);

        // apply phase
        project.goToNextPhase();
        System.out.println(project);

        // test phase
        project.goToNextPhase();
        System.out.println(project);

        // review phase
        project.goToNextPhase();
        System.out.println(project);
    }
}
