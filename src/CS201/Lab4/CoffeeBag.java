package CS201.Lab4;

import java.util.Scanner;

public class CoffeeBag {
    final static double PricePerPound = 5.99;
    final static double TaxRate = 0.0725;
    public static void main(String[] args) {
        double weightPerBag;
        double pricePerBag;
        double totalPrice;
        int numberOfBags;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the weight per bag");
        weightPerBag = input.nextDouble();
        System.out.println(" Weight per bag: " + weightPerBag);
        System.out.println(" Hom many bags do you need ");
        numberOfBags = input.nextInt();
        System.out.println("Number of bags sold : " + numberOfBags);
        totalPrice = weightPerBag*numberOfBags*PricePerPound;
        System.out.println(" price per pound: " + "$" +PricePerPound);
        double totalPriceWithTax = totalPrice+totalPrice*TaxRate;
        totalPriceWithTax = Math.round(totalPriceWithTax*100.0)/100.0;
        System.out.println("Sales Tax: " + TaxRate);
        System.out.println(" Total price : " + "$"+totalPriceWithTax);


    }
}
