import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Accepting different types of input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter your grade: ");
        char grade = sc.next().charAt(0);

        // Displaying the entered values
        System.out.println("\n--- User Details ---");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Salary : " + salary);
        System.out.println("Grade  : " + grade);

        sc.close();
    }
}
