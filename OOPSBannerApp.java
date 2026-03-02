/**
 * OOPSBannerApp
 * UC4: Displays OOPS banner using String array and loop.
 *
 * @author Rithika Mahesh
 * @version 4.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Store banner lines inside array
        String[] banner = {

            String.join(" ", "*****", "*****", "*****", "*****"),

            String.join(" ", "*   *", "*   *", "*   *", "*   *"),

            String.join(" ", "*   *", "*   *", "*   *", "*   *"),

            String.join(" ", "*   *", "*   *", "*****", "*****"),

            String.join(" ", "*   *", "*   *", "*", "*"),

            String.join(" ", "*   *", "*   *", "*", "*"),

            String.join(" ", "*****", "*****", "*", "*****")
        };

        // Loop through array and print
        for (String line : banner) {
            System.out.println(line);
        }
    }
}