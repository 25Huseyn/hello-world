package az.atlacademy.lesson22_p2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RandomApp {
    public static void main(String[] args) {
        List<Integer> numbers = readNumbersFromFile();

        System.out.println("Reading numbers from file:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    private static List<Integer> readNumbersFromFile() {
        List<Integer> numbers = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("numbers.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);
                numbers.add(number);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

        return numbers;
    }
}
