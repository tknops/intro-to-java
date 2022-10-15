import java.util.Scanner;

/**
 * Write a program that calculates the greatest common divider of the user input. User input must be positive numbers.
 *
 * @author tknops
 */

public class Problem14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 2 positive numbers:");
        System.out.print("Number 1: ");
        int num1 = input.nextInt();
        System.out.print("Number 2: ");
        int num2 = input.nextInt();

        int greatestNum = Math.max(num1, num2);
        int greatestCommonDivider = 0;
        for (int i = 1; i < (greatestNum / 2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                greatestCommonDivider = i;
            }
        }

        System.out.printf("\nGCD: %d\n", greatestCommonDivider);
    }
}
