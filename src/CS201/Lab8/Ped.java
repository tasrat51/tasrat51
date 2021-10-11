package CS201.Lab8;

import java.util.Scanner;

public class Ped {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = input.nextLine();
        while(word !=""){
            Ped.pal(word);
        }System.out.println("Enter the word");
        word=input.nextLine();
    }

    public static void pal(String word){String reversed="";
        for (int i=(word.length()-1) ; i>=0 ; i--) {
            reversed+=(word.charAt(i));
        }if(reversed.equalsIgnoreCase(word))
            System.out.println("its a palindrome");
        else
            System.out.println("its not a palindrome");
    }
}

