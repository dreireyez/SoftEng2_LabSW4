import java.util.HashMap;
import java.util.Map;

public class TelcoAllowance implements UsagePromo {
    
    private static Map<String, String> allowanceMap = new HashMap<>();

        static {
            allowanceMap.put("Smart", "15 GB for ₱500 per month");
            allowanceMap.put("Globe", "10 GB for ₱450 per month");
            allowanceMap.put("Ditto","8 GB for ₱400 per month");
        }

    @Override
    public String showAllowance(String telcoName, double money) {
        return allowanceMap.getOrDefault(telcoName, "Unknown");
    }
}