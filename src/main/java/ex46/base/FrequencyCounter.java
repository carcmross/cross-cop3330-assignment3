package ex46.base;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright Marc-Anthony Cross
 */

public class FrequencyCounter {
    public static Map countWords(List input) {
        Map<String, Integer> frequencies = new HashMap<>();
        frequencies.put("badger", 0);
        frequencies.put("mushroom", 0);
        frequencies.put("snake", 0);
        int size = input.size();

        for (int i = 0; i < size; i++) {
            String cur_word = (String) input.get(i);
            frequencies.put(cur_word, frequencies.get(cur_word) + 1);
        }

        return frequencies;
    }
}
