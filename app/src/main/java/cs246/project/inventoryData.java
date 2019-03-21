package cs246.project;

import com.google.gson.Gson;

import java.util.Vector;

public class inventoryData {

    // the user's inventory
    private String userName;
    private Vector<InventoryItem> inventory;

    /**
     * inventoryData
     *
     * Object that holds the inventory data and user information
     *
     * @param userName the username of the user
     * @author Zach Zendejas
     */
    public inventoryData(String userName){
        this.userName = userName;
    }

    /**
     * Add Item
     *
     * Add an item to the inventory vector to be saved to the inventory
     * @param item name of item
     * @param amt amount of the item
     * @author Zach Zendejas
     */
    public void addItem(String item, int amt){
       InventoryItem newItem = new InventoryItem(item, amt);
       inventory.add(newItem);
    }

    /**
     * Remove Item
     *
     * Removes an item from the inventory
     * @param item item to be removed.
     * @author Zach Zendejas
     */
    public void removeItem(InventoryItem item){
        inventory.remove(item);
    }

    private void save(){
        // TODO: Create save method
        // here we will serialize the inventory object to a Json string and save it in shared preferences
    }

}
