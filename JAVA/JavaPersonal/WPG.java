import java.util.Scanner;

public class WPG{
	public static void main(String[] args){

    Scanner takeYears = new Scanner(System.in);
    
    System.out.print("Enter the number of years: ");
    double years = takeYears.nextDouble();
	
		double currWorldPop = 8200000000.00;
		double growthRate = (0.9 / 100);

		double newWorldPop = currWorldPop * (Math.pow((1 + growthRate),(years)));

		System.out.printf("The estimated world population in %.0f years is %.0f people %n", years, newWorldPop);

	}
}
