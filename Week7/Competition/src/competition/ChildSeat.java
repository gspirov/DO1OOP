package competition;

public class ChildSeat implements AdditionalService {
    private final double price;

    public ChildSeat(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Child seat: " + this.price;
    }
}
