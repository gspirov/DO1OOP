package deliveryShop;

import java.util.HashMap;

public class FoodDeliveries {
    private final HashMap<Integer, Delivery> deliveries;

    FoodDeliveries() {
        this.deliveries = new HashMap<>();
    }

    public boolean addDelivery(Delivery delivery) {
        if (!this.deliveries.containsKey(delivery.getKeyId())) {
            this.deliveries.put(delivery.getKeyId(), delivery);
            return true;
        }

        return false;
    }

    public HashMap<Integer, Delivery> getDeliveries() {
        return deliveries;
    }

    public Delivery getDelivery(int keyId) {
        if (this.deliveries.containsKey(keyId)) {
            return this.deliveries.get(keyId);
        }

        return null;
    }

    public boolean removeDelivery(int deliveryId) {
        if (this.deliveries.containsKey(deliveryId)) {
            this.deliveries.remove(deliveryId);
            return true;
        }

        return false;
    }

    public int size() {
        return this.deliveries.size();
    }

    public String toString(HashMap<Integer, Delivery> foodDeliveries) {
        StringBuilder sb = new StringBuilder();
        for (Delivery delivery : foodDeliveries.values()) {
            sb.append(delivery).append("\n");
        }
        return sb.toString();
    }
}
