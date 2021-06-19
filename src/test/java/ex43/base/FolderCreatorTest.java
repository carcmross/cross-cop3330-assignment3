package ex43.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright Marc-Anthony Cross
 */

class FolderCreatorTest {

    @Test
    void createFolder_returns_true_if_folder_is_added() {
        FolderCreator foCreator = new FolderCreator();
        boolean expected = true;
        boolean actual = foCreator.createFolder("awesomeco", "js");
        assertEquals(expected, actual);
    }
}