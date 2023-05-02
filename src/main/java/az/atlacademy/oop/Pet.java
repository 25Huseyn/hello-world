package az.atlacademy.oop;

import java.util.Arrays;

public abstract class Pet {
    private int age;
    private String species;
    private String nickname;
    private int tricklevel;
    private String[] habits;

    public void eat() {
        System.out.println("I am eating");
    }

    public abstract void respond();

    public void foul() {
        System.out.println("I need to cover it up");
    }

    public int getAge() {
        return age;
    }

    public String getNickname() {
        return nickname;
    }

    public int getTricklevel() {
        return tricklevel;
    }

    public String getSpecies() {
        return species;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setTricklevel(int tricklevel) {
        this.tricklevel = tricklevel;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    @Override
    public String toString() {
        return "Pet{age=%d, species='%s', nickname='%s', tricklevel=%d, habits=%s}".formatted(age, species, nickname, tricklevel, Arrays.toString(habits));
    }

    public Pet(int age, String species, String nickname, int tricklevel, String[] habits) {
        this.age = age;
        this.species = species;
        this.nickname = nickname;
        this.tricklevel = tricklevel;
        this.habits = habits;
    }

    public Pet() {

    }

    public Pet(String nickname) {
        this.nickname = nickname;
    }
}
