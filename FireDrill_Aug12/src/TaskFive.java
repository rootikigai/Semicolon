import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        for (int index = 0; index < 10; index++) {
            System.out.print("Enter number " + (index + 1) + ": ");
            int score = input.nextInt();
            if(score % 2 == 0) {
                sum += score;
            }
            count = count + 1;
        }
        System.out.println("The sum of even scores is " + sum);
    }
}
