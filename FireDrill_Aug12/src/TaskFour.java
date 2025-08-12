import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int index = 0; index < 10; index++) {
            System.out.print("Enter number " + (index + 1) + ": ");
            if (index % 2 != 0){
                sum += input.nextInt();
            }
        }
        System.out.println("The sum of even is " + sum);
    }
}
