package taxCalculator;

import java.util.ArrayList;

public class TaxCalculator {
    ArrayList<TaxBand> taxBands = new ArrayList<>();

    public boolean addBand(TaxBand taxBand) {
        if (taxBand.band < 0) {
            return false;
        }

        if (!taxBands.isEmpty() && taxBands.getLast().band > taxBand.band) {
            return false;
        }

        taxBands.add(taxBand);

        return true;
    }

    public Double calculate(Double income) {
        double tax = 0.0;

        for (int i = 0; i < taxBands.size(); i++) {
            TaxBand taxBand = taxBands.get(i);
            Double lowerBand = taxBand.band;
            Double upperBand;

            if (i + 1 < taxBands.size()) {
                upperBand = taxBands.get(i + 1).band;
            } else {
                upperBand = income;
            }

            if (income > lowerBand) {
                tax += (upperBand - lowerBand) * taxBand.rate;
            }
        }

        return tax;
    }
}
