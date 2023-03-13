package HomeWork.homework8;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Tiger extends Cat{
    String breed;


    public Tiger(int animal_Id, String name, Calendar birthday, String eyesColor, String breed) {
        super(animal_Id, name, birthday, eyesColor);
        this.breed = breed;

    }

    @Override
    public void animal() {
        super.animal();

    }
}
