import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class CurrencyConverter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String sourceCurrency,targetCurrency;
        double amount,convertedAmt;
        Map<String, Double> exchangeRates = new HashMap<>();
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.92);
        exchangeRates.put("GBP", 0.79);
        exchangeRates.put("JPY", 142.12);
        exchangeRates.put("INR", 83.04);

        System.out.print("Enter source currency (USD, EUR, GBP, JPY, INR): ");
        sourceCurrency = sc.next().toUpperCase();

        System.out.print("\nEnter target currency (USD, EUR, GBP, JPY, INR): ");
        targetCurrency = sc.next().toUpperCase();

        System.out.print("\nEnter amount to convert: ");
        amount = sc.nextDouble();

        convertedAmt = convertCurrency(amount, exchangeRates.get(targetCurrency) / exchangeRates.get(sourceCurrency));

        System.out.println("\n\tConverted amount: " + convertedAmt + " " + targetCurrency + "\n");
        sc.close();
    }
    private static double convertCurrency(double amt, double exchangeRate) {
        return amt * exchangeRate;
    }
}