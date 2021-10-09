package CS201.Lab2;

import java.util.Scanner;

public class HomeWQ1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter firstname ");
        String firstname = input.next();
        System.out.println(" enter middle name ");
        String middlename = input.next();
        System.out.println("Enter last name");
        String lastname = input.next();
        System.out.println(firstname + " " +  middlename.charAt(0) + ". " + " " + lastname);
        input.close();
        }
     }