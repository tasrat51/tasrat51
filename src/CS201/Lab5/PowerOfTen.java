package CS201.Lab5;

import java.util.Scanner;

public class PowerOfTen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the power of 10");
        int power= input.nextInt();

        if(power==6)
            System.out.println("million");
        else if(power==9)
            System.out.println("Billion");
        else if(power==12)
            System.out.println("Trillion");
        else if(power==15)
            System.out.println("Quadrillion");
        else if(power==18)
            System.out.println("Quintillion");
        else if(power==21)
            System.out.println("sextillion");
        else if(power==30)
            System.out.println("Nonillion");
        else if(power==100)
            System.out.println("Googol");
    }
}






