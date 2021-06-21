package ex44.base;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright Marc-Anthony Cross
 */

public class ReadFile {
    public static List readFile() {
        Gson gson = new Gson();
        try {
            JsonReader jsonReader = new JsonReader(new FileReader("resources/exercise44_input.json"));
            JsonObject obj = gson.fromJson(jsonReader, JsonObject.class);
            JsonArray prod = obj.get("products").getAsJsonArray();
            List<Products> products = new ArrayList<>();

            for (int i = 0; i < prod.size(); i++) {
                Products p = new Products();
                p.name = prod.get(i).getAsJsonObject().get("name").toString();
                p.name = p.name.replace("\"", "");
                p.price = prod.get(i).getAsJsonObject().get("price").toString();
                p.price = p.price.replace("\"", "");
                p.quantity = prod.get(i).getAsJsonObject().get("quantity").toString();
                p.quantity = p.quantity.replace("\"", "");
                products.add(p);
            }
            return products;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
