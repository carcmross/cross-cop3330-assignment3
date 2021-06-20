package ex45.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright Marc-Anthony Cross
 */

class ReadFileTest {

    @Test
    void readFile_returns_string_as_seen_in_input_file() {
        ReadFile reader = new ReadFile();
        String expected = "One should never utilize the word \"utilize\" in writing. Use \"use\" instead.\n" +
                             "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                                "utilizes an IDE to write her Java programs\".";
        String actual = reader.readFile();
        assertEquals(expected, actual);
    }
}