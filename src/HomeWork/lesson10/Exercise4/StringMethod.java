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
        String str1 = str.join("/", "qwe", "ere", "x", "p").replace("qwe", "yyy").replace("ere", "yyy").replace("x", "y").replace("p", "y").toUpperCase();
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("4)Letters: " + stringBuilder.append(str1));
    }

    public static void onlyWordsY(String str) {
        String str1 = str.join("/", "qwe", "ere", "x", "p").replace("qwe", "yyy").replace("ere", "yyy").replace("x", "y").replace("p", "y");
        System.out.println("3)" + str1);

    }

    public static void replaceSubString1(String str) {
        String str1 = str.replace("qwe", "***");
        String str2 = str.replace("ere", "***");
        String str3 = str.replace("1x1p", "1*1*");
        str2.split("qwe", 3);
        System.out.println("2)" + str1.substring(0, 9) + str2.substring(9, 19) + str3.substring(19));
    }

    public static void search(String str) {
        System.out.println(str.toLowerCase().contains("abc"));


    }

    public static void checkStartWith(String str) {
        System.out.println(str.startsWith("555", 0));

    }

    public static void checkLastWith(String str) {
        System.out.println(str.endsWith("1a2b"));
    }
}

