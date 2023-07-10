package az.atlacademy.lesson17;

import az.atlacademy.lesson16.Student;

import java.util.Comparator;

public class Comperator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        if (p1.getName() != p2.getName()) {
            p1.getName().compareTo(p2.getName());
        } else if (p1.getAge() != p2.getAge()) {
            return Integer.compare(p1.getAge(), p2.getAge());
        }
        return Double.compare(p2.getSalary(), p1.getSalary());
    }
}
