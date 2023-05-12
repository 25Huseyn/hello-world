package az.atlacademy.lesson19;

import java.util.HashMap;

public class MapApp {
    public static void main(String[] args) {
        HashMap<String, String> students = new HashMap<>();
        students.put("14", "Elvin");
        students.put("2", "Elvin");
        students.put("2", "Elvin");
        students.put("2", "Rasul");
        students.put("3", "Samir");
        System.out.println(students);
        System.out.println(students.isEmpty());
        students.clear();
        System.out.println(students);
        students.replace("3","Samir","Kimse");
        System.out.println(students.remove("3"));

        HashMap<String, String> students1 = new HashMap<>();
        students.put("42", "Abbas");
        students.put("6", "Elvin");
        students.put("4", "Ali");
        students.put("2", "Rasul");
        students.put("5", "Samir");
        students.putAll(students1);
        System.out.println(students);
    }
}
