package converter;

public class Converter {
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 1.8;
    }

    public double kgToPounds(double kg) {
        return kg / 0.4536;
    }

    public double poundsToKg(double pounds) {
        return Math.round(pounds * 0.4536);
    }

    public double eurToBgn(double eur) {
        return eur * 1.9558;
    }

    public double bgnToEuro(double bgn) {
        return bgn * 0.5112;
    }
}
