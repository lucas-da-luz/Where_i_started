// Asking for the user his personal informations

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------- User Registration -------");

        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();

        // Contact Loop
        String formattedContact = null;
        while (formattedContact == null) {
            System.out.print("Enter contact number: ");
            String contactInput = scanner.nextLine();
            formattedContact = formatPhone(contactInput);
            if (formattedContact == null) {
                System.out.println("❌ Invalid contact number! Please enter 10 or 11 digits.");
            }
        }

        // CPF Loop with Official Mathematical Check
        String formattedCpf = null;
        while (formattedCpf == null) {
            System.out.print("Enter CPF: ");
            String cpfInput = scanner.nextLine();
            formattedCpf = formatCpf(cpfInput);
            if (formattedCpf == null) {
                System.out.println("❌ Invalid CPF! Enter a valid 11-digit CPF.");
            }
        }

        scanner.close();

        System.out.println("\n------ Registered Information ------");
        System.out.println("Name:    " + name);
        System.out.println("Contact: " + formattedContact);
        System.out.println("CPF:     " + formattedCpf);
    }

    // --- HELPER METHODS MUST BE INSIDE THE CLASS ---

    public static String formatPhone(String phone) {
        if (phone == null) return null;

        String digits = phone.replaceAll("\\D", "");

        if (digits.length() == 11) {
            return digits.replaceAll("(\\d{2})(\\d{5})(\\d{4})", "($1) $2-$3");
        } else if (digits.length() == 10) {
            return digits.replaceAll("(\\d{2})(\\d{4})(\\d{4})", "($1) $2-$3");
        }

        return null;
    }

    public static String formatCpf(String cpf) {
        if (cpf == null) return null;

        String digits = cpf.replaceAll("\\D", "");

        if (digits.length() != 11 || digits.matches("(\\d)\\1{10}")) {
            return null;
        }

        if (!hasValidCpfDigits(digits)) {
            return null;
        }

        return digits.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
    }

    private static boolean hasValidCpfDigits(String digits) {
        int[] numbers = new int[11];
        for (int i = 0; i < 11; i++) {
            numbers[i] = Character.getNumericValue(digits.charAt(i));
        }

        // Check first verification digit
        int sum1 = 0;
        for (int i = 0; i < 9; i++) {
            sum1 += numbers[i] * (10 - i);
        }
        int remainder1 = 11 - (sum1 % 11);
        int digit1 = (remainder1 >= 10) ? 0 : remainder1;

        if (digit1 != numbers[9]) return false;

        // Check second verification digit
        int sum2 = 0;
        for (int i = 0; i < 10; i++) {
            sum2 += numbers[i] * (11 - i);
        }
        int remainder2 = 11 - (sum2 % 11);
        int digit2 = (remainder2 >= 10) ? 0 : remainder2;

        return digit2 == numbers[10];
    }
}
