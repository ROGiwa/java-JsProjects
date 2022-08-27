package InvestmentEarnings;
import java.util.Scanner;
import java.text.*;
import java.util.*;

public class InvestmentEarningSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your price per share: ");
        double buyingPrice = scanner.nextDouble();
        int day = 1;
        double closingPrice = 0.1;
        Currency us = Currency.getInstance(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        while (true){
            System.out.println("Enter the closing price for day " + day + " (any negative value to leave: ");
            closingPrice = scanner.nextDouble();
            if (closingPrice < 0.0) break;

            double earnings = closingPrice - buyingPrice;
            double percent = Double.parseDouble(decimalFormat.format((earnings / closingPrice ) * 100));
            if (earnings > 0.0) {
                System.out.println("After day " + day + ", you earned " + us.getSymbol() + decimalFormat.format(earnings)  + " per share");
                System.out.println("That is an increase of " + percent + "%" );
            }
            else if (earnings < 0.0) {
                System.out.println("After day " + day + ", you lost " + us.getSymbol() + decimalFormat.format(-earnings) + " per share");
                System.out.println("That is a decrease of " + percent + "%" );
            }
            else {
                System.out.println("After day " + day + ", you lost have no earnings");
            }
            day++;
        }
        scanner.close();

    }
}
