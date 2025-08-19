package erp;
import java.util.*;
public class CredentialsGenerator {
       public static String generateEmail(String firstName, String lastName, String department) {
        return firstName.toLowerCase() + lastName.toLowerCase() + "@" + department.toLowerCase() + ".skit.ac.in";
    }
    public static String generatePassword(int length) {
        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialChars = "!@#$%^&*()-_=+<>?";

        String values = capitalLetters + smallLetters + numbers + specialChars;
        Random random = new Random();
        char[] password = new char[length];

        for (int i = 0; i < length; i++) {
            password[i] = values.charAt(random.nextInt(values.length()));
        }
        return new String(password);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();

        System.out.println("Departments:");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resources");
        System.out.println("4. Legal");
        System.out.print("Enter choice : ");
        int choice = sc.nextInt();

        String department = "";
        switch (choice) {
            case 1: department = "tech"; break;
            case 2: department = "admin"; break;
            case 3: department = "hr"; break;
            case 4: department = "legal"; break;
            default: System.out.println("Invalid choice!"); return;
        }

        String email = generateEmail(firstName, lastName, department);
        String password = generatePassword(10);

        System.out.println("\n--- Generated Credentials ---");
        System.out.println("Email ID : " + email);
        System.out.println("Password : " + password);
        sc.close();
    }
}
