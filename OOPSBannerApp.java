/**
 * OOPSBannerApp
 * UC7: Object-Oriented banner using CharacterPatternMap class.
 *
 * @author Rithika Mahesh
 * @version 7.0
 */

import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Create pattern map
        Map<Character, CharacterPatternMap> patternMap = initializePatterns();

        String word = "OOPS";

        // Render banner row by row
        for (int row = 0; row < 7; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : word.toCharArray()) {
                CharacterPatternMap pattern = patternMap.get(ch);
                lineBuilder.append(pattern.getPattern()[row]).append(" ");
            }

            System.out.println(lineBuilder.toString());
        }
    }

    // Initialize all supported character patterns
    private static Map<Character, CharacterPatternMap> initializePatterns() {

        Map<Character, CharacterPatternMap> map = new HashMap<>();

        map.put('O', new CharacterPatternMap('O', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*****"
        }));

        map.put('P', new CharacterPatternMap('P', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*****",
                "*",
                "*",
                "*"
        }));

        map.put('S', new CharacterPatternMap('S', new String[]{
                "*****",
                "*",
                "*",
                "*****",
                "    *",
                "    *",
                "*****"
        }));

        return map;
    }

    // Static Inner Class
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }
}
