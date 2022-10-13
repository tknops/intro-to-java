import java.util.Scanner;

/**
 * Create a program that generates 10 random multiplication questions between 1 and 12. Display the correct count and
 * test time.
 *
 * @author tknops
 */

public class Problem2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int QUESTION_AMOUNT = 10;
        long startTime = System.currentTimeMillis(); // Starts time.
        String output = ""; // Setting starting output equal to an empty string.

        int correctUserAnswers = 0;
        for (int i = 0; i < QUESTION_AMOUNT; i++) {
            // Generating two random numbers between 1 and 12.
            int num1 = (int) (Math.random() * 12) + 1;
            int num2 = (int) (Math.random() * 12) + 1;

            // Asking the question
            System.out.printf("What is %d * %d? ", num1, num2);
            int userAnswer = input.nextInt();

            // Checks if the user answer was correct.
            int correctAnswer = num1 * num2;
            if (userAnswer == correctAnswer) {
                System.out.println("You are correct!\n");
                correctUserAnswers++;
            } else {
                System.out.println("Your answer is wrong.");
                System.out.printf("%d * %d shoud be %d\n\n", num1, num2, correctAnswer);
            }

            // Adds each question to final output.
            output += "\n" + num1 + " * " + num2 + " = " + userAnswer +
                      ((userAnswer == correctAnswer) ? " correct" : " wrong");
        }

        long endTime = System.currentTimeMillis(); // Ending time.
        long testTime = (endTime - startTime) / 1000;

        System.out.printf("Correct count is %d\n", correctUserAnswers);
        System.out.printf("Test time is %d seconds\n", testTime);
        System.out.println(output);
    }
}
