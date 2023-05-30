package az.atlacademy.lesson23_p2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersonApp {
    public static final String RESOURCE = "src/main/java/az/atlacademy/lesson23_p2/resource/";
    public static void main(String[] args) {
        Person huseyn = new Person(1,"Huseyn","Najafov",73.3);
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String huseynJson = objectMapper.writeValueAsString(huseyn);
            System.out.println(huseynJson);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(RESOURCE + "person.ser")))) {
            byte[] bytes = new ObjectMapper().writeValueAsBytes(huseyn);
            oos.writeObject(bytes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
