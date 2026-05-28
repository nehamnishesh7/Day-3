import java.util.Scanner;

public class RestaurantOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Main Menu ---");
        System.out.println("1. Veg");
        System.out.println("2. Non-Veg");
        System.out.print("Select Category (1-2): ");
        int category = scanner.nextInt();

        int pricePerItem = 0;
        String itemName = "";

        switch (category) {
            case 1: // Veg
                System.out.println("\n--- Veg Menu ---");
                System.out.println("1. Fried Rice (₹150)");
                System.out.println("2. Noodles (₹120)");
                System.out.print("Select Item: ");
                int vegChoice = scanner.nextInt();
                switch (vegChoice) {
                    case 1: itemName = "Fried Rice"; pricePerItem = 150; break;
                    case 2: itemName = "Noodles"; pricePerItem = 120; break;
                    default: 
                        System.out.println("Invalid Selection"); 
                        return;
                }
                break;

            case 2: // Non-Veg
                System.out.println("\n--- Non-Veg Menu ---");
                System.out.println("1. Chicken Biryani (₹250)");
                System.out.println("2. Grill Chicken (₹300)");
                System.out.print("Select Item: ");
                int nonVegChoice = scanner.nextInt();
                switch (nonVegChoice) {
                    case 1: itemName = "Chicken Biryani"; pricePerItem = 250; break;
                    case 2: itemName = "Grill Chicken"; pricePerItem = 300; break;
                    default: 
                        System.out.println("Invalid Selection"); 
                        return;
                }
                break;

            default:
                System.out.println("Invalid Selection");
                return;
        }

        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();
        double totalBill = pricePerItem * quantity;
        
        scanner.nextLine(); // consume newline
        
        System.out.print("Enter Member Status (Gold/Silver/Normal): ");
        String status = scanner.nextLine().toLowerCase();

        // Apply Discounts based on status
        switch (status) {
            case "gold":
                totalBill = totalBill * 0.80; // 20% discount
                // Extra Twist: Free dessert for high-value Gold customers
                if (totalBill > 2000) {
                    System.out.println("\n🎉 Congratulations! You get a FREE DESSERT with your order!");
                }
                break;
            case "silver":
                totalBill = totalBill * 0.90; // 10% discount
                break;
            case "normal":
                // 0% discount
                break;
            default:
                System.out.println("Unknown member status. No discount applied.");
        }

        System.out.println("\n--- Order Summary ---");
        System.out.println("Item: " + itemName + " x " + quantity);
        System.out.println("Final Bill to pay: ₹" + totalBill);
        
        scanner.close();
    }
}