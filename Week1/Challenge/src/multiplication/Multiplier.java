package multiplication;

public class Multiplier {
    public void multiply(int maxMultiplicand, int maxMultiplier) {
        if (maxMultiplicand < 1 || maxMultiplier < 1) {
            System.out.println("Invalid input");
            return;
        }

        for (int i = 1; i <= maxMultiplicand; i++) {
            System.out.printf("Table for %d:%n", i);

            for (int j = 1; j <= maxMultiplier; j++) {
                System.out.printf("%d x %d = %d%n", i, j, i * j);
            }

            if (i < maxMultiplicand) {
                System.out.println();
            }
        }
    }
}