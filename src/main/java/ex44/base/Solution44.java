package ex44.base;

import java.util.List;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright Marc-Anthony Cross
 */

public class Solution44 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // read json file and turn input into product list
        ReadFile reader = new ReadFile();
        List<Products> products = reader.readFile();

        // ask user for product they'd like to find
        String wished_item = getItemName();

        // print out item info if item is found
        // keep asking for user input if item is not found
        InventoryChecker checker = new InventoryChecker();
        String outputString = checker.searchForItem(products, wished_item);
        while (outputString.equals("")) {
            System.out.println("Sorry, that product was not found in our inventory.");
            wished_item = getItemName();
            outputString = checker.searchForItem(products, wished_item);
        }
        System.out.println(outputString);
    }

    public static String getItemName() {
        System.out.print("What is the product name? ");
        return in.nextLine();
    }
}
