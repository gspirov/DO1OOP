package deliveryShop;

import java.time.LocalTime;

public class Delivery {
    private int keyId;
    private int price;
    private String foodOrder;
    private LocalTime timeOfOrder;

    public Delivery(int keyId, int price, String foodOrder, LocalTime timeOfOrder) {
        this.keyId = keyId;
        this.price = price;
        this.foodOrder = foodOrder;
        this.timeOfOrder = timeOfOrder;
    }

    public int getKeyId() {
        return this.keyId;
    }

    public void setKeyID(int keyId) {
        this.keyId = keyId;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setFoodOrder(String foodOrder) {
        this.foodOrder = foodOrder;
    }

    public void setTimeOfOrder(LocalTime timeOfOrder) {
        this.timeOfOrder = timeOfOrder;
    }

    public String toString() {
        return "KeyID: " + keyId + ", Price: £" + MoneyService.centsToWhole(price) + " , Food choice: " + foodOrder + ", Time of order: " + timeOfOrder.format(java.time.format.DateTimeFormatter.ofPattern("HH:mm")) + ".";
    }
}