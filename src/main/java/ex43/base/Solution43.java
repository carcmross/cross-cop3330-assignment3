package ex43.base;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright Marc-Anthony Cross
 */

public class Solution43 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // ask for user input
        String siteName = getSite();
        String author = getAuthor();
        String js = addJS();
        String css = addCSS();

        // create directory with sitename
        SiteCreator sCreator = new SiteCreator();
        sCreator.createSite(siteName);
        // create html file inside of the directory
        FileCreator fiCreator = new FileCreator();
        fiCreator.createHTML(siteName);
        fiCreator.writeToHTML(siteName, author);
        // create js folder in the site directory if user inputted 'y'
        FolderCreator foCreator = new FolderCreator();
        if (js.equals("y"))
            foCreator.createFolder(siteName, "js");
        // create css folder in the site directory if user inputted 'y'
        if (css.equals("y"))
            foCreator.createFolder(siteName, "css");
    }

    public static String addCSS() {
        System.out.print("Do you want a folder for CSS? ");
        return in.nextLine();
    }

    public static String addJS() {
        System.out.print("Do you want a folder for JS? ");
        return in.nextLine();
    }

    public static String getAuthor() {
        System.out.print("Author: ");
        return in.nextLine();
    }

    public static String getSite() {
        System.out.print("Site name: ");
        return in.nextLine();
    }
}
