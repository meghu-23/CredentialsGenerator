package erp;
import java.util.*;

public class CredentialsGenerator {
    
    public static String generateEmail(String first, String last, String department) {
        return first.toLowerCase() + last.toLowerCase() + "@" + department + ".skit.ac.in";
    }
    
    public static String generatePassword(int length) {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String special = "!@#$%^&*()_+";
        String allChars = upper + lower + digits + special;

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        password.append(upper.charAt(random.nextInt(upper.length())));
        password.append(lower.charAt(random.nextInt(lower.length())));
        password.append(digits.charAt(random.nextInt(digits.length())));
        password.append(special.charAt(random.nextInt(special.length())));

        for (int i = 4; i < length; i++) {
            password.append(allChars.charAt(random.nextInt(allChars.length())));
        }

        List<Character> chars = new ArrayList<>();
        for (char c : password.toString().toCharArray()) chars.add(c);
        Collections.shuffle(chars);

        StringBuilder finalPassword = new StringBuilder();
        for (char c : chars) finalPassword.append(c);

        return finalPassword.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String first = sc.next();
        System.out.print("Enter Last Name: ");
        String last = sc.next();

        String[] departments = {"cse","ise","aiml","mechanical"};
        System.out.println("Choose Department:");
        for (int i = 0; i < departments.length; i++) {
            System.out.println((i+1) + ". " + departments[i].toUpperCase());
        }

        int choice = sc.nextInt();
        String department = (choice >= 1 && choice <= departments.length) 
                            ? departments[choice-1] 
                            : "general";

        String email = generateEmail(first, last, department);
        String password = generatePassword(8);

        System.out.println("\nGenerated Credentials:");
        System.out.println("Email    --> " + email);
        System.out.println("Password --> " + password);

        sc.close();
    }
}

