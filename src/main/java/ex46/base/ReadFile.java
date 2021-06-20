package ex46.base;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright Marc-Anthony Cross
 */

public class ReadFile {
    public static List readFile() {
        List<String> input = new ArrayList<>();

        try {
            Scanner in = new Scanner(Paths.get("resources/exercise46_input.txt"));
            while (in.hasNext())
                input.add(in.next());
            return input;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
