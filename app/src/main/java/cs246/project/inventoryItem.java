package cs246.project;

import java.util.Vector;
import java.util.stream.Stream;

class InventoryItem extends Vector<inventoryData> {

    private String item;
    private int amt;
    private int limit;

    //TODO: Setup an item limit

    /**
     * Inventory Object
     *
     * Used for one item and its quantity in the inventory
     *
     * @param item Name of item
     * @param amt amount of item
     * @author Zach Zendejas
     *
     */
    public InventoryItem(String item, int amt, int limit) {
        this.item = item;
        this.amt = amt;
        this.limit = limit;
    }

    /**
     * Set inventory amount
     *
     * Sets the amount for an item
     * @param amt amount for item
     * @author Zach Zendejas
     *
     */
    public void setAmt(int amt) {
        this.amt = amt;
    }

    /**
     * Set Inventory Item
     *
     * Sets the name of the item to be added to the inventory
     * @param item name of item
     * @author Zach Zendejas
     *
     */
    public void setItem(String item) {
        this.item = item;
    }

    public void setLimit(int limit){
        this.limit = limit;
    }
    /**
     * Get Amount
     *
     * Returns the amount of the item
     * @return returns item amount
     */
    public int getAmt() {
        return amt;
    }

    /**
     * get Item
     *
     * Returns the item name
     * @return returns item name
     */
    public String getItem() {
        return item;
    }

    public int getLmt() { return limit; }

    @Override
    public Stream<inventoryData> stream() {
        return null;
    }
}
