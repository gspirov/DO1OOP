package singleton;

public class Main {
	public static void main(String[] args) {
		DieRoller firstRoller = DieRoller.getRoller(6);
		DieRoller secondRoller = DieRoller.getRoller(10);

        /*
         * We always receive same hash code because of the single instance of the object.
         * The first initialised roller will take precedence with it's sides provided.
         */
        System.out.println(firstRoller);
		System.out.println(secondRoller);

        /*
         * Prove that only first provided slides are applied because of the singleton.
         */
        System.out.println("First roller sides: " + firstRoller.getSides());
        System.out.println("Second roller sides: " + secondRoller.getSides());

		int rolls = 50;

        /*
         * Display random numbers only when we're sure both instances are same in order to prove the singleton pattern.
         */
        if (firstRoller.getSides() == secondRoller.getSides()) {
            for (int i = 0; i < rolls; i++) {
                System.out.print(firstRoller.roll());

                if (i < rolls - 1) {
                    System.out.print(", ");
                }
            }
        }
	}
}
