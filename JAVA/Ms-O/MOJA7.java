/*PSEUDOCODE:
import Scanner
declare class
invoke the main method
prompt user to enter first integer
prompt them for second integer
Inititalize a variable named sum and assign value of the addition of the two integers
Initialize another variable named product and assign value of the product of the two integers
Initialize a
*/








import java.util.Scanner;

public class MOJA7{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter First Number(Integers only): ");
		int firstNum = input.nextInt();

		System.out.print("Enter Second Number(Integers only): ");
		int secondNum = input.nextInt();

		int sum = (firstNum + secondNum);
		int product = (firstNum * secondNum);
		int average = (sum / 2);
		int distance = (firstNum - secondNum);

		System.out.printf("Sum of the two integers: %d%n", sum);
		System.out.printf("Product of the two integers: %d%n", product);
		System.out.printf("Average of the two integers: %d%n", average);
		System.out.printf("Distance between the two integers: %d%n", distance);

		if(firstNum > secondNum){
			System.out.printf("Max integer: %d%n", firstNum);
		}
		else{
			System.out.printf("Max integer: %d%n", secondNum);
		}

		if(firstNum < secondNum){
			System.out.printf("Min integer: %d%n", firstNum);
		}
		else{
			System.out.printf("Min integer: %d%n", secondNum);
		}
  }
}
