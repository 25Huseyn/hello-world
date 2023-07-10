package az.atlacademy.lesson23_p2;

import java.lang.reflect.Field;

public class NewJsonApp {
    public static void main(String[] args) {
        Person person = new Person(1, "Huseyn", "Najafov", 73.3);
        System.out.println(person.getClass().getAnnotatedInterfaces());
        System.out.println(person.getClass().componentType());
        System.out.println(person.getClass().getPackageName());
        System.out.println(person.getClass().getDeclaredClasses());
        System.out.println(person.getClass().getFields());
        System.out.println(person.getClass().getNestHost());
        System.out.println(person.getClass().getEnclosingMethod());
        System.out.println(person.getClass().getConstructors());
    }
}
