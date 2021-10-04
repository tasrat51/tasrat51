package CS201.Lab4;

import java.util.Scanner;

public class WeightConverter {
    private static final double MOONS_GRAVITY = 0.167;

    public static void  WeightConvert(double earthWeight){
        double  weightOnMoon = earthWeight*MOONS_GRAVITY;
        System.out.println(weightOnMoon);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight");
        double w = input.nextDouble();
        WeightConvert(w);

    }
}
