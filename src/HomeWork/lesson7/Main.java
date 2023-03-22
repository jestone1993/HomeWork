package HomeWork.lesson7;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Day[] days = Day.values();




        for (Day day : days)
        {
            System.out.println(day);
            if (day == Day.SUNDAY || day == Day.SATURDAY)
            {
                System.out.println("Выходной");
            }
            else
            {
                System.out.println("Рабочий");
            }
    }
    }
}



