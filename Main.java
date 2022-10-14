/*
* This is the standard Main() class starting point.
*
* @author  Daria Bernice Calitis
* @version 11.0.16
* @since   2022-10-03
*/

// Imports
import java.util.Scanner;
/**
*  Main class.
*/
final class Main {
    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException.
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(final String[] args) {
        // Declaring classes.
        final Scanner scan = new Scanner(System.in);
        final MrCoxallStack stack = new MrCoxallStack();

        boolean continueLoop = true;

        String answer = "";

        while (continueLoop) {
            System.out.println("Enter 'q' to exit the loop.");
            System.out.print("Enter action: ");

            int num = 0;
            answer = scan.nextLine();
            
            switch (answer.toLowerCase()) {
                case "pop":
                    System.out.println(stack.popItem());
                    break;
                case "peek":
                    System.out.println(stack.peekItem());
                    break;
                case "push":
                    System.out.print("Enter a number: ");
                    num = scan.nextInt();
                    stack.pushItem(num);
                    break;
                case "clear":
                    stack.clearStack();
                    break;
                default:
                    if ("q".equals(answer)) {
                        continueLoop = false;
                    } else {
                        System.out.println("Enter a valid action.");
                    }

                    break;
            }

            System.out.println();
        }

        System.out.println("\nDone.");
    }
}

