package ex45.base;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright Marc-Anthony Cross
 */

public class Solution45 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // ask user for name of the output file
        String outputfile = getFileName();

        // read file
        ReadFile reader = new ReadFile();
        String input = reader.readFile();

        // replace every instance of utilize with use
        TextReplacer replacer = new TextReplacer();
        String output = replacer.replaceWord(input);

        // output new string to file
        WriteFile writer = new WriteFile();
        writer.createFile(outputfile);
        writer.writeToFile(outputfile, output);
    }

    public static String getFileName() {
        System.out.print("What's the name of the output file? ");
        return in.nextLine();
    }
}
