package az.atlacademy.lesson23_p2;

public class Person {
    public int id;
    public String name;
    public String surname;
    public double grade;

    public Person() {

    }

    public Person(int id, String name, String surname, double grade) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Person{id=%d, name='%s', surname='%s', grade=%s}".formatted(id, name, surname, grade);
    }
}
