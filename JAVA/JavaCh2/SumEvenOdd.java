//Write a program that reads a set of integers and then prints the sum of the even and odd integers

import java.util.Scanner;

public class SumEvenOdd{
	public static void main (String[] args){
		
		int sumEven = 0;
		int sumOdd = 0;
		
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter integers (to stop, enter 0): ");
	int number = input.nextInt();
	
	while (number != 0){
	  if (number%2 == 0){
	    sumEven += number;
	  }
	  else {
	    sumOdd += number;
	  }
	
	  System.out.print("Enter next integer (0 to stop): ");
	  number = input.nextInt();
  }
	
	System.out.printf("Sum of even numbers: %d%n", sumEven);
	System.out.printf("Sum of odd numbers: %d%n", sumOdd);
	}
}	
