package competition;

public class Car extends Vehicle {
    private final int numberOfDoors;

    Car(String licensePlate, String model,  int numberOfDoors) {
        super(licensePlate, model);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }
}
