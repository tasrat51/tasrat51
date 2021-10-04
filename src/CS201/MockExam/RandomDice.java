package CS201.MockExam;

import java.util.Random;
import java.util.Scanner;

public class RandomDice {
       static Random random = new Random();
       public static void main(String[] args) {
         int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of roles");
        num = input.nextInt();
        rollDice(num);
    }
    public static void rollDice(int nRolls){
        for(int i = 0; i<nRolls; i++){
            int Dice1 = random.nextInt(6)+1;
            int Dice2 = random.nextInt(2)+5;
          //  System.out.println(Dice1);
            System.out.println(Dice2);



        }
    }

}
