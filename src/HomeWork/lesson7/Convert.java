package HomeWork.lesson7;

public class Convert {
    public static double convertKelvin() {
        double celsium = 20;
        double tK = (celsium + 273.15);
        return tK;


    }

    public static double convertFahrenheit() {
        double celsium = 20;
        double tF = 1.8 * celsium + 32;
        return tF;
    }
}
