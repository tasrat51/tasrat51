package CS201.Lab3;

import java.util.Scanner;

public class HWQ3 {
    public static void main(String[] args) {
        int celsius;
        double fahrenheit;
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter temperature in celsius ");
        celsius = input.nextInt();
        fahrenheit = (1.8 * celsius + 32);
        System.out.println( fahrenheit+ " Fahrenheit " );
        input.close();

    }
}