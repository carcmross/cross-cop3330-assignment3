package ex45.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright Marc-Anthony Cross
 */

public class TextReplacer {
    public static String replaceWord(String input) {
        String toReplace = "utilize";
        String replaceWith = "use";
        String output = input.replace(toReplace, replaceWith);
        return output;
    }
}
