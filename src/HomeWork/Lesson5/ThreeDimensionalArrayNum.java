package ClassLesson5;

import java.util.Scanner;

public class ThreeDimensionalArrayNum {
    public static void main(String[] args) {

        System.out.println("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int numbs = scan.nextInt();


        int[][][] arr =
                {{{1, 4, 5}, {6, 7, 8, 5}, {8, 9, 10}},
                        {{11, 12, 14}, {11, 44, 55}, {98, 54, 13}}};


        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("\t");
                for (int k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k] += numbs;

                    System.out.print(" " + arr[i][j][k]);

                }


            }
        }
    }
}