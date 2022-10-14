/**
 * Write a program that displays all the numbers from 100 to 1000 that are divisible by 3 and 4. 10 numbers per line.
 *
 * @author tknops
 */

public class Problem10 {

    public static void main(String[] args) {
        final int ENDING_NUM = 1000;

        int newLine = 0;
        for (int i = 100; i <= ENDING_NUM; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
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
