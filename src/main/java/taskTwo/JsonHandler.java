package taskTwo;

import org.json.JSONArray;
import org.json.JSONObject;


import java.io.FileWriter;
import java.io.IOException;


public class JsonHandler {

    static JSONObject item = new JSONObject();
    static JSONArray items = new JSONArray();


    public static void addItemDetails(String itemName, String itemPrice) {
        item.put("itemName", itemName);
        item.put("itemPrice", itemPrice);
        items.put(item);
        System.out.println(item.get("itemName"));
        System.out.println(item.get("itemPrice"));
    }

    public static void writeItemsDetailsOnJsonFile() {
        try (FileWriter file = new FileWriter("ItemDetails.json")) {
            file.write(items.toString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

