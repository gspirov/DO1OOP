package competition;

public class GPS implements AdditionalService {
    private final double price;

    public GPS(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "GPS: " + this.price;
    }
}
