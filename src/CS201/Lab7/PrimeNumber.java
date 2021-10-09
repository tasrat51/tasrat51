package CS201.Lab7;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        int i = 2;
        for ( ; i < 20; i++) {
            if (num % i == 0 && num != i) {
                System.out.println(num + " is not a prime number.");
                break;
            }
        }



        if (i==20) {
            System.out.println(num + " is a prime number.");
        }


    }
}