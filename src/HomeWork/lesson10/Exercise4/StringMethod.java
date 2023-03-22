package HomeWork.lesson10.Exercise4;

import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StringMethod {
    public static void firstChars(String str) {
        char[] chars = new char[9];
        str.getChars(0, 5, chars, 0);
        str.getChars(9, 13, chars, 5);
        System.out.print("1)");
        System.out.println(chars);
    }

    public static void letters(String str) {
        String str1 = str.substring(5, 8);
        String str2 = str.substring(14, 17);
        String str3 = str.substring(19, 20);
        String str4 = str.substring(21, 22);
        String str5 = str.join("/", str1, str2, str3, str4);
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("4)Letters: " + stringBuilder.append(str5.toUpperCase()));

    }

    public static void onlyWordsY(String str) {
        String str1 = str.substring(5, 8);
        String str2 = str.substring(14, 17);
        String str3 = str.substring(19, 20);
        String str4 = str.substring(21, 22);
        String str5 = str.join("/", str1, str2, str3, str4);
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("3)" + stringBuilder.append(str5.toLowerCase()));

    }

    public static void replaceSubString1(String str) {
        String str3 = str.replace(str.substring(5, 8), "***").replace(str.substring(14, 17), "***");
        System.out.println("2)" + str3);
    }

    public static void search(String str) {
        if (str.toLowerCase().contains("abc")) {
            System.out.println("Найдено");
        } else {
            System.out.println("Не найдено");
        }


    }

    public static void checkStartWith(String str) {
        System.out.println(str.startsWith("555"));

    }

    public static void checkLastWith(String str) {
        System.out.println(str.endsWith("1a2b"));
    }
}

