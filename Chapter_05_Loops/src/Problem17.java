import java.util.Scanner;

/**
 * Write a program that prompts the user to enter an integer from 1 t o15 and displays a pyramid.
 *
 * input: 3
 * 3 2 1 2 3
 * 2 1 2
 * 1
 */

public class Problem17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int lines = input.nextInt();

        while (lines >= 1) {
            for (int i = lines; i >= 1; i--) { // Prints down to 1.
                System.out.print(i + " ");
            }

            for (int i = 2; i <= lines; i++) { // Prints up to amount of lines.
                System.out.print(i + " ");
            }

            System.out.println();
            lines--;
        }
    }
}
