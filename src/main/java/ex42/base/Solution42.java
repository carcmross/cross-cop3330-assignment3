package ex42.base;

import java.util.List;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright Marc-Anthony Cross
 */

public class Solution42 {
    public static void main(String[] args) {
        // read file to string list
        ReadFile reader = new ReadFile();
        List<String> input = reader.readFile();

        // create list of strings by separating input by commas
        StringBuilder builder = new StringBuilder();
        List<String> output = builder.formatStrings(input);

        // create table out of output and print to console
        PrintTable printer = new PrintTable();
        String table = printer.makeTable(output);
        System.out.print(table);

    }
}
