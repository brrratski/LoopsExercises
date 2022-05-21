import java.util.Scanner;

public class SalesRevenue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double unitprice = 0;
        int quantity = 0;
        double revenue = 0;
        double discount_Rate = 0, discount_Amount = 0;


        System.out.print("Enter unit price:");
        unitprice = scanner.nextDouble();

        System.out.print("Enter quantity:");
        quantity = scanner.nextInt();

        if (quantity < 100)
            revenue = unitprice * quantity;
        else if (quantity >= 100 && quantity <= 120) {
            discount_Rate = (double) 15 / 100;
            revenue = unitprice * quantity;
            discount_Amount = revenue * discount_Rate;
            revenue -= discount_Amount;
        } else if (quantity > 120) {
            discount_Rate = (double) 20 / 100;
            revenue = unitprice * quantity;
            discount_Amount = revenue * discount_Rate;
            revenue -= discount_Amount;
        }
        System.out.println("The revenue from sale:" + revenue + "$");
        System.out.println("Discount:" + discount_Amount + "$ (" + discount_Rate * 100 + "%)");

    }

}

