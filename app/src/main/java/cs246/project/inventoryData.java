package cs246.project;

import android.app.Activity;
import android.content.Context;
import android.os.Environment;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Vector;

public class inventoryData extends Activity {

    // the user's inventory
    private String userName;
    private File fInventory;
    private FileOutputStream outputStream;
    private Vector vInventory;

    /**
     * inventoryData
     *
     * Object that holds the inventory data and user information
     *
     * @param userName the username of the user
     * @author Zach Zendejas
     */
    public inventoryData(String userName, String filename){
        this.userName = userName;

        // create blank inventory
        filename = userName + ".Inventory";
        fInventory = new File(Environment.getDataDirectory(), filename);
    }

    /**
     * Add Item
     *
     * Add an item to the inventory vector to be saved to the inventory
     * @param item name of item
     * @param amt amount of the item
     * @author Zach Zendejas
     */
    public void addItem(String item, int amt, Vector vInventory){
       InventoryItem newItem = new InventoryItem(item, amt);
       vInventory.add(newItem);
    }

    /**
     * Remove Item
     *
     * Removes an item from the inventory
     * @param item item to be removed.
     * @author Zach Zendejas
     */
    public void removeItem(InventoryItem item, Vector vInventory){
        vInventory.remove(item);
    }

    private void save(Vector vInventory, String filename){
        // strigify
        Gson gson = new Gson();
        String json = gson.toJson(vInventory);

        // write file
        try{
            outputStream = openFileOutput(filename, Context.MODE_PRIVATE);
            outputStream.write(json.getBytes());
            outputStream.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public String load(String userName, String filename){
        String data;

        // attempt to load file
        try{
            data = new String(Files.readAllBytes(Paths.get(filename)));

            //Write data to vInventory
            Gson g = new Gson();
            vInventory = g.fromJson(data, InventoryItem.class);

        } catch (IOException e) {
            e.printStackTrace();
            data = "NULL";
        }

        return data;
    }
}
