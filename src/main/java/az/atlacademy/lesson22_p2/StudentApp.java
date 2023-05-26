package az.atlacademy.lesson22_p2;
import java.io.*;
public class StudentApp {

    public static void main(String[] args) {
        Student student1 = new Student("John Smith", 20, 23.4);
        Student student2 = new Student("Jane Doe", 22, 34.2);
        String filePath = "students.ser";

        try (FileOutputStream fileOut = new FileOutputStream(filePath);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(student1);
            objectOut.writeObject(student2);
            System.out.println("Students serialized and written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred during serialization: " + e.getMessage());
        }
        try (FileInputStream fileIn = new FileInputStream(filePath);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            System.out.println("Reading students from the file:");
            while (true) {
                try {
                    Student student = (Student) objectIn.readObject();
                    System.out.println(student);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred during deserialization: " + e.getMessage());
        }
    }
}
