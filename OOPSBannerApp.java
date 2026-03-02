/**
 * OOPSBannerApp
 * UC6: Modular banner using helper methods for O, P, S.
 *
 * @author Rithika Mahesh
 * @version 6.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] letterO = buildO();
        String[] letterP = buildP();
        String[] letterS = buildS();

        // Combine letters row by row
        for (int i = 0; i < letterO.length; i++) {
            System.out.println(
                    letterO[i] + " " +
                    letterO[i] + " " +
                    letterP[i] + " " +
                    letterS[i]
            );
        }
    }

    // Helper method for O
    public static String[] buildO() {
        return new String[]{
                "*****",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*****"
        };
    }

    // Helper method for P
    public static String[] buildP() {
        return new String[]{
                "*****",
                "*   *",
                "*   *",
                "*****",
                "*",
                "*",
                "*"
        };
    }

    // Helper method for S
    public static String[] buildS() {
        return new String[]{
                "*****",
                "*",
                "*",
                "*****",
                "    *",
                "    *",
                "*****"
        };
    }
}
