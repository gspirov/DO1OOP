package deliveryShop;

public class MoneyService {
    public static double centsToWhole(int cents) {
        return cents / 100.0;
    }

    public static int wholeToCents(double whole) {
        return (int) Math.round(whole * 100);
    }
}
