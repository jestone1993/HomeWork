package HomeWork.Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class MassiveTeach {
    public static void main(String[] args) {
        int arr[] = {2, 11, 22, 33, 44, 55, 66, 77};
        Scanner search = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = search.nextInt();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == num)
                arr[j] = 0;
        }
        System.out.println("" + Arrays.toString(arr));
    }
}