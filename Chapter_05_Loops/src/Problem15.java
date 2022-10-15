/**
 * Write a program that prints out the ASCII character table from ! to ~. Display 10 characters per line.
 *
 * @author tknops
 */

public class Problem15 {

    public static void main(String[] args) {
        final char STARTING_CHAR = 33, ENDING_CHAR = 126;

        int newLine = 0;
        char ch = STARTING_CHAR;
        for (int i = 0; i <= ENDING_CHAR - STARTING_CHAR; i++) {
            System.out.printf("%c ", ch++); // Increments the character.

            // Adds newline after every 10 characters.
            newLine++;
            if (newLine == 10) {
                System.out.println();
                newLine = 0;
            }
        }
    }
}
