package az.atlacademy.oop;

import static az.atlacademy.oop.AnimalSpecies.DOG;
import static az.atlacademy.oop.ExtracurricularActivities.Sunday;

public class Main {
    public static void main(String[] args) {
        String[] habbits = getHabbits();
        //  Pet cat = new Pet( 5, DOG, "Rock", 75, habbits);
        Human mother = new Human("Jane ", "Karleone", 1977);
        Human father = new Human("Vito ", "Karleone", 1965);
        Human son = new Human("Michael", "Karleone", 2000, "Jane", Sunday);
        System.out.println(mother.toString());
        System.out.println(father.toString());
        System.out.println(son.toString());
    }

    private static String[] getHabbits() {
        return new String[]{"run", "eat", "sleep"};
    }
}
