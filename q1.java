import java.util.Scanner;

public class BonusChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Years of Experience: ");
        int years = scanner.nextInt();
        
        System.out.print("Enter Attendance Percentage: ");
        double attendance = scanner.nextDouble();
        
        System.out.print("Enter Performance Rating (1-5): ");
        int rating = scanner.nextInt();

        if (attendance < 60) {
            System.out.println("Not Eligible: Attendance too low.");
            return;
        }

        if (years > 3 && attendance > 85) {
            int bonus = 0;
            
            switch (rating) {
                case 5:
                    bonus = 50000;
                    break;
                case 4:
                    bonus = 30000;
                    break;
                case 3:
                    bonus = 10000;
                    break;
                default:
                    System.out.println("Eligible, but rating too low for a bonus.");
                    return;
            }
            
            System.out.println("Eligible!");
            System.out.println("Bonus Amount: ₹" + bonus);
            
        } else {
            System.out.println("Not Eligible: Does not meet experience or attendance criteria.");
        }
        
        scanner.close();
    }
}
