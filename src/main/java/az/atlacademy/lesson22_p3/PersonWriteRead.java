package az.atlacademy.lesson22_p3;

import az.atlacademy.lesson22_p2.Student;

import java.io.*;

public class PersonWriteRead {

    public static final String RESOURCE = "src/main/java/az/atlacademy/lesson22_p3/resource/";

    public static void main(String[] args) {
        String studentsFile = RESOURCE + "persons.ser";
        Person person1 = new Person("John Smith", 30);
        Person person2 = new Person("Jane Doe", 25);
        String filePath = "persons.ser";
        try {
            FileOutputStream fos = new FileOutputStream(studentsFile);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream oos = new ObjectOutputStream(bos);

            oos.writeObject(person1);
            oos.writeObject(person2);
            oos.close();
            bos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fis = new FileInputStream(studentsFile);
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bis);

            Object object = ois.readObject();
            if (object instanceof Student) {
                Student student = (Student) object;
                System.out.println(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}

