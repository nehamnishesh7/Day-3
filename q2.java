import java.util.Scanner;

public class SmartLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        boolean loggedIn = false;

        while (attempts < 3) {
            System.out.print("Enter Username: ");
            String username = scanner.nextLine();
            
            System.out.print("Enter Password: ");
            String password = scanner.nextLine();

            if (username.equals("admin")) {
                if (password.equals("Java@123")) {
                    loggedIn = true;
                    break; // Successful login, exit the loop
                } else {
                    // Extra twist: password hint
                    if (password.startsWith("Java") && password.endsWith("123")) {
                        System.out.println("Almost correct password.");
                    } else {
                        System.out.println("Incorrect password.");
                    }
                }
            } else {
                System.out.println("Incorrect username.");
            }
            attempts++;
            System.out.println("Attempts remaining: " + (3 - attempts) + "\n");
        }

        // Twist: Account blocked after 3 failed attempts
        if (!loggedIn) {
            System.out.println("Account Blocked.");
        } else {
            // Proceed to OTP
            System.out.print("Login successful. Enter OTP: ");
            int otp = scanner.nextInt();
            
            if (otp >= 1000 && otp <= 9999) {
                System.out.println("Authentication Successful. Welcome!");
            } else {
                System.out.println("Invalid OTP.");
            }
        }
        
        scanner.close();
    }
}