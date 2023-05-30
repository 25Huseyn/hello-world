package az.atlacademy.lesson22_p3;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;

public class JsonApp {
    public static void main(String[] args) {
        Person person = new Person("Stuard", 34);
        try {
            XmlMapper xmlMapper = new XmlMapper();
            String personJson = xmlMapper.writeValueAsString(person);
            System.out.println(personJson);
        } catch (IOException e) {
            throw new RuntimeException();
        }
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String personJson = objectMapper.writeValueAsString(person);
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
