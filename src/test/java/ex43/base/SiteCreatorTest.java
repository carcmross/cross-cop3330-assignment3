package ex43.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright Marc-Anthony Cross
 */

class SiteCreatorTest {

    @Test
    void createSite_returns_true_if_site_directory_is_made() {
        SiteCreator sCreator = new SiteCreator();
        boolean expected = true;
        boolean actual = sCreator.createSite("awesomeco");
        assertEquals(expected, actual);
    }
}