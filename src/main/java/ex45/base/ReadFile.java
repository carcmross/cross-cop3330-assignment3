package ex45.base;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright Marc-Anthony Cross
 */

public class ReadFile {
    public static String readFile() {
        String input = "";

        try {
            Scanner in = new Scanner(Paths.get("resources/exercise45_input.txt"));
            while (in.hasNext()) {
                input += in.nextLine();
                if (in.hasNextLine())
                    input += "\n";
            }
            return input;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
