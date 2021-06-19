package ex42.base;

import java.util.ArrayList;
import java.util.List;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright Marc-Anthony Cross
 */

public class StringBuilder {
    public static List formatStrings(List input) {
        List<String> output = new ArrayList<>();
        String cur_string;

        for (int i = 0; i < input.size(); i++) {
            cur_string = (String) input.get(i);
            String[] string_arr = cur_string.split(",");
            for (int j = 0; j < string_arr.length; j++) {
                output.add(string_arr[j]);
            }
        }
        return output;
    }
}
