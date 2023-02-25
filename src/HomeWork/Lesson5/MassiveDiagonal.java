package HomeWork.Lesson5;

import java.util.Arrays;

public class MassiveDiagonal {
    public static void main(String[] args) {
        int[][] arr =
                {{1, 4, 5,},
                 {6, 8, 9,},
                 {6, 8, 8,}};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) ;
            System.out.print("\n");
            System.out.print(" " + arr[i][i]);
            System.out.print(" ");
            System.out.print(" " + arr[i][n - i - 1]);
        }

    }
}
