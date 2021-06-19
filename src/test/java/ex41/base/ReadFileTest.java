package ex41.base;

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
    void readFileAsInput_returns_strings_correctly() {
        ReadFile fr = new ReadFile();
        List<String> expected = Arrays.asList("Ling, Mai", "Johnson, Jim", "Zarnecki, Sabrina", "Jones, Chris",
                                                "Jones, Aaron", "Swift, Geoffrey", "Xiong, Fong");
        List<String> actual = fr.readFileAsInput();
        assertEquals(expected, actual);
    }
}