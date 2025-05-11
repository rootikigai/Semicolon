import java.util.Scanner;
public class ArraysJohn{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    System.out.print("Enter a month number (1 to 12): ");
    int monthNumber = input.nextInt();
    System.out.println(months[monthNumber - 1]);

    int x = 30;
    int[] numbers = new int[x];
    x = 60;
    System.out.println(x);
    System.out.println(numbers.length);
  }
}
