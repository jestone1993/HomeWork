package HomeWork.lesson7;

public class BaseConvert {
    public static void main(String[] args) {
        System.out.println("Кельвин " + convert());
        System.out.println("Фаренгейт " + convert1());


    }


    public static double convert() {
        double celsium = 20;
        double tK = (celsium + 273.15);
        return tK;


    }

    public static double convert1() {
        double celsium = 20;
        double tF = 1.8 * celsium + 32;
        return tF;
    }

}




