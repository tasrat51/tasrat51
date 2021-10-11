package CS201.Lab7;

public class LoopStatements {
    public static void main(String[] args) {
        // using for loop to get the sum of numbers
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
          //  System.out.println(i);

            sum = (sum + i);
        }
            System.out.println(" the sum of these numbers = " + sum);

        //using while to get sum of numbers
        int s = 0, k = 1;
        while (k <=100) {
            System.out.println(k);
            k++;
           // s = s + k;
        }
            System.out.println(" sum of the numbers = " + sum);
        // using do while to get the sum of numbers
        int su = 0, m= 1;
        do{
             su= su+m;
             m++;
            System.out.println(m);
        }while(m<=100);
        System.out.println( " sum of the numbers =  " + su);

      // using for loop to get sum of product

        int number = 5;
        int product;
        int sums = 0;
        for (int i = 1; i <= 10; i++) {
            product = number * i;
            System.out.println(number + " * " + i + " = " + product);
            sums = sums + product;
        }
        System.out.println(" the sum of all product is " + sums);

       // using while to get sum of product
        int i = 1, num = 5;
        int prod;
        while (i <= 10) {

            prod = num * i;
            System.out.println(num + " * " + i + " = " + prod);
            i++;
        }
        System.out.println(" the sum of product is " + sums);

        // using  do while loop to get the sum of product

        int j =1, n=5, sm = 0;
        int prdt;
        do {
            prdt = n * j;
            System.out.println(n + " * " + j + " = " + prdt);
            sm = sm + prdt;
            j++;
        } while( j<=10);
        System.out.println(" the sum of these product numbers is " + sm);








        }

        }









