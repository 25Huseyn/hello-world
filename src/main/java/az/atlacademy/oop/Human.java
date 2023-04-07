package az.atlacademy.oop;

public class Human {
    private String name;
    private String surname;
    private int yaer;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;

    public void greetPet() {
        System.out.println("Hello," + pet);
    }

    public void describePet() {
        System.out.println("I have a" + pet.getSpecies() + ",he is" + pet.getAge() + "years old,he is very " + ((pet.getTricklevel() > 50) ? "sly" : "almost not sly"));
    }

    public String toString() {
        return "Human{name='" + name + "', surname='" + surname + "', year=" + yaer + ", iq=" + iq + ", mother=" + mother + ", father=" + father + ", " + "dog{nickname='" + pet.getNickname() + "', age=" + pet.getAge() + ", tricklevel=" + pet.getTricklevel() + ",habits=[" + pet.getHabits() + "]}";
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYaer() {
        return yaer;
    }

    public int getIq() {
        return iq;
    }

    public Pet getPet() {
        return pet;
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public Human() {

    }

    public Human(String name, String surname, int yaer) {
        this.name = name;
        this.surname = surname;
        this.yaer = yaer;
    }

    public Human(String name, String surname, int yaer, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.yaer = yaer;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int yaer, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.yaer = yaer;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }
}
