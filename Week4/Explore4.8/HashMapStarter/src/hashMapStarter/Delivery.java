package hashMapStarter;

public class Delivery {
	private final String trackingID;
	private final double value;
	private final String address;
	
	public Delivery(String newID, double newValue, String newAddress) {
		trackingID = newID;
		value = newValue;
		address = newAddress;
	}
	
	public String getID() {
		return trackingID;
	}
	
	public double getValue() {
		return value;
	}
	
	public String getAddress() {
		return address;
	}

    @Override
	public String toString() {
		return "#" + trackingID + " (" + value + ") " + address;
	}
}
