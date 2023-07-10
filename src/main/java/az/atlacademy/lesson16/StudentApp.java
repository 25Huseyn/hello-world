package az.atlacademy.lesson16;

import java.util.Arrays;

public class StudentApp {
    public static void main(String[] args) {
        Student[] students = {
                new Student(3, 98, "Student1"),
                new Student(2, 56, "Student2"),
                new Student(1, 56, "Student3"),
                new Student(4, 64, "Student3")
        };
        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
        System.out.println("==============");
        System.out.println(Arrays.toString(students));
        Arrays.sort(students, new Comperator());
        System.out.println(Arrays.toString(students));
    }
}
