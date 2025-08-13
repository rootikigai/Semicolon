import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        for (int index = 0; index < 10; index++) {
            System.out.print("Enter number " + (index + 1) + ": ");
            int score = input.nextInt();
            count++;
            if(count % 2 == 0) {
                sum += score;
            }
        }
        System.out.println("The sum of even indexes is " + sum);
    }
}
