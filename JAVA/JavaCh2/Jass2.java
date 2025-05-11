import java.util.Scanner;

public class Jass2{
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter investment amount: ");
		double invAmt = input.nextDouble();
		
		System.out.print("Enter annual interest rate in percentage: ");
		double annIntRate = input.nextDouble();
		
		System.out.print("Enter number of years: ");
		double years = input.nextDouble();
		
		double monIntRate = (annIntRate/100)/12;
		double futInvVal = invAmt * Math.pow ((1 + monIntRate), (years * 12));
		
		System.out.printf("Accumulated value is $%.2f%n", futInvVal);
	}
}
