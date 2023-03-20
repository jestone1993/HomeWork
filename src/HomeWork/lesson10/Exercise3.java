package HomeWork.lesson10;

import java.util.Scanner;

public class Exercise3 {


    public static void main(String[] args) {
        System.out.println("Введите строки: ");
        Scanner scanner = new Scanner(System.in);
        String st1 = scanner.nextLine();
        String st2 = scanner.nextLine();
        String st3 = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(st3).append(" ").append(st2.toUpperCase()).append(" ").append(" ").append(st1.toLowerCase());
        System.out.println(stringBuilder);


    }

}

