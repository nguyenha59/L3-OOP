package hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class GarbageCreator {
    public static void main(String[] args) {
        try {
            String filePath = "file.txt";
            byte[] fileBytes = Files.readAllBytes(Paths.get(filePath));
            long startTime = System.currentTimeMillis();

            String text = "";
            for (byte b : fileBytes) {
                text += (char) b;
            }
            long endTime = System.currentTimeMillis();

            System.out.println("Finished reading file using + operator!");
            System.out.println("Time taken: " + (endTime - startTime) + "ms");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


