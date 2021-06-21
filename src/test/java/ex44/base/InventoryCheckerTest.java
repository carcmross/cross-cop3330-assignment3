package ex44.base;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright Marc-Anthony Cross
 */

class InventoryCheckerTest {

    @Test
    void searchForItem_returns_widget_info() {
        InventoryChecker checker = new InventoryChecker();
        List<Products> input = new ArrayList<>();
        Products prod1 = new Products();
        prod1.name = "Widget";
        prod1.price = "25.00";
        prod1.quantity = "5";
        input.add(prod1);
        Products prod2 = new Products();
        prod2.name = "Thing";
        prod2.price = "15.00";
        prod2.quantity = "5";
        input.add(prod2);
        Products prod3 = new Products();
        prod3.name = "Doodad";
        prod3.price = "5.00";
        prod3.quantity = "10";
        input.add(prod3);
        String expected = String.format("Name: %s\nPrice: %s\nQuantity: %s\n", "Widget", "25.00", "5");
        String actual = checker.searchForItem(input, "widget");
        assertEquals(expected, actual);
    }
}