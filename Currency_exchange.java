import java.util.Scanner;

class Currency_exchange{
    public static void main(String[]args) {
        
        Scanner currency = new Scanner(System.in);
        
        System.out.println("=== WELCOME TO CURRENCY CONVERTER! ===");
        System.out.println("1. INR to USD ");
        System.out.println("2. USD to INR");
        System.out.println("3. INR to JPY");
        System.out.println("4. JPY to INR");
        System.out.println("5. INR to EUR");
        System.out.println("6. EUR to INR");
        System.out.print("Enter your choice: ");
        int choice = currency.nextInt();
        
        double INR_TO_USD_RATE = 0.012;//13/07/2025
        double USD_TO_INR_RATE = 85.86;//13/07/2025
        double INR_TO_JPY_RATE = 1.72;//13/07/2025
        double JPY_TO_INR_RATE = 0.58;//13/07/2025
        double INR_TO_EUR_RATE = 0.010;//13/07/2025
        double EUR_TO_INR_RATE = 100.38;//13/07/2025
        
        if (choice == 1) {
            System.out.print("Enter the amount in INR: ");
            double INR = currency.nextDouble();
            double USD = INR * INR_TO_USD_RATE;
            System.out.println("Converted amount in USD: " +USD);
        } else if (choice == 2) {
            System.out.print("Enter the amount in USD: ");
            double USD = currency.nextDouble();
            double INR = USD * USD_TO_INR_RATE;
            System.out.println("Converted amount in INR: " +INR);
        }  else if (choice == 3) {
            System.out.print("Enter the amount in INR: ");
            double INR = currency.nextDouble();
            double JPY = INR * INR_TO_JPY_RATE;
            System.out.println("Converted amount in JPY: " +JPY);
        }  else if (choice == 4) {
            System.out.print("Enter the amount in JPY: ");
            double JPY = currency.nextDouble();
            double INR = JPY * JPY_TO_INR_RATE;
            System.out.println("Converted amount in INR: " +INR);
        }  else if (choice == 5) {
            System.out.print("Enter the amount in INR: ");
            double INR = currency.nextDouble();
            double EUR = INR * INR_TO_EUR_RATE;
            System.out.println("Converted amount in EUR: " +EUR);
        }  else if (choice == 6) {
            System.out.print("Enter the amount in EUR: ");
            double EUR = currency.nextDouble();
            double INR = EUR * EUR_TO_INR_RATE;
            System.out.println("Converted amount in INR: " +INR);
        }  else {
            System.out.println("Invalid Choice.Please enter a number between 1 and 6");
        }
        currency.close();
    }
}