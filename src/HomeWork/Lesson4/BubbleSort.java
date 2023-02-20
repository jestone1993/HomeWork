package HomeWork.Lesson4;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {


        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);


        }
        System.out.println("Неотсортированный массив: " + Arrays.toString(arr));
        int swap;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            count++;

            for (int k = 0; k < arr.length - 1; k++) {
                if (arr[k] > arr[k + 1]) {
                    swap = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = swap;
                }

            }
            System.out.println(count + "- -" + "Отсортированный массив" + Arrays.toString(arr));
        }

    }
}