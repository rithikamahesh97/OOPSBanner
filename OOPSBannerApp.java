/**
 * OOPSBannerApp
 * Displays OOPS banner using String.join() for better memory handling.
 *
 * @author Rithika Mahesh
 * @version 3.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(String.join(" ",
                "*****", "*****", "*****", "*****"));

        System.out.println(String.join(" ",
                "*", "   *", "*", "   *", "*", "   *", "*", "   *"));

        System.out.println(String.join(" ",
                "*", "   *", "*", "   *", "*", "   *", "*", "   *"));

        System.out.println(String.join(" ",
                "*", "   *", "*", "   *", "*****", "*****"));

        System.out.println(String.join(" ",
                "*", "   *", "*", "   *", "*", "", "*"));

        System.out.println(String.join(" ",
                "*", "   *", "*", "   *", "*", "", "*"));

        System.out.println(String.join(" ",
                "*****", "*****", "*", "", "*****"));
    }
}