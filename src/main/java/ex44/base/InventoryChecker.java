package ex44.base;

import java.util.List;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright Marc-Anthony Cross
 */

public class InventoryChecker{
    public static String searchForItem(List products, String item) {
        String outputString = "";
        for (int i = 0; i < products.size(); i++) {
            Products cur_prod = (Products) products.get(i);
            if (cur_prod.name.equals(item)) {
                outputString += String.format("Name: %s\n", cur_prod.name);
                outputString += String.format("Price: %s\n", cur_prod.price);
                outputString += String.format("Quantity: %s\n", cur_prod.quantity);
                return outputString;
            }
        }
        return "";
    }
}
