import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to currency converter!");
        System.out.println("1. USD to Rupee");
        System.out.println("2. Rupee to USD");
        System.out.println("3. Euro to Rupee");
        System.out.println("4. Rupee to Euro");
        System.out.print("Enter your choice (1 or 2 or 3 or 4): ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.print("Enter the amount in USD: ");
            double USD = scanner.nextDouble();
            double Rupee = usdToRupee(USD);
            System.out.println("Converted amount in Rupee: " + Rupee);
        } else if (choice == 2) {
            System.out.print("Enter the amount in Rupee: ");
            double Rupee = scanner.nextDouble();
            double USD = rupeeToUsd(Rupee);
            System.out.println("Converted amount in USD: " + USD);
        } else if (choice == 3) {
            System.out.print("Enter the amount in Euro: ");
            double Euro = scanner.nextDouble();
            double Rupee = euroToRupee(Euro);
            System.out.println("Converted amount in Rupee: " + Rupee);
        } else if (choice == 4) {
            System.out.print("Enter the amount in Rupee: ");
            double Rupee = scanner.nextDouble();
            double Euro = rupeeToEuro(Rupee);
            System.out.println("Converted amount in Euro: " + Euro);
        } else {
            System.out.println("Invalid choice. Please select 1 or 2 or 3 or 4.");
        }
        scanner.close();
    }
    public static double usdToRupee(double USD) {
        return USD * 83.47;
    }
    public static double rupeeToUsd(double Rupee) {
        return Rupee * 0.0119804;
    }
    public static double euroToRupee(double Euro) {
        return Euro * 89.10;
    }
    public static double rupeeToEuro(double Rupee) {
        return Rupee * 0.0113;
    }
}
