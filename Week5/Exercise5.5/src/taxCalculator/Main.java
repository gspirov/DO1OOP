package taxCalculator;

public class Main {
    public static void main(String[] args) {
        TaxCalculator calculator = new TaxCalculator();

        calculator.addBand(new TaxBand(0.0, 0.0));
        calculator.addBand(new TaxBand(12500.0, 0.20));
        calculator.addBand(new TaxBand(50000.0, 0.40));
        calculator.addBand(new TaxBand(150000.0, 0.45));

        double income = 160000.0;
        double tax = calculator.calculate(income);
        System.out.println("Total tax: £" + tax);
    }
}
