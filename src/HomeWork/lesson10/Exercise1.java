package HomeWork.lesson10;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int n;
        System.out.println("Введите: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            n = scanner.nextInt();
            Scanner scanner1 = new Scanner(System.in);
            String stringShort = null;
            String stringLong = null;
            for (int i = 0; i < n; i++) {
                System.out.println("Введите строку :" + (i + 1));
                String sb1 = scanner1.nextLine();
                if (i == 0) {
                    stringShort = sb1;

                } else if (stringShort.length() > sb1.length()) {
                    stringShort = sb1;

                }
                if (i == 0) {
                    stringLong = sb1;

                } else if (stringLong.length() < sb1.length()) {
                    stringLong = sb1;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Длина самой короткой строки: ").append(stringShort.length()).append(" Короткая строка: ").append(stringShort).append(" Длина самой длинной строки: ").append(stringLong.length()).append(" Длинная строка: ").append(stringLong);
            System.out.println(stringBuilder);


        }

    }
}
