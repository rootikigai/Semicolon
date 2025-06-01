import java.util.Scanner;
public class NumberCheck{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer to check: ");
		double number = input.nextDouble();

		if(number > 0){
			System.out.println(number + " is Positive!");
		}
		else if(number < 0){
			System.out.println(number + " is Negative!");
		}
		else{
			System.out.println(number + " is Zero!");
		}
	}
}
