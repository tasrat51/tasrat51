package CS201.Quizes;

import java.util.Scanner;

public class Quiz4 {
    public static void printPriceCategory() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of price");
        int price = input.nextInt();
        if (price >=220000) {
            System.out.println(" price is high");
        } else if (price > 70000) {
            System.out.println("Price is medium");
        }
        else
        System.out.println(" Price is low");

    }

    public static void main(String[] args) {
        printPriceCategory();
    }


    }




