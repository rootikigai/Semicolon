import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int countEven = 0;
        int average = 0;
        for (int index = 0; index < 10; index++) {
            System.out.print("Enter number " + (index + 1) + ": ");
            int score = input.nextInt();
            if(score % 2 == 0) {
                sum += score;
                countEven = countEven + 1;
            }
            count = count + 1;
        }
        average = sum / countEven;
        System.out.println("The average of even scores is: " + average);
    }
}
