package ex44.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright Marc-Anthony Cross
 */

class ReadFileTest {

    @Test
    void readFile() {
        ReadFile reader = new ReadFile();
        List<Products> expected = new ArrayList<>();
        Products prod1 = new Products();
        prod1.name = "Widget";
        prod1.price = "25.00";
        prod1.quantity = "5";
        expected.add(prod1);
        Products prod2 = new Products();
        prod2.name = "Thing";
        prod2.price = "15.00";
        prod2.quantity = "5";
        expected.add(prod2);
        Products prod3 = new Products();
        prod3.name = "Doodad";
        prod3.price = "5.00";
        prod3.quantity = "10";
        expected.add(prod3);
        List<Products> actual = reader.readFile();
        assertSame(expected, actual);
    }
}