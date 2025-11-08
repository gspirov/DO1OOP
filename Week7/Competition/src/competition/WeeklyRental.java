package competition;

public class WeeklyRental implements RentalAgreement {
    private final double weeklyRate;

    public WeeklyRental(double weeklyRate) {
        this.weeklyRate = weeklyRate;
    }

    @Override
    public double calculateCost(int rentalDuration) {
        return this.weeklyRate * (int) Math.ceil(rentalDuration / 7.0);
    }

    public double getWeeklyRate() {
        return this.weeklyRate;
    }

    @Override
    public String toString() {
        return "Weekly Rental - " + weeklyRate;
    }
}
