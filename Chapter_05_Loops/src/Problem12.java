/**
 * Use a while loop to find the smallest int n such that n^3 is greater than 12000.
 *
 * @author tknops
 */

public class Problem12 {

    public static void main(String[] args) {
        final int GREATER_THAN = 12000;

        int n = 1, i = 3;
        while (Math.pow(n, i) < GREATER_THAN) {
            n++;
        }

        System.out.println(n);
    }
}
