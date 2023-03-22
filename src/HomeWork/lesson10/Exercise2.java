package HomeWork.lesson10;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        System.out.print("Введите кол-во строк : ");

        Scanner in = new Scanner(System.in);
        int n = 0;

        n = in.nextInt();


        String[] s = new String[n];

        double middleLength = 0;

        System.out.println("Введите строки: ");

        for (int i = 0; i < n; ++i)


            middleLength += (s[i] = in.next()).length();


        middleLength /= n;


        for (String x : s)
            if (x.length() < middleLength) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Показана строка с длиной больше средней: ").append(x).append(" Длина сторк: ").append(x.length());
                System.out.println(stringBuilder);
            }

    }

}

