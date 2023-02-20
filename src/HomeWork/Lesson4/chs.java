package HomeWork.Lesson4;

import java.util.Scanner;

public class chs {
    public static void main(String[] args) {

        boolean haveFive = false;
        int arr[] = {2, 11, 22, 33, 44, 55, 66, 77};
        Scanner search = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = search.nextInt();



        for (int j = 0; j < arr.length; j++)
            if (arr[j] == n)
                System.out.println("Число найдено!");
            else
                System.out.println("Число не найдено!");









    }


}
