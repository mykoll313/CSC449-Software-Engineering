import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaintenanceAlertTest {

    private MaintenanceAlertManager alertManager;

    @BeforeEach
    void setUp() {
        alertManager = new MaintenanceAlertManager();
    }

    /**
     * Test Case 1:
     * Verify that an alert appears when the fridge door is left open.
     */
    @Test
    void testDoorOpenAlertAppears() {
        String alertMessage = alertManager.getAlertMessage("DOOR_OPEN");

        assertNotNull(alertMessage,
                "An alert message should appear when the door is open.");

        assertTrue(alertMessage.contains("door"),
                "The alert should explain that the fridge door needs attention.");

        assertTrue(alertMessage.contains("Close"),
                "The alert should clearly explain that the user needs to close the door.");
    }

    /**
     * Test Case 2:
     * Verify that an alert appears when the water filter needs changing.
     */
    @Test
    void testFilterChangeAlertAppears() {
        String alertMessage = alertManager.getAlertMessage("FILTER_CHANGE");

        assertNotNull(alertMessage,
                "An alert message should appear when the filter needs changing.");

        assertTrue(alertMessage.contains("filter"),
                "The alert should explain that the filter needs attention.");

        assertTrue(alertMessage.contains("Replace"),
                "The alert should clearly explain that the user needs to replace the filter.");
    }

    /**
     * Test Case 3:
     * Verify that an alert appears when there is a temperature problem.
     */
    @Test
    void testTemperatureProblemAlertAppears() {
        String alertMessage = alertManager.getAlertMessage("TEMP_PROBLEM");

        assertNotNull(alertMessage,
                "An alert message should appear when there is a temperature problem.");

        assertTrue(alertMessage.contains("temperature"),
                "The alert should explain that there is a temperature issue.");

        assertTrue(alertMessage.contains("Check"),
                "The alert should clearly explain that the user needs to check the temperature setting.");
    }

    /**
     * Test Case 4:
     * Verify that no alert appears when no issue is detected.
     */
    @Test
    void testNoAlertWhenNoIssueDetected() {
        String alertMessage = alertManager.getAlertMessage("NO_ISSUE");

        assertEquals("No maintenance alerts at this time.", alertMessage,
                "The display should show that there are no alerts when no issue is detected.");
    }
}
