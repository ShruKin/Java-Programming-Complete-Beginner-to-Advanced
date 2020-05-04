public class ifStatement {
    public static void main(final String[] args) {
        final boolean comparison = 3 < 2;
        final boolean notEquals = 3 != 4;
        final boolean equals = 5 == 4;

        System.out.println(comparison);
        System.out.println(notEquals);
        System.out.println(equals);

        int number = 10;
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        int amount = 0;

        while (true) {
            System.out.println("In the loop");

            if (amount == 6) {
                break;
            }
            amount++;
            System.out.println("Out of the loop");
        }
    }
}