package CS201.Lab2;

import java.util.Scanner;

public class HomeWQ2 {
    public static void main(String[] args) {
        String word;
        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter any word");
        word = input.nextLine();
        System.out.println(word.length());
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(word.length() - 1));
        input.close();
    }
}