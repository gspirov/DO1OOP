package hashMapStarter;

import java.util.HashMap;

public class HashMapStarter {
	public static void main(String[] args) {
		
		// create a HashMap with a String key and a Delivery value
		HashMap<String, Delivery> deliveries = new HashMap<>();
		
		// add a value
		Delivery d1 = new Delivery("123", 0.99, "High Street");
		deliveries.put("123", d1);
		
		// add a value in a slightly different way
		Delivery d2 = new Delivery("234", 19.79, "Main Street");
		deliveries.put(d2.getID(), d2);
		deliveries.put("235", d2);

		// add a value in another different way, using one instruction
		deliveries.put("345", new Delivery("345", 11.49, "Station Road"));

		// output the one of the deliveries
        System.out.println(deliveries.get("123"));
		System.out.println(deliveries.get("234"));

        // here the same object points to different key in the hash-map
		System.out.println(deliveries.get("235"));
		System.out.println(deliveries.get("345"));
	}
}
