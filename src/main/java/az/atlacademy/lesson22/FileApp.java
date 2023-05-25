package az.atlacademy.lesson22;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class FileApp {
    public static final String RESOURCE ="src/main/java/az/atlacademy/lesson22/RESOURCE/";
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = (int) (Math.random() * 101);
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter( RESOURCE + "numbers.txt"))) {
            for (int num : numbers) {
                writer.write(String.valueOf(num));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("----------");
        try {
            Files.lines(Paths.get("numbers.txt"))
                    .mapToInt(Integer::parseInt)
                    .filter(num -> num % 2 == 0)
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
