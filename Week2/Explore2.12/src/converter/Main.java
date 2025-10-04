package converter;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Converter converter = new Converter();

        System.out.println("Temperature");
        System.out.println(converter.celsiusToFahrenheit(0));
        System.out.println(converter.fahrenheitToCelsius(32.0));

        DecimalFormat f = new DecimalFormat("##.00");

        System.out.println("Weights");
        System.out.println(f.format(converter.kgToPounds(10)));
        System.out.println(converter.poundsToKg(22.04585));

        System.out.println("Currencies");
        System.out.println(f.format(converter.eurToBgn(1)));
        System.out.println(f.format(converter.bgnToEuro(1.9558)));
    }
}
