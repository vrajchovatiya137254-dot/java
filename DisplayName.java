import java.util.Scanner; // Import the Scanner class to read user input

public class DisplayName {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");

        // Read the entire line of text entered by the user
        String name = scanner.nextLine();

        // Display the name back to the user
        System.out.println("Hello, " + name + "!");

        // Close the scanner to release resources
        scanner.close();
    }
}
