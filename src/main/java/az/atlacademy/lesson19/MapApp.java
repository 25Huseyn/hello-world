package az.atlacademy.lesson19;

import java.util.HashMap;

public class MapApp {
    public static void main(String[] args) {
        HashMap<String, String> students = new HashMap<>();
        students.put("14", "Elvin");
        students.put("2", "Elvin");
        students.put("34", "Nahid");
        students.put("2", "Rasul");
        students.put("3", "Samir");
        System.out.println(students);
        System.out.println(students.isEmpty());
        System.out.println(students.replace("3", "Samir", "Kimse"));
        System.out.println(students.remove("3"));
        students.clear();
        System.out.println(students);
        HashMap<String, String> students1 = new HashMap<>();
        students1.put("42", "Abbas");
        students1.put("6", "Elvin");
        students1.put("4", "Ali");
        students1.put("2", "Rasul");
        students1.put("5", "Samir");
        System.out.println(students1);
        students1.putAll(students);
        System.out.println(students1);
        System.out.println(students1.containsValue("Samir"));
    }
}
