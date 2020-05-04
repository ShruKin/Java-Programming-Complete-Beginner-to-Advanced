import java.util.Scanner;

public class switchStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // types supported: char, byte, short int and String

        System.out.println("Enter your instructions: ");
        String text = input.nextLine();

        switch (text) {
            case "run":
                System.out.println("Program is running");
                break;

            case "stop":
                System.out.println("Program is stopped");
                break;
            
            default:
                System.out.println("Instruction not recognized");
        }
    }
}