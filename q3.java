import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Connection Types ---");
        System.out.println("1. Domestic");
        System.out.println("2. Commercial");
        System.out.println("3. Industrial");
        System.out.print("Select Connection Type (1-3): ");
        int choice = scanner.nextInt();

        System.out.print("Enter units consumed: ");
        int units = scanner.nextInt();
        double bill = 0;

        switch (choice) {
            case 1: 
                if (units <= 100) {
                    bill = 0; 
                } else if (units <= 300) {
                    bill = (units - 100) * 5;
                } else {
                    bill = (200 * 5) + ((units - 300) * 8);
                }
                break;
                
            case 2: 
                if (units < 200) {
                    bill = units * 10;
                } else {
                    bill = units * 15;
                }
                break;
                
            case 3:
                bill = units * 20;
                if (units > 500) {
                    System.out.print("Is power factor good? (true/false): ");
                    boolean goodPowerFactor = scanner.nextBoolean();
                    if (goodPowerFactor) {
                        bill = bill * 0.90;
                    }
                }
                break;
                
            default: 
                System.out.println("Invalid Connection Type");
                System.exit(0);
        }

        System.out.println("Total Electricity Bill: ₹" + bill);
        scanner.close();
    }
}
