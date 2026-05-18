import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Unit tests for the Food Display acceptance criteria:
 * Then a list or visual representation of food items is shown.
 */
public class FoodDisplayTest {

    private FoodManager foodManager;

    @BeforeEach
    void setUp() {
        foodManager = new FoodManager();
    }

    @Test
    void testDisplayFoodListWithItems() {
        foodManager.addItem("Milk");
        foodManager.addItem("Eggs");
        foodManager.addItem("Cheese");

        List<String> displayedFoodList = foodManager.getInventory();

        assertNotNull(displayedFoodList,
                "Food list should not be null.");

        assertEquals(3, displayedFoodList.size(),
                "Food list should display all items in the inventory.");

        assertTrue(displayedFoodList.contains("Milk"),
                "Food list should display Milk.");

        assertTrue(displayedFoodList.contains("Eggs"),
                "Food list should display Eggs.");

        assertTrue(displayedFoodList.contains("Cheese"),
                "Food list should display Cheese.");
    }

    @Test
    void testDisplayFoodListWhenEmpty() {
        List<String> displayedFoodList = foodManager.getInventory();

        assertNotNull(displayedFoodList,
                "Food list should not be null even when inventory is empty.");

        assertTrue(displayedFoodList.isEmpty(),
                "Food list should be empty when no food items are stored.");
    }
}
