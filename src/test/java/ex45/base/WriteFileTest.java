package ex45.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright Marc-Anthony Cross
 */

class WriteFileTest {

    @Test
    void createFile_returns_true_if_file_is_created() {
        WriteFile writer = new WriteFile();
        boolean expected = true;
        boolean actual = writer.createFile("exercise45_output.txt");
        assertEquals(expected, actual);
    }

    @Test
    void writeToFile_returns_true_if_output_is_written_to_file() {
        WriteFile writer = new WriteFile();
        String output = "One should never use the word \"use\" in writing. Use \"use\" instead.\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                "uses an IDE to write her Java programs\".";
        boolean expected = true;
        boolean actual = writer.writeToFile("exercise45_output.txt", output);
        assertEquals(expected, actual);
    }
}