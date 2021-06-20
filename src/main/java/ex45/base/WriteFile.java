package ex45.base;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright Marc-Anthony Cross
 */

public class WriteFile {
    public static boolean createFile(String fileName) {
        try {
            Files.createFile(Paths.get(String.format("resources/%s", fileName)));
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean writeToFile(String fileName, String output) {
        try {
            FileWriter myWriter = new FileWriter(String.format("resources/%s", fileName));
            myWriter.write(output);
            myWriter.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
