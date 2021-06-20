package ex45.base;

import org.junit.jupiter.api.Test;
import org.w3c.dom.Text;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright Marc-Anthony Cross
 */

class TextReplacerTest {

    @Test
    void replaceWord_returns_string_with_words_replaced() {
        TextReplacer replacer = new TextReplacer();
        String input = "One should never utilize the word \"utilize\" in writing. Use \"use\" instead.\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                "utilizes an IDE to write her Java programs\".";
        String expected = "One should never use the word \"use\" in writing. Use \"use\" instead.\n" +
                            "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                                "uses an IDE to write her Java programs\".";
        String actual = replacer.replaceWord(input);
        assertEquals(expected, actual);
    }
}