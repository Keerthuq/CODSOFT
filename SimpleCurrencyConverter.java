import java.util.Scanner;

public class SimpleCurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Currency Converter!");

        System.out.print("Enter the base currency (e.g., USD, EUR): ");
        String baseCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Enter the target currency (e.g., USD, EUR): ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Enter the amount to convert from " + baseCurrency + " to " + targetCurrency + ": ");
        double amountToConvert = scanner.nextDouble();

        // Assuming conversion rate is 1 for simplicity
        double convertedAmount = amountToConvert;

        System.out.println(amountToConvert + " " + baseCurrency + " = " + convertedAmount + " " + targetCurrency);

        scanner.close();
    }
}

