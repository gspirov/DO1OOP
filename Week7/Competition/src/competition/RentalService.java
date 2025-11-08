package competition;

import java.util.ArrayList;

public class RentalService<T extends Vehicle> {
    private ArrayList<T> vehicles;

    public RentalService() {
        this.vehicles = new ArrayList<>();
    }

    public boolean addVehicle(T vehicle) {
        if (!this.vehicles.contains(vehicle)) {
            this.vehicles.add(vehicle);
            return true;
        }

        return false;
    }

    public boolean removeVehicle(T vehicle) {
        return this.vehicles.remove(vehicle);
    }

    public ArrayList<T> getVehicles() {
        return this.vehicles;
    }

    public T rentVehicle(String licensePlate) {
        for (T vehicle : this.vehicles) {
            if (!vehicle.isRented() && vehicle.getLicensePlate().equals(licensePlate)) {
                vehicle.setRented(true);
                return vehicle;
            }
        }

        return null;
    }

    public String displayAvailableVehicles() {
        StringBuilder output = new StringBuilder();

        for (Vehicle vehicle : this.vehicles) {
            if (!vehicle.isRented()) {
                output.append(vehicle).append("\n");
            }
        }

        return output.toString();
    }
}
