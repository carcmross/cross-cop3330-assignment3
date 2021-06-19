package ex43.base;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright Marc-Anthony Cross
 */

public class FileCreator {
    public static boolean createHTML(String siteName) {
        try {
            Files.createFile(Paths.get(String.format("website/%s/index.html", siteName)));
            System.out.println(String.format("Created ./website/%s/index.html", siteName));
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean writeToHTML(String siteName, String author) {
        try {
            FileWriter myWriter = new FileWriter(String.format("website/%s/index.html", siteName));
            myWriter.write(String.format("<title>%s</title>\n", siteName));
            myWriter.write(String.format("<meta name=\"author\" content=\"%s\">\n", author));
            myWriter.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
