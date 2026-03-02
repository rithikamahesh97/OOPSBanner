/**
 * OOPSBannerApp
 * UC5: Concise array declaration and initialization
 * using String.join() with enhanced for-loop.
 *
 * @author Rithika Mahesh
 * @version 5.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Combined declaration and initialization
        String[] banner = {

            String.join(" ", "*****", "*****", "*****", "*****"),

            String.join(" ", "*   *", "*   *", "*   *", "*   *"),

            String.join(" ", "*   *", "*   *", "*   *", "*   *"),

            String.join(" ", "*   *", "*   *", "*****", "*****"),

            String.join(" ", "*   *", "*   *", "*", "*"),

            String.join(" ", "*   *", "*   *", "*", "*"),

            String.join(" ", "*****", "*****", "*", "*****")
        };

        // Enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
