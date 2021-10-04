package CS201.Lab3;

import java.util.Scanner;

public class HWQ5 {

    public static void main(String[] args) {
        int bornYear;
        int currentYear;
        int age;
        Scanner input = new Scanner(System.in);
        System.out.println(" You were born in ");
        bornYear = input.nextInt();
        currentYear = 2021;
        age = (currentYear - bornYear);
        System.out.println(" You will be " + age + " this year ");

    }
}