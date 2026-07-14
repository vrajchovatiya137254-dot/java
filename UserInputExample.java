import java.util.Scanner; // Step 1: Import the Scanner class

public class UserInputExample {
    public static void main(String[] args) {
        // Step 2: Create a Scanner object to read from standard input (keyboard)
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Enter Your Details ---");

        // 1. Getting String input (a single word)
        System.out.print("Enter your first name: ");
        String firstName = scanner.next();

        // 2. Getting Integer input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // 3. Getting Floating-point (double) input
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        // 4. Getting Boolean input
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        /*
         * CRITICAL STEP: Clear the buffer!
         * Numeric methods do not consume the 'newline' (\n) character when you press Enter.
         * We call nextLine() once to consume it before reading an actual line of text.
         */
        scanner.nextLine();

        // 5. Getting String input (an entire line with spaces)
        System.out.print("Enter your complete address: ");
        String address = scanner.nextLine();

        // Displaying the captured values back to the user
        System.out.println("\n--- Summary of Your Inputs ---");
        System.out.println("First Name: " + firstName);
        System.out.println("Age:        " + age);
        System.out.println("GPA:        " + gpa);
        System.out.println("Student?:   " + isStudent);
        System.out.println("Address:    " + address);

        // Step 3: Close the scanner to release system resources
        scanner.close();
    }
}
