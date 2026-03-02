public class UC2 {

    public static void main(String[] args) {

        String topBottom = String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*");

        String line1 = String.join(" ", "*", "O", "O", "P", "P", "S", "S", "*");
        String line2 = String.join(" ", "*", "O", "O", "P", "P", "S", " ", "*");
        String line3 = String.join(" ", "*", "O", "O", "P", "P", "S", "S", "*");

        System.out.println(topBottom);
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(topBottom);
    }
}