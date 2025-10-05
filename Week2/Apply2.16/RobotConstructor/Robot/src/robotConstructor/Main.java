package robotConstructor;

public class Main {

	public static void main(String[] args) {
		Robot r1 = new Robot(5, 5);

		// Output the robot's starting position
		System.out.println("(" + r1.getX() + ", " + r1.getY() + ")");

        Robot r2 = new Robot();
        System.out.println("(" + r2.getX() + ", " + r2.getY() + ")");
	}

}
