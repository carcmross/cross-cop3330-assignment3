package ex46.base;

import java.util.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright Marc-Anthony Cross
 */

public class HistogramMaker {
    public static String sortAndFormatHistogram(Map frequencies) {
        String outputString = "";
        List<Integer> counts = new ArrayList<>();
        int badger = (int) frequencies.get("badger");
        int mushroom = (int) frequencies.get("mushroom");
        int snake = (int) frequencies.get("snake");

        counts.add(badger);
        counts.add(mushroom);
        counts.add(snake);
        Collections.sort(counts);
        Collections.reverse(counts);

        for (int i = 0; i < counts.size(); i++) {
            if (counts.get(i) == badger) {
                outputString += String.format("%-10s", "badger:");
                for (int j = 0; j < badger; j++)
                    outputString += "*";
                outputString += "\n";
            }
            else if (counts.get(i) == mushroom) {
                outputString += String.format("%-10s", "mushroom:");
                for (int j = 0; j < mushroom; j++)
                    outputString += "*";
                outputString += "\n";
            }
            else if (counts.get(i) == snake) {
                outputString += String.format("%-10s", "snake:");
                for (int j = 0; j < snake; j++)
                    outputString += "*";
                outputString += "\n";
            }
        }

        return outputString;
    }
}
