package ex42.base;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright Marc-Anthony Cross
 */

class WriteFileTest {

    @Test
    void createFile_returns_true_after_creating_file() {
        WriteFile writer = new WriteFile();
        boolean expected = true;
        boolean actual = writer.createFile();
        assertEquals(expected, actual);
    }

    @Test
    void writeToFile_returns_true_after_writing_to_file() {
        WriteFile writer = new WriteFile();
        List<String> output = Arrays.asList("Ling", "Mai", "55900", "Johnson", "Jim", "56500", "Jones", "Aaron",
                "46000", "Jones", "Chris", "34500", "Swift", "Geoffrey", "14200",
                "Xiong", "Fong", "65000", "Zarnecki", "Sabrina", "51500");
        boolean expected = true;
        boolean actual = writer.writeToFile(output);
        assertEquals(expected, actual);
    }
}