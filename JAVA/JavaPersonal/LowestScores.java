import java.util.Scanner;

public class LowestScores {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        input.nextLine();

        String lowestName = "";
        String secondLowestName = "";
        double lowestScore = Double.MAX_VALUE;
        double secondLowestScore = Double.MAX_VALUE;


        for (int i = 0; i < numStudents; i++) {

            System.out.print("Enter student's name: ");
            String name = input.nextLine();

            System.out.print("Enter " + name + "'s score: ");
            double score = input.nextDouble();
            input.nextLine();

            if (score < lowestScore) {
                secondLowestScore = lowestScore;
                secondLowestName = lowestName;
                lowestScore = score;
                lowestName = name;
            } else if (score < secondLowestScore) {
                secondLowestScore = score;
                secondLowestName = name;
            }
        }

        System.out.println("\nThe two students with the lowest and second lowest scores:");
        System.out.println("1. " + lowestName + " with a score of " + lowestScore);
        System.out.println("2. " + secondLowestName + " with a score of " + secondLowestScore);
    }
}

