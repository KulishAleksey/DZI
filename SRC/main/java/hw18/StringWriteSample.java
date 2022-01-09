package hw18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StringWriteSample {
    public static void main(String[] args) {
        String text = "This is text to be saved in file";

        try {
            Files.write(Paths.get("my-file.txt"), text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}