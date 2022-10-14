import java.util.Scanner;

/**
 * Write a program that prompts the user to enter the number of students, including the student name and grade. Then
 * display the student with the highest score.
 *
 * @author tknops
 */

public class Problem8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Amount of students: ");
        int amountOfStudents = input.nextInt();

        System.out.println("\nEnter the sudent name and score seperated by a space!");

        double highestScore = 0;
        String highestName = "";
        for (int i = 1; i <= amountOfStudents; i++) {
            System.out.printf("Student %d: ", i);
            String currentStudent = input.next(); // Only scans up until there is a space (" ").
            double currentScore = input.nextDouble();

            if (currentScore > highestScore) { // If current user input is higher than the previous amount replace.
                highestScore = currentScore;
                highestName = currentStudent;
            }
        }

        System.out.printf("\nStudent with the highest score: %s: %.1f\n", highestName, highestScore);
    }
}
