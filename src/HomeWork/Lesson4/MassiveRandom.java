package HomeWork.Lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MassiveRandom {
    public static void main(String[] args) {
        System.out.println("Введите размер массива: ");
        Scanner scan = new Scanner(System.in);
        int mass = scan.nextInt();
        int arr[] = new int[mass];
        int min = arr[0];
        int max = arr[0];
        int sum = 0;
        double avg;
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            sum += arr[i];
            if (arr[i] < min)
                min = arr[i];

            if (arr[i] > max)

                max = arr[i];


        }
        avg = (double) sum / mass;
        System.out.println(Arrays.toString(arr));
        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение : " + min);
        System.out.println("Среднее значение" + avg + "");


    }
}