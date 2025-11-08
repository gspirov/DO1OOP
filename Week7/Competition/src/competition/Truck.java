package competition;

public class Truck extends Vehicle {
    private final double loadCapacity;

    Truck(String licensePlate, String model, double loadCapacity) {
        super(licensePlate, model);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return this.loadCapacity;
    }
}
