package deliveryShop;

public enum MenuItem {
    BURGER_AND_FRIES(1,"Burger and fries", 650),
    CHEESE_BURGER_AND_FRIES(2, "Cheese Burger and fries", 750),
    CHICKEN_AND_FRIES(3, "Chicken and fries", 800),
    BEEF_AND_FRIES(4, "Beef and fries", 700);

    public final int code;
    public final String description;
    public final int price;

    MenuItem(int code, String description, int price) {
        this.code = code;
        this.description = description;
        this.price = price;
    }

    public static MenuItem fromCode(int code) {
        for (MenuItem action : values()) {
            if (action.code == code) {
                return action;
            }
        }
        return null;
    }
}
