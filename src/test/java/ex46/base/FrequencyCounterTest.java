package ex46.base;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright Marc-Anthony Cross
 */

class FrequencyCounterTest {

    @Test
    void countWords_returns_map_with_appropriate_integer_values() {
        FrequencyCounter counter = new FrequencyCounter();
        List<String> input = Arrays.asList("badger", "badger", "badger", "badger", "mushroom", "mushroom",
                "snake", "badger", "badger", "badger");
        Map<String, Integer> expected = new HashMap<>();
        expected.put("badger", 7);
        expected.put("mushroom", 2);
        expected.put("snake", 1);
        Map<String, Integer> actual = counter.countWords(input);
        assertEquals(expected, actual);
    }
}