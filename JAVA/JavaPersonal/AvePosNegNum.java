import java.util.Scanner;

public class AvePosNegNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int totalSum = 0;
        int count = 0;

        while (true) {

            System.out.print("Enter a number (enter 0 to stop): ");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            if (number > 0) {
              positiveCount++;
            } 
            else if (number < 0) {
              negativeCount++;
            }

            totalSum += number;
            count++;
        }

        if (count > 0) {
            double average = (double) totalSum / count;
            System.out.println("Positive numbers: " + positiveCount);
            System.out.println("Negative numbers: " + negativeCount);
            System.out.println("Total sum: " + totalSum);
            System.out.printf("Average: %.2f\n", average);
        } else {
            System.out.println("No numbers were entered.");
        }
    }
}

