import java.util.Scanner;

public class AdmissionPredictor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Maths marks: ");
        int maths = scanner.nextInt();
        
        System.out.print("Enter Physics marks: ");
        int physics = scanner.nextInt();
        
        System.out.print("Enter Chemistry marks: ");
        int chemistry = scanner.nextInt();

        double average = (maths + physics + chemistry) / 3.0;

        // Primary Twist: Auto rejection if any subject is below 35
        if (maths < 35 || physics < 35 || chemistry < 35) {
            System.out.println("Admission Status: Rejected (Failed in one or more subjects)");
            return;
        }

        // Eligibility Check
        boolean isEligible = (maths >= 70 && physics >= 60 && chemistry >= 60) || (average >= 80);

        if (isEligible) {
            System.out.println("Admission Status: Eligible");
            
            // Extra Twist: Scholarship Check
            if (maths > 90 && physics > 90 && chemistry > 90) {
                System.out.println("Scholarship Status: Eligible for Scholarship!");
            } else {
                System.out.println("Scholarship Status: Not Eligible");
            }
        } else {
            System.out.println("Admission Status: Not Eligible");
        }
        
        scanner.close();
    }
}