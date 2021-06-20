package ex46.base;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright Marc-Anthony Cross
 */

class ReadFileTest {

    @Test
    void readFile_returns_input_file_as_list_of_strings() {
        ReadFile reader = new ReadFile();
        List<String> expected = Arrays.asList("badger", "badger", "badger", "badger", "mushroom", "mushroom",
                                                "snake", "badger", "badger", "badger");
        List<String> actual = reader.readFile();
        assertEquals(expected, actual);
    }
}