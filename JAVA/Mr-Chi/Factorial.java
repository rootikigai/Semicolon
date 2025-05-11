import java.util.Scanner;

public class Factorial{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);

	  int number = 0;
    long factorial = 1;

      System.out.print("Enter a non-negative number: ");
      number = input.nextInt();

    while(number < 0){     
        System.out.println("Invalid input");
        System.out.println("Enter a non-negative number: ");
          number = input.nextInt();
    }
    		int originalNum = number;

    while (number > 0){
        factorial = number * factorial;
          number--;
    }
    System.out.printf("The factorial of %d is %d%n", originalNum, factorial);
	}
}
