package ex42.base;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright Marc-Anthony Cross
 */

public class WriteFile {
    public static boolean createFile() {
        try {
            File myObj = new File("resources/exercise42_output.txt");
            if (myObj.createNewFile())
                return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean writeToFile(List output) {
        int size = output.size();
        try {
            FileWriter myWriter = new FileWriter("resources/exercise42_output.txt");
            myWriter.write(String.format("%-10s%-10s%-10s\n", "Last", "First", "Salary"));
            myWriter.write("--------------------------\n");
            for (int i = 0; i < size; i += 3) {
                myWriter.write(String.format("%-10s%-10s%-10s\n", output.get(i), output.get(i + 1), output.get(i + 2)));
            }
            myWriter.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
