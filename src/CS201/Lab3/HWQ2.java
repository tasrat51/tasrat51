package CS201.Lab3;

import java.util.Scanner;

public class HWQ2 {

    public static void main(String[] args) {
        double cm;
        double inch;
        double feet;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value in centmeter");
       cm = input.nextDouble();
       inch = cm*0.03937;
       feet = cm*0.0328;
       System.out.println("inch is: " + inch);
       System.out.println("feet is: " + feet);
       input.close();
    }
}

