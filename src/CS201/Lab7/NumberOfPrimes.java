package CS201.Lab7;

import java.util.Scanner;

public class NumberOfPrimes {
    public static void main(String[] args) {

        int i = 0;
        int number = 0;
        // empty string
        String primeNumbers = "";

        for (i = 2; i <= 100; i++)
         {
             int counter = 0;

                for (number = i; number >= 1; number--)
                {
                    if (i % number == 0)
                    {
                        counter = counter + 1;

                    }
                }
                if (counter == 2) {
                    // appended the prime numbers + i + " ";
                    primeNumbers = primeNumbers + i + " ";
                }

            }
            System.out.println(" prime numbers from 1 to 100 are :");
            System.out.println(primeNumbers);
        }

    }






