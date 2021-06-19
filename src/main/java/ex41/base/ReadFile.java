package ex41.base;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright Marc-Anthony Cross
 */

public class ReadFile {
    public static List readFileAsInput() {
        List<String> input = new ArrayList<>();

        try (Scanner in = new Scanner(Paths.get("resources/exercise41_input.txt"))) {
            while (in.hasNextLine())
                input.add(in.nextLine());
            return input;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
