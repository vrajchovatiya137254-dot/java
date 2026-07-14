import java.util.Scanner;

public class PersonalInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Getting personal information
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter your gender: ");
        String gender = sc.nextLine();

        System.out.print("Enter your address: ");
        String address = sc.nextLine();

        System.out.print("Enter your phone number: ");
        String phone = sc.nextLine();

        // Displaying personal information
        System.out.println("\n--- Personal Information ---");
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Gender  : " + gender);
        System.out.println("Address : " + address);
        System.out.println("Phone   : " + phone);

        sc.close();
    }
}
