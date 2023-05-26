package az.atlacademy.lesson22_p3;

import java.io.*;

public class PersonWriteRead {
    public static final String RESOURCE = "src/main/java/az/atlacademy/lesson22_p3/resource/";
    public static void main(String[] args) {
        Person person1 = new Person("John Smith", 30);
        Person person2 = new Person("Jane Doe", 25);
        String filePath = "persons.ser";


        try (BufferedWriter bw = new BufferedWriter(new FileWriter(RESOURCE + "persons.txt"));
                FileOutputStream fileOut = new FileOutputStream(filePath);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(person1);
            objectOut.writeObject(person2);
            System.out.println("Persons written to the file successfully.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileInputStream fileIn = new FileInputStream(filePath);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            System.out.println("Reading persons from the file:");
            while (true) {
                try {
                    Person person = (Person) objectIn.readObject();
                    System.out.println(person);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}

