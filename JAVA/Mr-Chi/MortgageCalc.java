/*PseudoCode
Instantiate new scanner called input
Initialize variables: p, m, r and n (where they respectively mean Principal, Monthly payments value, Annual Interest Rate and Loan duration) and assign value 0
collect input for p
collect input for r
initialize constant variable monR (to store the monthly rate value) and assign value of rate in decimals divided by 12 months.
collect input for n
initialize constant variable monN (to store value for number of months in the number of years entered) and assign value of n multiplied by 12 months
check if rate inputted is 0 to avoid divisible by 0 error else, do the math.
build formula for the value of m: 
go back to the method body and declare variables num for numerator and denom for denominator
numerator: Principal value multiplied by monthly rate multiplied by the value of 1 + monthly rate raised to the power of the loan duration in months
denominator: the value of 1 + monthly rate raised to the power of the loan duration in months, all minus 1
outside the else statement, calculate for m: m is equal to num divided by denom
Display the value of m

*/
import java.util.Scanner;
public class MortgageCalc{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		double p = 0;
		double m = 0;
		double r = 0;
		int n = 0;
    double num = 0;
    double denom = 0;

		System.out.print("Enter exact amount to borrow: ");
		p = input.nextDouble();

		System.out.print("Enter the annual interest rate: ");
		r = input.nextDouble();
		double monR = (r / 100) / 12;//constant

		System.out.print("Enter loan duration in Years: ");
		n = input.nextInt();
    int monN = n * 12;//constant

    if(r == 0){
      m = p / monN;
    }
    else{
      num = (p * monR * Math.pow((1 + monR), monN));
      denom = (Math.pow(1 + monR, monN) - 1);
    }
		m = num / denom;
		System.out.printf("Your monthly mortgage repayment is %.2f\n", m);
	}
}
