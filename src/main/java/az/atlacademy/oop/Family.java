package az.atlacademy.oop;

public class Family {

    public static void main(String[] args) {
        String[] habits = new String[]{"eat", "drink", "sleep"};
        Pet dog = new Pet(3, "Dalmatian", "Rex", 49, habits);
        Human mother = new Human("Jane", "Karleone", 1983);
        Human father = new Human("Vate", "Karleone", 1976);
        Human child = new Human("Michael", "Karleone", 2001, mother, father);
        System.out.println(mother.toString());
        System.out.println(father.toString());
        System.out.println(child.toString());

    }
}
