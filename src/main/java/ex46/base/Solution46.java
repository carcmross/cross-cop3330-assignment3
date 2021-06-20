package ex46.base;

import java.util.List;
import java.util.Map;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright Marc-Anthony Cross
 */

public class Solution46 {
    public static void main(String[] args) {
        // read file
        ReadFile reader = new ReadFile();
        List<String> input = reader.readFile();

        // create map containing frequencies out of strings from file
        FrequencyCounter counter = new FrequencyCounter();
        Map<String, Integer> frequencies = counter.countWords(input);

        // sort map by frequency and turn into string
        HistogramMaker maker = new HistogramMaker();
        String outputString = maker.sortAndFormatHistogram(frequencies);

        // print string
        System.out.print(outputString);
    }
}
