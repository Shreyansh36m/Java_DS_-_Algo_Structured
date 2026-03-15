package Java_DS_Algo;

import java.util.Scanner;

public class ProfitAndLoss {
    /* If cost price and selling price of an item is input
        through the keyboard , write a program to determine whether the seller
        has made a profit or incurred a loss  or no profit no loss.Also determined
        how much profit he made or how much loss he incurred.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price: ");
        double cp = sc.nextDouble();
        System.out.println("Enter the selling price: ");
        double sp = sc.nextDouble();

        if (cp > sp ) {
            System.out.println("The merchant is in loss!");
            double loss = (cp-sp)/cp * 100;
            System.out.println("The loss is "+loss+"%");
        } else if (sp == cp) {
            System.out.println("No profit/loss");
        } else {
            System.out.println("Hurray!Profit");
            double profit = (sp-cp)/cp * 100;
            System.out.println("The profit is "+profit+"%");
        }
    }
}
