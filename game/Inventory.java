import java.util.ArrayList;
import java.util.List;

/**
 * Inventory
 */
public class Inventory {
    private int inventoryMaxSize = 0;
    List<Item> inventory = new ArrayList<>();

    public Inventory(int size){
        this.inventoryMaxSize = size;
    }

    void addItem(Item item){
        if (inventory.size() <= inventoryMaxSize){
            inventory.add(item);
            System.out.println(item + " added to inventory");
        } else {
            System.out.println(item + " not to inventory");
        }
    }

    // lisada removeItem, showInventory
}