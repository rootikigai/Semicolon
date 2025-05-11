//java program using do while loop that prompts user to enter a number. continue prompting till user enters a negative number. exit loop and print total sum of entered numbers excluding negative numbers.
import java.util.Scanner;

public class DoWhileSum{
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);

    int num = 0;
    int sum = 0;

    do{
      System.out.print("Enter a number (Enter a negative number to stop): ");
      num = input.nextInt();
        if(num >= 0){
          sum = sum + num;
        }
    }
    while(num > 0);

    System.out.println("The sum of all inputted numbers is: " + sum);
  }
}
