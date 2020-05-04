import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your input: ");
        // String text = input.nextLine();
        int aValue = input.nextInt();
        // double aDouble = input.nextDouble();

        System.out.println("Your input is: " + aValue);
    }
}