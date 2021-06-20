package ex42.base;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright Marc-Anthony Cross
 */

class PrintTableTest {

    @Test
    void makeTable_returns_tabular_formatted_string() {
        PrintTable printer = new PrintTable();
        List<String> output = Arrays.asList("Ling", "Mai", "55900", "Johnson", "Jim", "56500", "Jones", "Aaron",
                "46000", "Jones", "Chris", "34500", "Swift", "Geoffrey", "14200",
                "Xiong", "Fong", "65000", "Zarnecki", "Sabrina", "51500");
        String expected = "";
        expected += String.format("%-10s%-10s%-10s\n", "Last", "First", "Salary");
        expected += "--------------------------\n";
        for (int i = 0; i < output.size(); i += 3) {
            expected += String.format("%-10s%-10s%-10s\n", output.get(i), output.get(i + 1), output.get(i + 2));
        }
        String actual = printer.makeTable(output);
        assertEquals(expected, actual);
    }
}