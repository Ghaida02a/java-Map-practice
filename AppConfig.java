import java.util.HashMap;
import java.util.Map;

class AppConfig {
    public static void main(String[] args) {
        Map<String, String> mainConfig = new HashMap<>();
        mainConfig.put("mode", "offline");
        mainConfig.put("unknown1", "unknown1");

        Map<String, String> updatedConfig = new HashMap<>();
        updatedConfig.put("mode", "online");   // overrides offline
        updatedConfig.put("unknown2", "unknown2");

        System.out.println("Before Merge: " + mainConfig);

        AppConfig.mergeConfigurations(mainConfig, updatedConfig);
        //print the set after merging & updated values of the same Key
        System.out.println("After Merge: " + mainConfig);
    }

    /**
     * TO-DO: Merge 'updatedConfig' into 'mainConfig'.
     * If a key exists in both, the value from 'updatedConfig' should be used.
     \*
     * @param mainConfig The primary configuration map (will be modified).
     * @param updatedConfig The map with new or updated settings.
     */
    public static void mergeConfigurations(Map<String, String> mainConfig, Map<String, String> updatedConfig) {
        mainConfig.putAll(updatedConfig);
    }
}
