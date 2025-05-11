import java.util.Scanner;

public class MOJA2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter First Number(Integers only): ");
		int firstNumber = input.nextInt();

		System.out.print("Enter Second Number(Integers only): ");
		int secondNumber = input.nextInt();

		System.out.print("Enter Third Number(Integers only): ");
		int thirdNumber = input.nextInt();

		if (secondNumber > firstNumber && thirdNumber > secondNumber){
		System.out.println("The result is: true");
		}
		else{
		System.out.println("");
		}
	}
}
