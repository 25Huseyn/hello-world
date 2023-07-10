package az.atlacademy.oop;

import java.util.Arrays;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int yaer;
    private int iq;
    private String[][] schedule;
    private Family family;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYaer() {
        return yaer;
    }

    public void setYaer(int yaer) {
        this.yaer = yaer;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public Human() {

    }

    public Human(String name, String surname, int yaer) {
        this.name = name;
        this.surname = surname;
        this.yaer = yaer;
    }

    public Human(String name, String surname, int yaer, String mother, ExtracurricularActivities father) {
        this.name = name;
        this.surname = surname;
        this.yaer = yaer;

    }

    public Human(String name, String surname, int yaer, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.yaer = yaer;
        this.iq = iq;
        this.schedule = schedule;
    }

    public void greetpet(Pet pet) {
        System.out.println("Hello, " + pet.getNickname() + "!");
    }

    @Override
    public String toString() {
        return "Human{name='%s', surname='%s', yaer=%d, iq=%d, schedule=%s}".formatted(name, surname, yaer, iq, Arrays.toString(schedule));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return yaer == human.yaer && iq == human.iq && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Arrays.equals(schedule, human.schedule) && Objects.equals(family, human.family);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, yaer, iq, family);
        result = 31 * result + Arrays.hashCode(schedule);
        return result;
    }
}
