import java.util.Scanner;

public class DoWhileSum{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
    int reply;

    do{
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
		
		    System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int sum = (num1 + num2);
				System.out.println(sum + " is the sum of the numbers.");

      System.out.print("Would you like to perform the operation again? Press 1 for yes and 0 for no: ");
        reply = input.nextInt();        
 
			}
      while (reply == 1);
      
      System.out.println("Okay, you are done!");


	}
}
