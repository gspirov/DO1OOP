package iterator;

public class Main {
    static void main(String[] args) {
        int count = 0;

        while (count < 15) {
            System.out.print(count);

            count++;

            if (count < 15) {
                System.out.print(", ");
            }
        }
    }
}
