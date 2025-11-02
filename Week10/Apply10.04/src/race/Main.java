package race;

public class Main {
    public static void main(String[] args) {
        Runner r1 = new Runner("001", 54.65);
        Runner r2 = new Runner("002", 53.21);
        Runner r3 = new Runner("003", 58.74);

        Finishers f = new Finishers();
        f.add(r3);
        f.clear();
        f.add(r1);
        f.add(r3);
        f.add(r2);
        f.remove(0);
        f.remove(r3);
        f.add(r1);
        f.add(r3);

        System.out.print(f);
    }
}
