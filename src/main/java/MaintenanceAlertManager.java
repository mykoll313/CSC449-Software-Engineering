public class MaintenanceAlertManager {

    public String getAlertMessage(String issueType) {
        if (issueType == null) {
            return "No maintenance alerts at this time.";
        }

        switch (issueType) {
            case "DOOR_OPEN":
                return "Alert: The fridge door is open. Close the door to keep food cold.";

            case "FILTER_CHANGE":
                return "Alert: The water filter needs attention. Replace the filter soon.";

            case "TEMP_PROBLEM":
                return "Alert: The fridge temperature is outside the safe range. Check the temperature setting.";

            case "NO_ISSUE":
            default:
                return "No maintenance alerts at this time.";
        }
    }
}
