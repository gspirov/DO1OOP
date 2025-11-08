package competition;

public class Main {
    public static void main(String[] args) {
        RentalService<Car> carRentalService = new RentalService<>();
        Car car = new Car("ABC123", "Toyota Camry", 4);
        car.setRentalAgreement(new DailyRental(50.0));
        carRentalService.addVehicle(car);

        RentalService<Truck> truckRentalService = new RentalService<>();
        Truck truck = new Truck("DEF456", "Ford F-150", 1.5);
        truck.setRentalAgreement(new WeeklyRental(300.0));
        truckRentalService.addVehicle(truck);

        RentalService<SUV> suvRentalService = new RentalService<>();
        SUV suv = new SUV("GHI789", "Jeep Wrangler", true);
        suv.setRentalAgreement(new DailyRental(70.0));
        suvRentalService.addVehicle(suv);

        System.out.println("Available Cars:");
        System.out.print(carRentalService.displayAvailableVehicles());

        System.out.println("\nAvailable Trucks:");
        System.out.print(truckRentalService.displayAvailableVehicles());

        System.out.println("\nAvailable SUVs:");
        System.out.print(suvRentalService.displayAvailableVehicles());

        System.out.println("\nRenting a car with license plate ABC123:");
        Car rentedCar = carRentalService.rentVehicle("ABC123");

        if (rentedCar != null) {
            Rental rental = new Rental(rentedCar, 3);
            rental.addAdditionalService(new GPS(15.0));
            rental.addAdditionalService(new ChildSeat(10.0));
            System.out.print(rental.displayRentalDetails());
        } else {
            System.out.println("Car not available.");
        }
    }
}
