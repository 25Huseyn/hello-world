package az.atlacademy.lesson20_p2;

import java.util.function.Predicate;

public class PersonApp {
    public static void main(String[] args) {
        Predicate<Person> check = new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                if (person.getName().length() > 5) {
                    return true;
                }
                return false;
            }
        };
    }
}