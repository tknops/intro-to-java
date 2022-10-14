import java.util.Scanner;

/**
 * This problem is a continuation of the previous problem.
 *
 * Write a program that prompt the user to enter the amount of students, their name and their score. Then display the
 * names of the students with the lowest and second-lowest scores.
 *
 * @author tknops
 */

public class Problem9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Amount of students: ");
        int amountOfStudents = input.nextInt();

        System.out.println("\nEnter the sudent name and score seperated by a space!");

        double lowestScore = 10, secondLowestScore = 10;
        String lowestName = "", secondLowestName = "";
        for (int i = 1; i <= amountOfStudents; i++) {
            System.out.printf("Student %d: ", i);
            String currentStudent = input.next();
            double currentScore = input.nextDouble();

            // Swaps the previous lowest score with the second-lowest score and then sets the lowest score equals to the
            // new lowest score.
            if (currentScore < lowestScore) {
                secondLowestScore = lowestScore;
                lowestScore = currentScore;

                secondLowestName = lowestName;
                lowestName = currentStudent;
            }
        }

        System.out.printf("\nStudent with the lowest score: %s %.1f\n", lowestName, lowestScore);
        System.out.printf("Student with the second lowest score: %s %.1f\n", secondLowestName, secondLowestScore);
    }
}
