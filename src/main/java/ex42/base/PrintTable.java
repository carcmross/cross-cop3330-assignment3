package ex42.base;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright Marc-Anthony Cross
 */

public class PrintTable {
    public static String makeTable(List output) {
        int size = output.size();
        String table = "";
        table += String.format("%-10s%-10s%-10s\n", "Last", "First", "Salary");
        table += "--------------------------\n";
        for (int i = 0; i < size; i += 3) {
            table += String.format("%-10s%-10s%-10s\n", output.get(i), output.get(i + 1), output.get(i + 2));
        }
        return table;
    }
}
