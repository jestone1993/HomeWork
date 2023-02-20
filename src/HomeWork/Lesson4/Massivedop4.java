package HomeWork.Lesson4;

import java.util.Arrays;

public class Massivedop4 {
    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 6, 7, 8, 10};
        System.out.printf(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 1)
                arr[i] = 0;

        }
        System.out.println(Arrays.toString(arr));
    }
}