package CS201.Lab3;

import java.util.Scanner;

public class HWQ2 {

    public static void main(String[] args) {
       // double cm;
        double inch;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value in centmeter");
        double cm = input.nextDouble();
        double inches = cm/2.54;
       //System.out.println(inches + " inches");
        int  ft  = (int) inches/12;
       System.out.println(ft + " feet");
       inch = inches%12;
       System.out.println( inch + " inches");
       input.close();
    }
}

