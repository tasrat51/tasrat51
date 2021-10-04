package CS201.ClassExercise;

import java.util.Scanner;

public class CalculatesTaxRate {
    public static final double TaxRate = 0.1;
    public static final double TaxRate2 = 0.18;

    public static void calculateTaxRate() {
        Scanner input = new Scanner(System.in);
        System.out.println(" Are you single or Married");
         String statue = input.nextLine();
        System.out.println("Enter your salary");
        double salary = input.nextDouble();
        if( salary <= 40000 || salary <= 60000) {
            System.out.println(" your tax is " + salary * TaxRate);
        }
         else if ( salary>40000 || salary>60000){

            System.out.println(salary*TaxRate2);
         }
              else{

            System.out.println("out of range");
        }
    }

    public static void main(String[] args) {
         calculateTaxRate();
    }
}