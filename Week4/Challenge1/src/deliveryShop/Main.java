package deliveryShop;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FoodDeliveries foodDeliveries = new FoodDeliveries();

        int choice;

        System.out.println("\n=== Menu ===");
        System.out.println("0 - When your order is finished!");
        for (MenuItem menuItem : MenuItem.values()) {
            if (menuItem.code > 0 && menuItem.code <= 4) {
                System.out.printf("%d - %s: £ %.2f%n", menuItem.code, menuItem.description, MoneyService.centsToWhole(menuItem.price));
            }
        }

        System.out.println("\n=== Actions ===");
        for (Action action : Action.values()) {
            if (action.code > 4 && action.code <= 8) {
                System.out.printf("%d - %s%n", action.code, action.description);
            }
        }

        while (true) {
            System.out.print("Enter your choice: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number: ");
                scanner.next();
            }

            choice = scanner.nextInt();

            MenuItem menuItem = MenuItem.fromCode(choice);

            if (menuItem != null) {
                boolean isAdded = foodDeliveries.addDelivery(new Delivery(
                    menuItem.code,
                    menuItem.price,
                    menuItem.description,
                    LocalTime.now()
                ));

                if (isAdded) {
                    System.out.printf("Added: %s (£%.2f)%n", menuItem.description, MoneyService.centsToWhole(menuItem.price));
                    continue;
                }
            }

            Action action = Action.fromCode(choice);

            if (action != null) {
                switch (action) {
                    case Action.FINISH_ORDER -> {
                        System.out.println("Thank you! Your order is finished.");
                        scanner.close();
                        return;
                    }
                    case Action.VIEW_ORDERS -> {
                        System.out.println("=== Orders ===");
                        System.out.println(foodDeliveries);
                    }
                    case Action.VIEW_NUMBER_OF_ORDERS -> {
                        System.out.println("Number of orders: " + foodDeliveries.size());
                    }
                    case Action.FIND_ORDER, Action.DELETE_ORDER -> {
                        while (true) {
                            int menuItemId = getMenuItemIdFromUserInput(scanner);

                            if (action == Action.FIND_ORDER) {
                                Delivery orderFound = foodDeliveries.getDelivery(menuItemId);

                                if (null == orderFound) {
                                    System.out.println("Delivery cannot be found. Please try again: ");
                                    continue;
                                }

                                System.out.println(orderFound);
                                break;
                            }

                            if (foodDeliveries.removeDelivery(menuItemId)) {
                                System.out.println("Order has been successfully removed.");
                                break;
                            } else {
                                System.out.println("Delivery cannot be found. Please try again: ");
                            }
                        }
                    }
                }
            } else {
                System.out.println("Invalid choice! Please enter a number between 0 and 8.");
            }
        }
    }

    public static int getMenuItemIdFromUserInput(Scanner scanner) {
        System.out.println("Order number: ");
        System.out.println();

        for (MenuItem menuItemPrompt : MenuItem.values()) {
            System.out.printf("%d - %s:%n", menuItemPrompt.code, menuItemPrompt.description);
        }

        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number: ");
            scanner.next();
        }

        return scanner.nextInt();
    }
}
