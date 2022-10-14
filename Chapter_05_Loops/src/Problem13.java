/**
 * Find the largest n such that n^2 < 12000.
 *
 * @author tknops
 */

public class Problem13 {

    public static void main(String[] args) {
        final int GREATER_THAN = 12000;

        int n = 1, i = 2;
        while (Math.pow(n, i) < GREATER_THAN) {
            n++;
        }

        n--;
        System.out.println(n);
    }
}
