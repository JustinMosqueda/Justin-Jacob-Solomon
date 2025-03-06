import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, Integer> inventory = new HashMap<>();
        HashMap<String, Double> prices = new HashMap<>();

       
        inventory.put("Laptop", 10);
        inventory.put("Mouse", 50);
        inventory.put("Keyboard", 30);

        prices.put("Laptop", 1200.00);
        prices.put("Mouse", 25.50);
        prices.put("Keyboard", 50.76);

        while (true) {
            System.out.println("\nBayot Inventory Management System");
            System.out.println("1. Add Item");
            System.out.println("2. Set Quantity");
            System.out.println("3. Display Inventory");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = input.nextInt();
            input.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Justin item name: ");
                    String name = input.nextLine();
                    System.out.print("Justin item price: ");
                    double price = input.nextDouble();
                    System.out.print("Justin item quantity: ");
                    int quantity = input.nextInt();

                    inventory.put(name, inventory.getOrDefault(name, 0) + quantity);
                    prices.put(name, price);
                    System.out.println("Item added successfully.");
                    break;

                case 2:
                    System.out.print("Justin item name: ");
                    String itemjustin = input.nextLine();
                    if (inventory.containsKey(itemjustin)) {
                        System.out.print("Justin new quantity: ");
                        int newquantityjustin = input.nextInt();
                        if (newquantityjustin >= 0) {
                            inventory.put(itemjustin, newquantityjustin);
                            System.out.println("Quantity of " + itemjustin + " set to " + newquantityjustin);
                        }
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;

                case 3:
                    System.out.printf("\n%-15s %-10s %-10s%n", "Item", "Price", "Quantity");
                    System.out.println("-----------------------------------------");
                    for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
                        System.out.printf("%-15s %-9.2f %-10d%n",
                                entry.getKey(), prices.get(entry.getKey()), entry.getValue());
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                 

                default:
                    System.out.println("Invalid choice, Bayot ka :p");
            }
        }
    }
}
