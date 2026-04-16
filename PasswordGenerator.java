import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*";

        String allChars = "";

        System.out.print("Enter password length: ");
        int length = sc.nextInt();

        System.out.print("Include uppercase? (y/n): ");
        if (sc.next().equalsIgnoreCase("y")) {
            allChars += upper;
        }

        System.out.print("Include lowercase? (y/n): ");
        if (sc.next().equalsIgnoreCase("y")) {
            allChars += lower;
        }

        System.out.print("Include numbers? (y/n): ");
        if (sc.next().equalsIgnoreCase("y")) {
            allChars += numbers;
        }

        System.out.print("Include symbols? (y/n): ");
        if (sc.next().equalsIgnoreCase("y")) {
            allChars += symbols;
        }

        if (allChars.isEmpty()) {
            System.out.println("❌ Please select at least one character type.");
            return;
        }

        String password = "";

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(allChars.length());
            password += allChars.charAt(index);
        }

        System.out.println("\n🔐 Generated Password: " + password);

        sc.close();
    }
}