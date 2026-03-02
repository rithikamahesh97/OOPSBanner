/**
 * OOPSBannerApp
 * UC8: Final version using HashMap for efficient
 * character pattern storage and retrieval.
 *
 * @author Rithika Mahesh
 * @version 8.0
 */

import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = initializePatternMap();

        String word = "OOPS";

        int bannerHeight = 7;

        for (int row = 0; row < bannerHeight; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    lineBuilder.append(pattern[row]).append(" ");
                }
            }

            System.out.println(lineBuilder.toString());
        }
    }

    // Centralized pattern storage
    private static Map<Character, String[]> initializePatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*****"
        });

        map.put('P', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*****",
                "*",
                "*",
                "*"
        });

        map.put('S', new String[]{
                "*****",
                "*",
                "*",
                "*****",
                "    *",
                "    *",
                "*****"
        });

        return map;
    }
}
