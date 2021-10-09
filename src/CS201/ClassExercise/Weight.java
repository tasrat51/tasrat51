package CS201.ClassExercise;

import java.util.Scanner;

public class Weight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the luggage Weight ");
        double weight = input.nextDouble();
        double charge;
        if (weight <= 23) {
            charge = 0.00;
            System.out.println(charge);
        } else if (weight <= 28) {
            charge = 10;
            System.out.println(charge);
        }
         else {
             charge = 10+(weight-28)*0.1;
            System.out.println(charge);
        }

      titi.sum(2,3);
    }
}