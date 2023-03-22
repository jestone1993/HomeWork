package HomeWork.homework8;

import java.util.Calendar;


import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Animal {
    int animal_Id;
    String name;
    Calendar birthday;

    public Animal(int animal_Id, String name, Calendar birthday) {
        this.animal_Id = animal_Id;
        this.name = name;
        this.birthday = birthday;
    }

    public abstract void animal();

}

