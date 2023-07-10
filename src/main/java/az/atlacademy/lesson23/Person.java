package az.atlacademy.lesson23;

import java.io.Serializable;
import java.time.LocalDate;

public class Person implements Serializable {
    public static final long serialVersionUID = 41;
    public final int id;
    public final String name;
    public final String surname;
    public transient LocalDate localDate;

    public Person(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return String.format("Person{id=%d, name='%s'}", id, name);
    }
}
