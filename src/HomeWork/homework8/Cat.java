package HomeWork.homework8;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Cat extends Animal{
    String eyesColor;

    public Cat(int animal_Id, String name, Calendar birthday, String eyesColor) {
        super(animal_Id, name, birthday);
        this.eyesColor = eyesColor;
    }

    @Override
    public void animal() {

    }

}
