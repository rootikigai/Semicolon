import java.util.Scanner;

public class NumPowNum{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int base = input.nextInt();

		System.out.print("Enter second number: ");
		int power = input.nextInt();

		int result = 1;
    int counter = 1;

		while(counter <= power){
			result = (result * base);
			counter++;
		}

		System.out.printf("%d raised to the power of %d is: %d%n", base, power, result);

  }
}
