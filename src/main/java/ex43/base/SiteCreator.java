package ex43.base;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright Marc-Anthony Cross
 */

public class SiteCreator {
    public static boolean createSite(String siteName) {
        try {
            Files.createDirectories(Paths.get(String.format("website/%s", siteName)));
            System.out.println(String.format("Created ./website/%s", siteName));
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
