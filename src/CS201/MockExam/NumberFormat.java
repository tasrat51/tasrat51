package CS201.MockExam;

import java.util.Scanner;

public class NumberFormat {
    public static void main(String[] args) {
        long num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter phone number 10 digits");
        num = input.nextLong();
        String phoneNumber = String.valueOf(num);
        phoneNumber = " ";
        if (phoneNumber.length()!= 10) {
            System.out.println("Error");
        }
                else
        {
            String text1 = phoneNumber.substring(0, 3);
            String text2 = phoneNumber.substring(2, 6);
            String text3 = phoneNumber.substring(6,10);
            System.out.println("phone Number" + text1+"-" + text2+ "-" + text3);
        }

    }

}






