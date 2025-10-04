package robotReturns;

public class Main {

	public static void main(String[] args) {
		Robot r = new Robot();

		// Output the robot's starting position
		System.out.println("(" + r.getX() + ", " + r.getY() + ")");

		// Try to move too far to the left
		if (r.moveLeft(3)) {
            // Output the robot's position
            System.out.println("(" + r.getX() + ", " + r.getY() + ")");
        } else {
            System.out.println("Failed moving 3 times left.");
        }

		// Move a valid distance to the left
		if (r.moveLeft(1)) {
            // Output the robot's position
            System.out.println("(" + r.getX() + ", " + r.getY() + ")");
        } else {
            System.out.println("Failed moving 1 time left.");
        }

		// Try to move too far to the right
		if (r.moveRight(4)) {
            // Output the robot's position
            System.out.println("(" + r.getX() + ", " + r.getY() + ")");
        } else {
            System.out.println("Failed moving 4 times right.");
        }

		// Move a valid distance to the right
		if (r.moveRight(3)) {
            // Output the robot's position
            System.out.println("(" + r.getX() + ", " + r.getY() + ")");
        } else {
            System.out.println("Failed moving 3 times right.");
        }

        // Try to move too far above
        if (r.moveUp(4)) {
            // Output the robot's position
            System.out.println("(" + r.getX() + ", " + r.getY() + ")");
        } else {
            System.out.println("Failed moving 4 times up.");
        }

        // Move a valid distance above
        if (r.moveUp(1)) {
            // Output the robot's position
            System.out.println("(" + r.getX() + ", " + r.getY() + ")");
        } else {
            System.out.println("Failed moving 1 times up.");
        }

        // Try to move too far below
        if (r.moveDown(5)) {
            // Output the robot's position
            System.out.println("(" + r.getX() + ", " + r.getY() + ")");
        } else {
            System.out.println("Failed moving 5 times down.");
        }

        // Move a valid distance below
        if (r.moveDown(4)) {
            // Output the robot's position
            System.out.println("(" + r.getX() + ", " + r.getY() + ")");
        } else {
            System.out.println("Failed moving 4 times down.");
        }
	}
}
