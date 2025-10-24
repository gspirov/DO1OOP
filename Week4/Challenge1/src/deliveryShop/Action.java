package deliveryShop;

public enum Action {
    FINISH_ORDER(0, "When your order is finished!"),
    VIEW_ORDERS(5, "View orders!"),
    VIEW_NUMBER_OF_ORDERS(6, "View number of orders!"),
    FIND_ORDER(7, "Find order!"),
    DELETE_ORDER(8, "Delete order!");

    public final int code;
    public final String description;

    Action(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public static Action fromCode(int code) {
        for (Action action : values()) {
            if (action.code == code) {
                return action;
            }
        }
        return null;
    }
}
