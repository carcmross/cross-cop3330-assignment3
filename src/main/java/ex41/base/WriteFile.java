package ex41.base;

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
            File myObj = new File("resources/exercise41_output.txt");
            if (myObj.createNewFile()) {
                return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean writeToFile(List output) {
        try {
            FileWriter myWriter = new FileWriter("resources/exercise41_output.txt");
            myWriter.write("Total of 7 names\n--------------------\n");
            for (int i = 0; i < output.size(); i++) {
                myWriter.write((String) output.get(i));
                myWriter.write("\n");
            }
            myWriter.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}