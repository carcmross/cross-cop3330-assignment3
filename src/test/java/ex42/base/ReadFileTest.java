package ex42.base;

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
    void readFile_returns_true() {
        ReadFile reader = new ReadFile();
        List<String> expected = Arrays.asList("Ling,Mai,55900", "Johnson,Jim,56500", "Jones,Aaron,46000",
                                                "Jones,Chris,34500", "Swift,Geoffrey,14200", "Xiong,Fong,65000",
                                                    "Zarnecki,Sabrina,51500");
        List<String> actual = reader.readFile();
        assertEquals(expected, actual);
    }
}