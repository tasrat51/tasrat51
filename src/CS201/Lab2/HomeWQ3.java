package CS201.Lab2;

import java.util.Scanner;

public class HomeWQ3 {
    public static void main(String[] args) {
        String word;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any word");
        word = input.next();
        int n = word.length() /2;
        System.out.println(word.charAt(n));
        input.close();
    }
}

