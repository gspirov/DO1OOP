package competition;

public class SUV extends Vehicle {
    private final boolean hasFourWheelDrive;

    SUV(String licensePlate, String model, boolean hasFourWheelDrive) {
        super(licensePlate, model);
        this.hasFourWheelDrive = hasFourWheelDrive;
    }

    public boolean isHasFourWheelDrive() {
        return this.hasFourWheelDrive;
    }
}
