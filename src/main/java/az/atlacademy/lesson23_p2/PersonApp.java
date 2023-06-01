package az.atlacademy.lesson23_p2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PersonApp {
    public static final String RESOURCE = "src/main/java/az/atlacademy/lesson23_p2/resource/";
    public static final Path peopleFilePath = Paths.get(RESOURCE, "people.txt");

    public static void main(String[] args) {
        // create object
        final Person huseyn = new Person(1, "Huseyn", "Najafov", 73.3);
        System.out.println(huseyn);

        //serialize into Json data format
        final ObjectMapper objectMapper = new ObjectMapper();
        String huseynJson = "";
        try {
            huseynJson = objectMapper.writeValueAsString(huseyn);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println("huseynJson is:" + huseynJson);

        // write into a file
        try {
            Files.writeString(peopleFilePath, huseynJson);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // read from a file
        String aPersonJson = "";
        try {
            aPersonJson = Files.readString(peopleFilePath);
            System.out.println(aPersonJson);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // deserialize into a objet
        try {
            Person person = objectMapper.readValue(aPersonJson, new TypeReference<Person>() {
            });
            System.out.println(aPersonJson);
            System.out.println(person);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
