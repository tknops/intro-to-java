import java.util.Scanner;

/**
 * Write a program that lets the user enter the loan period of years that displays the monthly and total
 * payments for each interest rate starting from 5% to 10%, with an increment of 1/4.
 */

public class Problem21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        int loanAmount = input.nextInt();
        System.out.print("Number of Years: ");
        int years = input.nextInt();

        System.out.printf("\n%-18s%-18s%-18s\n", "Interest Rate", "Monthly Payment", "Total Payment");

        double yearlyInterestRate = 5;
        while (yearlyInterestRate <= 10) {
            double monthlyInterestRate = yearlyInterestRate / 1200;
            double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, years * 12));
            double totalPayment = monthlyPayment * (years * 12);

            String whiteSpace = "            ";
            if (yearlyInterestRate >= 10) { // removes one space from the whitespace when interest rate reaches double digits.
                whiteSpace = "           ";
            }

            // Formatting output.
            System.out.printf("%.3f%%%s%-18.2f%-18.2f\n", yearlyInterestRate, whiteSpace, monthlyPayment, totalPayment);
            yearlyInterestRate += .25;
        }
    }
}
