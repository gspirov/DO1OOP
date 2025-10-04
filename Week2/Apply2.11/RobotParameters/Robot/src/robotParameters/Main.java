package robotParameters;

public class Main {
	
	public static void main(String[] args) {
		Robot r = new Robot();
		
		//Output the robot's starting position
		System.out.println("(" + r.getX() + ", " + r.getY() + ")");
		
		//Move left and output the new position
		r.moveLeft(2);
		System.out.println("(" + r.getX() + ", " + r.getY() + ")");
		
		//Move left again and output the new position
		r.moveLeft(4);
		System.out.println("(" + r.getX() + ", " + r.getY() + ")");
		
		//Attempt to move left (should not be permitted as x coordinate is at zero)
		//The output should be the same as for the previous output
		r.moveLeft(1);
		System.out.println("(" + r.getX() + ", " + r.getY() + ")");

        r.moveDown(1);
        System.out.println("(" + r.getX() + ", " + r.getY() + ")");

        r.moveDown(1);
        System.out.println("(" + r.getX() + ", " + r.getY() + ")");

        r.moveDown(1);
        System.out.println("(" + r.getX() + ", " + r.getY() + ")");

        r.moveDown(1);
        System.out.println("(" + r.getX() + ", " + r.getY() + ")");
	}
}

