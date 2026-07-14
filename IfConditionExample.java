import java.util.Scanner;

public class IfConditionExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get a number from the user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Using if condition
        if (num > 0) {
            System.out.println("The number is Positive.");
        }

        sc.close();
    }
}
