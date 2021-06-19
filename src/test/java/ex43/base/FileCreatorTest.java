package ex43.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright Marc-Anthony Cross
 */

class FileCreatorTest {

    @Test
    void createHTML_returns_true_if_html_file_is_added() {
        FileCreator fCreator = new FileCreator();
        boolean expected = true;
        boolean actual = fCreator.createHTML("awesomeco");
        assertEquals(expected, actual);
    }

    @Test
    void writeToHTML_returns_true_if_output_is_written_to_file() {
        FileCreator fCreator = new FileCreator();
        boolean expected = true;
        boolean actual = fCreator.writeToHTML("awesomeco", "Max Power");
        assertEquals(expected, actual);
    }
}