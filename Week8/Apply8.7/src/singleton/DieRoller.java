package singleton;

import java.util.Random;

public class DieRoller {
	private static DieRoller roller;
	private final int sides;
	private final Random random;
	
	private DieRoller(int sides) {
		this.sides = sides;
		this.random = new Random();
	}
	
	public static DieRoller getRoller(int sides) {
		if (roller == null) {
			roller = new DieRoller(sides);
		}
		return roller;
	}
	
	public int roll() {
        return random.nextInt(sides) + 1;
	}

    public int getSides() {
        return sides;
    }
}
