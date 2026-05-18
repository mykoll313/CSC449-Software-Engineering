import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * FoodManager handles the refrigerator's digital food inventory.
 * It supports adding items, removing items, and returning the current food list.
 */
public class FoodManager {

    private final List<String> inventory = new ArrayList<>();

    public void addItem(String item) {
        if (item != null && !item.trim().isEmpty()) {
            inventory.add(item.trim());
        }
    }

    public void removeItem(String item) {
        if (item != null) {
            inventory.remove(item.trim());
        }
    }

    public List<String> getInventory() {
        return Collections.unmodifiableList(inventory);
    }
}
