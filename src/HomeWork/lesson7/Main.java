package HomeWork.lesson7;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main monday = new Main(Day.MONDAY);
        monday.Examination();
        Main tuesday = new Main(Day.TUESDAY);
        tuesday.Examination();
        Main wednesday = new Main(Day.WEDNESDAY);
        wednesday.Examination();
        Main thursday = new Main(Day.THURSDAY);
        thursday.Examination();
        Main friday = new Main(Day.FRIDAY);
        friday.Examination();
        Main saturday = new Main(Day.SATURDAY);
        saturday.Examination();
        Main sunday = new Main(Day.SUNDAY);
        sunday.Examination();
        String name = "MONDAY";
      /*  Day day1 = Day.valueOf(name);
       System.out.println(Day.valueOf(name));
        System.out.println(Arrays.toString(Day.values()));
*/
    }

    Day day;

    public Main(Day day) {
        this.day = day;
    }

    public void Examination() {
        switch (day) {
            case MONDAY -> System.out.println(Day.MONDAY + " " + "Рабочий день");
            case TUESDAY -> System.out.println(Day.TUESDAY + " " + "Рабочий день");
            case WEDNESDAY -> System.out.println(Day.WEDNESDAY + " " + "Рабочий день");
            case THURSDAY -> System.out.println(Day.THURSDAY + " " + "Рабочий день");
            case FRIDAY -> System.out.println(Day.FRIDAY + " " + "Рабочий день");
            case SATURDAY -> System.out.println(Day.SATURDAY + " " + "Выходной день");
            case SUNDAY -> System.out.println(Day.SUNDAY + " " + "Выходной день");
        }

    }


}



