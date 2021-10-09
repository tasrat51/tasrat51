package CS201.Lab7;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println(" Enter a num");
        int num = input.nextInt();

        int t = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                t = t + i;
            }
        }
        if (t == num) {
            System.out.println(num + " is a perfect number");
        } else {
            System.out.println(num + " is not perfect number");
        }
    }
}
