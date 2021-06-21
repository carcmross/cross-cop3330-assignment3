package ex44.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
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

        for (int i = 0; i < 3; i++) {
            Products prod = new Products();
            if (i == 0) {
                prod.name = "Widget";
                prod.price = "25.00";
                prod.quantity = "5";
            }
            if (i == 1) {
                prod.name = "Thing";
                prod.price = "15.00";
                prod.quantity = "5";
            }
            if (i == 2) {
                prod.name = "Doodad";
                prod.price = "5.00";
                prod.quantity = "10";
            }
            expected.add(prod);
        }
        List<Products> actual = reader.readFile();
        assertEquals(expected.toString(), actual.toString());
    }
}