package ex41.base;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright Marc-Anthony Cross
 */

class SorterTest {

    @Test
    void sortList_returns_a_sorted_list() {
        Sorter s = new Sorter();
        List<String> input = Arrays.asList("Ling, Mai", "Johnson, Jim", "Zarnecki, Sabrina", "Jones, Chris",
                "Jones, Aaron", "Swift, Geoffrey", "Xiong, Fong");
        List<String> expected = Arrays.asList("Johnson, Jim", "Jones, Aaron", "Jones, Chris", "Ling, Mai",
                                                "Swift, Geoffrey", "Xiong, Fong", "Zarnecki, Sabrina");
        List<String> actual = s.sortList(input);
        assertEquals(expected, actual);
    }
}