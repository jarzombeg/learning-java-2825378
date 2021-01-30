import java.util.Scanner;

public class Main {

    public static void calculateTotalMealPrice(double listedMealPrice,
                                               double tipRate,
                                               double taxRate){

        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tax + tip;

        System.out.println("Your total meal price is " + result);
    }
    public static void main(String[] args) {

        //My code
       /* System.out.println("What is the price of the meal?");
        Scanner listedMealPriceScanner = new Scanner(System.in);
        double listedMealPrice = listedMealPriceScanner.nextDouble();
        System.out.println("What is the tip rate?");
        Scanner tipRateScanner = new Scanner(System.in);
        double tipRate = tipRateScanner.nextDouble();
        System.out.println("What is the tax rate?");
        Scanner taxRateScanner = new Scanner(System.in);
        double taxRate = taxRateScanner.nextDouble();

        calculateTotalMealPrice(listedMealPrice, tipRate, taxRate);*/

        // Remove below code when uncommenting above
        calculateTotalMealPrice(100,.20,.08);

    }
}
