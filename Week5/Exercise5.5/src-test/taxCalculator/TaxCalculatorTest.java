package taxCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxCalculatorTest {
    @Test
    public void testTwoBands() {
        TaxCalculator calculator = new TaxCalculator();

        calculator.addBand(new TaxBand(0.0, 0.0));
        calculator.addBand(new TaxBand(12500.0, 0.20));
        calculator.addBand(new TaxBand(50000.0, 0.40));

        assertEquals(13500.0, calculator.calculate(65000.0));
    }

    @Test
    void testAddingNextBandLowerThanPrevious() {
        TaxCalculator calculator = new TaxCalculator();

        assertTrue(calculator.addBand(new TaxBand(0.0, 0.0)));
        assertTrue(calculator.addBand(new TaxBand(12500.0, 0.20)));
        assertFalse(calculator.addBand(new TaxBand(12000.0, 0.18)));
    }

    @Test
    public void testAddingNegativeBand() {
        TaxCalculator calculator = new TaxCalculator();
        assertFalse(calculator.addBand(new TaxBand(-1.0, 0.0)));
    }
}
