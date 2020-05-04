public class str {
    public static void main(String[] args) {
        int aNumber = 9;
        double aDouble = 9.5;

        String text = "Hi";
        String blank = " ";
        String moreText = "there";
        String hiThere = text + blank + moreText;

        System.out.println(text);
        System.out.println(text + blank + moreText);
        System.out.println(text + "." + moreText);
        System.out.println(hiThere);

        System.out.println("My Number: " + aNumber + ", " + aDouble);
        System.out.println("My another Number " + (aNumber + aDouble));
    }
}