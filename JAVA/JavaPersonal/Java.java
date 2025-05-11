import java.util.Scanner;

public class Java{
  public static void main (String [] args){ 
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a number between 1 and 10: ");
    int number = input.nextInt();
    
    int square = (number * number);
    int cube = (number * number * number);
    
    if(number < 1 || number > 10){
    System.out.println("Error--Please enter a number between 1 and 10: ");
    
    }
    else {
      System.out.println("number  square  cube");
      System.out.printf("%d       ", number);
      System.out.printf("%d     ", square);
      System.out.printf("%d", cube);
      System.out.println(" ");
    }
  }
}
  
  /*(Largest and Smallest Integers) Write an application that reads five integers and determines
and prints the largest and smallest integers in the group. Use only the programming techniques you
learned in this chapter.
  */
