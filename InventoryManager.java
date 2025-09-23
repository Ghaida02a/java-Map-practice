import java.util.HashMap;
import java.util.Map;

class InventoryManager {
    public static void main(String[] args) {
        InventoryManager restockManager = new InventoryManager();
        System.out.println("Initial Inventory: " + restockManager.getInventory());

        // Restock some items
        restockManager.restockItem("Apples", 20);   // existing item 50 + 20 = 70
        restockManager.restockItem("Peaches", 35);  // new item = 35

        // Display updated inventory
        System.out.println("Updated Inventory: " + restockManager.getInventory());
    }
    private Map<String, Integer> inventory = new HashMap<>();

    public InventoryManager() {
        inventory.put("Apples", 50);
        inventory.put("Oranges", 30);
    }

    /**
     * TO-DO: Add 'quantityToAdd' to the stock of 'itemName'.
     * If 'itemName' doesn't exist, add it to the map with that quantity.
     \*
     * @param itemName The name of the item to restock.
     * @param quantityToAdd The number of items to add.
     */
    public void restockItem(String itemName, int quantityToAdd) {
        int currentItem = inventory.getOrDefault(itemName, 0);
        if (!inventory.containsKey(itemName)) {
            inventory.put(itemName, quantityToAdd);
        }
        else {
            inventory.put(itemName, currentItem + quantityToAdd);
        }
    }

    public Map<String, Integer> getInventory() {
        return inventory;
    }
}