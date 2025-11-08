package competition;

public class DailyRental implements RentalAgreement {
    private final double dailyRate;

    DailyRental(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateCost(int rentalDuration) {
        return this.dailyRate * rentalDuration;
    }

    public double getDailyRate() {
        return this.dailyRate;
    }

    @Override
    public String toString() {
        return "Daily Rental - " + dailyRate;
    }
}
