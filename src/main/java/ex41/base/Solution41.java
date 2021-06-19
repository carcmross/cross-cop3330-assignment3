package ex41.base;

import java.util.List;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright Marc-Anthony Cross
 */

public class Solution41 {
    public static void main(String[] args) {
        // read file
        ReadFile reader = new ReadFile();

        // make list out of strings from file
        List<String> input = reader.readFileAsInput();

        // sort last names of people
        Sorter s = new Sorter();
        List<String> sortedList = s.sortList(input);

        // write sorted list to file
        WriteFile writer = new WriteFile();
        writer.createFile();
        writer.writeToFile(sortedList);
    }
}
