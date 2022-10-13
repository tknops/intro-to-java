import java.util.Scanner;

/**
 * Write a program that prompts a student to enter a Java score. If the score is greater than or equal to 60, display that
 * you pass the exam. Else tell the student that they fail. Program end on user input of -1.
 *
 * @author tknops
 */

public class Problem1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your score: ");
            int score = input.nextInt();

            if (score == -1) { // Quits the program if input is equal to -1.
                break;
            } else if (score >= 60) {
                System.out.println("You pass the exam");
            } else {
                System.out.println("You don't pass the exam");
            }
        }
    }
}