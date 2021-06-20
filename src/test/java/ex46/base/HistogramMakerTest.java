package ex46.base;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright Marc-Anthony Cross
 */

class HistogramMakerTest {

    @Test
    void sortAndFormatHistogram_returns_sorted_string_with_proper_amount_of_asterisks_for_each_values() {
        HistogramMaker maker = new HistogramMaker();
        Map<String, Integer> frequencies = new HashMap<>();
        frequencies.put("snake", 1);
        frequencies.put("mushroom", 2);
        frequencies.put("badger", 7);
        String expected = String.format("%-10s", "badger:");
        expected += "*******\n";
        expected += String.format("%-10s", "mushroom:");
        expected += "**\n";
        expected += String.format("%-10s", "snake:");
        expected += "*\n";
        String actual = maker.sortAndFormatHistogram(frequencies);
        assertEquals(expected, actual);
    }
}