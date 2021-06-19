package ex42.base;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright Marc-Anthony Cross
 */

class StringBuilderTest {

    @Test
    void formatStrings_returns_first_and_last_names_and_salary_separated_in_list() {
        StringBuilder builder = new StringBuilder();
        List<String> input = Arrays.asList("Ling,Mai,55900", "Johnson,Jim,56500", "Jones,Aaron,46000",
                "Jones,Chris,34500", "Swift,Geoffrey,14200", "Xiong,Fong,65000",
                "Zarnecki,Sabrina,51500");
        List<String> expected = Arrays.asList("Ling", "Mai", "55900", "Johnson", "Jim", "56500", "Jones", "Aaron",
                                                "46000", "Jones", "Chris", "34500", "Swift", "Geoffrey", "14200",
                                                    "Xiong", "Fong", "65000", "Zarnecki", "Sabrina", "51500");
        List<String> actual = builder.formatStrings(input);
        assertEquals(expected, actual);
    }
}