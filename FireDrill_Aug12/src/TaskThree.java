import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int average = 0;
        for (int index = 0; index < 10; index++) {
            System.out.print("Enter number " + (index + 1) + ": ");
            sum += input.nextInt();
            count++;
        }
        average = sum / count;
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
    }
}
