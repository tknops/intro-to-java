/**
 * Display four patters using loops. Use nested loops to display the following patterns.
 *
 * @author tknops
 */

public class Problem18 {

    public static void main(String[] args) {
        final int LENGTH = 6;

        // Pattern A
        for (int i = 1; i <= LENGTH; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        // Pattern B
        for (int i = LENGTH; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        // Pattern C
        for (int i = 1; i <= LENGTH; i++) {
            for (int k = 0; k < LENGTH - i; k++) {
                System.out.print("  ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        // Pattern D
        for (int i = LENGTH; i >= 1; i--) {
            for (int k = 0; k < LENGTH - i; k++) {
                System.out.print("  ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
