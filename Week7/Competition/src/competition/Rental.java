package competition;

import java.util.ArrayList;

public class Rental {
    private Vehicle vehicle;
    private ArrayList<AdditionalService> additionalServices;
    private int numberOfDays;

    Rental(Vehicle vehicle, int numberOfDays) {
        this.vehicle = vehicle;
        this.numberOfDays = numberOfDays;
        this.additionalServices = new ArrayList<>();
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }

    public boolean addAdditionalService(AdditionalService additionalService) {
        if (!this.additionalServices.contains(additionalService)) {
            this.additionalServices.add(additionalService);
            return true;
        }

        return false;
    }

    public boolean removeAdditionalService(AdditionalService additionalService) {
        return this.additionalServices.remove(additionalService);
    }

    public ArrayList<AdditionalService> getAdditionalServices() {
        return this.additionalServices;
    }

    public int getNumberOfDays() {
        return this.numberOfDays;
    }

    public String displayRentalDetails() {
        StringBuilder output = new StringBuilder();

        double vehicleCost = vehicle.getRentalAgreement().calculateCost(this.numberOfDays);
        double totalPrice = vehicleCost;

        output.append("Vehicle rental costs: ").append(vehicleCost);

        if (!this.additionalServices.isEmpty()) {
            output.append("\n")
                  .append("Additional services costs: ");

            for (AdditionalService additionalService : this.additionalServices) {
                totalPrice += additionalService.getPrice();
                output.append(additionalService).append("\n");
            }
        }

        output.append("Total price: ").append(totalPrice);

        return output.toString();
    }
}
