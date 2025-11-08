package competition;

abstract public class Vehicle {
    protected String licensePlate;

    protected String model;

    protected boolean isRented;

    protected RentalAgreement rentalAgreement;

    Vehicle(String licensePlate, String model) {
        this.licensePlate = licensePlate;
        this.model = model;
    }

    public String getLicensePlate() {
        return this.licensePlate;
    }

    public String getModel() {
        return this.model;
    }

    public boolean isRented() {
        return this.isRented;
    }

    public void setRented(boolean isRented) {
        this.isRented = isRented;
    }

    public void setRentalAgreement(RentalAgreement rentalAgreement) {
        this.rentalAgreement = rentalAgreement;
    }

    public RentalAgreement getRentalAgreement() {
        return this.rentalAgreement;
    }

    @Override
    public String toString() {
        return "Vehicle - " +
                "licensePlate: " + licensePlate +
                ", model - " + model +
                ", rentalAgreement - " + rentalAgreement;
    }
}
