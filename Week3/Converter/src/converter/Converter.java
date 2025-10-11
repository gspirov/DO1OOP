package converter;

public class Converter {
	
	// 0.1 - This method is complete - it converts cm to inches
	public double cmToInch(double cm) {

		// there are 0.393701 inches in a cm
		return cm * 0.393701;
	}
	
	// 0.2 - This method is also complete - it converts inches to cm, but all in one line
	public double inchToCm(double inches) {
		return inches / 0.393701;
	}
	
	
	// 1.1 - this method should return miles to km
	// The calculation involves dividing miles by 0.621371 (instead of dividing by 1)
	public double milesToKm(double miles) {
		return miles / 0.621371;
	}
	
	// 1.2 - This method should return km to miles.  
	// Instead of returning '0', return km multiplied by 0.621371
	public double kmToMiles(double km) {
        return km * 0.621371;
	}
	
	// 2.1 - Create a method called kgToLb (case-sensitive) to convert kilograms to pounds
	// It should have a double parameter
	// To convert from kg (kilograms) to lb (pounds), multiply by 2.20462

    public double kgToLb(double kg) {
        return kg * 2.20462;
    }
	
	// 2.2 - Create a method called lbToKg (case-sensitive) to convert pounds to kilograms
	// The conversion should be the reverse of 2.1
	
    public double lbToKg(double lb) {
        return lb * 0.453592;
    }
}
