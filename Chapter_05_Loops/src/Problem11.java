/**
 * Continuation of the previous problem.
 *
 * Write a program that displays all the numbers from 100 to 200, ten per line, that are divisible by 3 or 4, but not
 * both.
 *
 * @author tknops
 */

public class Problem11 {

    public static void main(String[] args) {
        final int ENDING_NUM = 200;

        int newLine = 0;
        for (int i = 100; i <= ENDING_NUM; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                if (i % 3 == 0 && i % 4 == 0) {
                    continue;
                }
                System.out.print(i + " ");
                newLine++;
                if (newLine == 10) { // Checks if 10 numbers have been printed on the same line, add a newline if true.
                    System.out.println();
                    newLine = 0;
                }
            }
        }
    }
}
