package HomeWork.homework8;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Dog extends Animal{
    int weight;

    public Dog(int animal_Id, String name, Calendar birthday, int weight) {
        super(animal_Id, name, birthday);
        this.weight = weight;
    }

    @Override
    public void animal() {

    }
}
