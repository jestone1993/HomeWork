package HomeWork.Lesson5;

import java.util.Arrays;

public class MassiveSort {
    public static void main(String[] args) {
        int arr[][] = {{1, 3, 40, 90, 7},
                {6, 88, 5, 23}};
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
            System.out.printf(Arrays.toString(arr[i]));
        }
    }

}
