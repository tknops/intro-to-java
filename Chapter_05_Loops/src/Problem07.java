/**
 * Create a program that computes tuition in ten years worth of time and the total cost of 4 years of tuition after
 * 10 years time.
 *
 * @author tknops
 */

public class Problem07 {

    public static void main(String[] args) {
        final int STARTING_TUITION = 10000;
        final double INTEREST = 6;

        // Calculates the tuition after 10 years time.
        double tuitionAfterTen = STARTING_TUITION;
        for (int i = 0; i < 10; i++) {
            tuitionAfterTen += tuitionAfterTen * (INTEREST / 100);
        }

        double fourYearTuition = tuitionAfterTen;
        for (int i = 0; i < 4; i++) {
            fourYearTuition += fourYearTuition * (INTEREST / 100);
        }
        fourYearTuition -= tuitionAfterTen; // Subtracts 10 years off of the total.

        System.out.printf("Tuition after 10 years: %.2f\n", tuitionAfterTen);
        System.out.printf("4 Years worth of tuition after 10 years: %.2f\n", fourYearTuition);
    }
}
