package CS201.Lab7;

import CS201.ClassExercise.NestedLoop;

import javax.imageio.stream.ImageInputStream;

public class NumbersTable {
    public void print() {

        int num = 10;
        for (int raw = 0; raw < 4; raw++) {

            for (int column = 0; column < 10; column++) {

                System.out.print(num + column + "  ");
            }
            num = num + 10;
            System.out.println(" ");
        }

    }

    public static void main(String[] args) {

        NestedLoop table = new NestedLoop();
        table.print();

    }
}



